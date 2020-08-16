package ProjectUtilities;

import PageObjects.nopComercePages.*;
import io.restassured.path.json.JsonPath;
import io.restassured.response.Response;
import io.restassured.specification.RequestSpecification;
import org.json.simple.JSONObject;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.remote.DesiredCapabilities;
import org.openqa.selenium.support.ui.WebDriverWait;
import ru.yandex.qatools.ashot.Screenshot;
import ru.yandex.qatools.ashot.comparison.ImageDiff;
import ru.yandex.qatools.ashot.comparison.ImageDiffer;

import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.Statement;

public class Base
{
    public static WebDriver driver;
    public static WebDriverWait wait;
    public static Actions action;
    public static Screenshot imageScreenShot;
    public static ImageDiffer imageDiff = new ImageDiffer();
    public static ImageDiff diff;


    public static DesiredCapabilities dc = new DesiredCapabilities();
    public static String Platform;




    public static RegisterPage nopCommerceLogIn;
    public static MainPage nopCommerceMainPage;
    public static ComputerDropMenuPage nopCommerceComputerDrop;
    public static DigitalDownloads ifyouwait;
    public static ShoppingCartPage shoppingCart;
    public static CheckOutPage Checkout;
    public static PaymentPage payment;

    public static PageObjects.Mortgage.mainPage MortgageMain;
    public static PageObjects.ElectronDemo.MainPage ElectronMain;

    public static RequestSpecification httpRequest;
    public static Response response;
    public static JSONObject requestParams = new JSONObject();
    public static JsonPath jp;

    public static PageObjects.Calculator.MainPage CalcMain;

    public static Connection Con;
    public static Statement Stmt;
    public static ResultSet rs;

}
