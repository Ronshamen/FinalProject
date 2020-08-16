package ProjectUtilities;


import io.appium.java_client.remote.AndroidMobileCapabilityType;
import io.appium.java_client.remote.MobileCapabilityType;
import io.appium.java_client.windows.WindowsDriver;
import io.github.bonigarcia.wdm.WebDriverManager;
import io.restassured.RestAssured;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.ie.InternetExplorerDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.remote.RemoteWebDriver;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Parameters;
import org.w3c.dom.Document;

import javax.xml.parsers.DocumentBuilder;
import javax.xml.parsers.DocumentBuilderFactory;
import java.io.File;
import java.net.MalformedURLException;
import java.net.URL;
import java.util.concurrent.TimeUnit;
public class CommonOps extends Base
{
    public static String getData (String nodeName)
    {
        DocumentBuilder dBuilder;
        Document doc = null;
        File fXmlFile = new File("./Configuration/config.xml");
        DocumentBuilderFactory dbFactory = DocumentBuilderFactory.newInstance();
        try
        {
            dBuilder = dbFactory.newDocumentBuilder();
            doc = dBuilder.parse(fXmlFile);
        }
        catch(Exception e)
        {
            System.out.println("Exception in reading XML file: " + e);
        }
        doc.getDocumentElement().normalize();
        return doc.getElementsByTagName(nodeName).item(0).getTextContent();
    }
    public static void initBrowser(String browserType)
    {
        if (browserType.equalsIgnoreCase("Chrome"))
            driver = initChromeDriver();
        else if (browserType.equalsIgnoreCase("FireFox"))
            driver = initFFDriver();
        else if (browserType.equalsIgnoreCase("Ie"))
            driver = initIEDriver();
        else if (browserType.equalsIgnoreCase("Edge"))
            driver = initEdgeDriver();
        else
            throw new RuntimeException("invalid platform Type stated");
        driver.manage().window().maximize();
        driver.get(getData("url"));
        driver.manage().timeouts().implicitlyWait(Long.parseLong(getData("TimeOut")), TimeUnit.SECONDS);
        wait = new WebDriverWait(driver, Long.parseLong(getData("TimeOut")));
        action = new Actions(driver);



    }
    public static WebDriver initChromeDriver()
    {
        WebDriverManager.chromedriver().setup();
        return new ChromeDriver();
    }
    public static WebDriver initFFDriver()
    {
        WebDriverManager.firefoxdriver().setup();
        return new FirefoxDriver();
    }
    public static WebDriver initIEDriver()
    {
        WebDriverManager.iedriver().setup();
        return new InternetExplorerDriver();
    }
    public static WebDriver initEdgeDriver() {
        WebDriverManager.edgedriver().setup();
        return new EdgeDriver();
    }

    public static void initMobile()
    {
        dc.setCapability(MobileCapabilityType.UDID, getData("UDID"));
        dc.setCapability(AndroidMobileCapabilityType.APP_PACKAGE, getData("APP_PACKAGE"));
        dc.setCapability(AndroidMobileCapabilityType.APP_ACTIVITY, getData("APP_ACTIVITY"));
        try {
            driver = new RemoteWebDriver(new URL(getData("Appium_Server") + "/wd/hub"), dc);
        }
        catch (MalformedURLException e)
        {
            System.out.println("Cannot connect to Appium sever, see details: " + e);
        }
        driver.manage().timeouts().implicitlyWait(Long.parseLong(getData("TimeOut")), TimeUnit.SECONDS);

    }

    public static void initApi()
    {
        RestAssured.baseURI = getData("url_api");
        httpRequest = RestAssured.given().auth().preemptive().basic(getData("api_user"), getData("api_Password"));
    }

    public static void initElectron()
    {
        System.setProperty("webdriver.chrome.driver", getData("electronDriverPath"));
        ChromeOptions opt = new ChromeOptions();
        opt.setBinary(getData("electronAppPath"));
        dc.setCapability("chromeOptions", opt);
        dc.setBrowserName("chrome");
        driver = new ChromeDriver(dc);
        driver.manage().timeouts().implicitlyWait(Long.parseLong(getData("TimeOut")), TimeUnit.SECONDS);
    }

    public static void initDesktop()
    {
        dc.setCapability("app",getData("calculatorApp"));
        try {
            driver = new WindowsDriver(new  URL(getData("Appium_Server")), dc);
        }
        catch (MalformedURLException e)
        {
            System.out.println("Cannot connect to Appium sever, see details: " + e);
        }
        driver.manage().timeouts().implicitlyWait(Long.parseLong(getData("TimeOut")), TimeUnit.SECONDS);
    }


    @BeforeClass
    @Parameters({"PlatformName"})
    public void StartSession(String PlatformName)
    {
        Platform = PlatformName;
        if (Platform.equalsIgnoreCase("web"))
            initBrowser(getData("BrowserName"));
        else if (Platform.equalsIgnoreCase("mobile"))
            initMobile();
        else if (Platform.equalsIgnoreCase("api"))
            initApi();
        else if (Platform.equalsIgnoreCase("electron"))
            initElectron();
        else if (Platform.equalsIgnoreCase("desktop"))
            initDesktop();
        else
            throw new RuntimeException("Invalid Platform name");
         ManagePages.init();
         ManageDB.initConnection(getData("dbURL"), getData("dbuser"), getData("dbpass"));


    }

    @AfterMethod

    public void ReturnMainPage()
    {
        if(Platform.equalsIgnoreCase("web"))
        driver.get(getData("url"));
    }

    @AfterClass
    public void CloseSession()

    {
        ManageDB.CloseConnection();
        if(!Platform.equalsIgnoreCase("api"))
        driver.quit();
    }

}
