package PageObjects.nopComercePages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;

public class DigitalDownloads
{
    @FindBy(how = How.XPATH, using = "//ul[@class='top-menu notmobile']/li[4]/a")
    public WebElement btn_DigitalDownloads;

    @FindBy(how = How.XPATH, using = "//div[@class='page-title']/h1")
    public WebElement txt_DigitalDownloads;

    @FindBy(how = How.XPATH, using = "//div[@data-productid='35']/div/a")
    public WebElement btn_IfYouWait;

    @FindBy(how = How.XPATH, using = "//div[@class='product-name']/h1")
    public WebElement txt_IfYouWait;

    @FindBy(how = How.CSS, using = "#addtocart_35_CustomerEnteredPrice")
    public WebElement input_donation;

    @FindBy(how = How.CSS, using = "input[class = 'button-1 add-to-cart-button']")
    public WebElement btn_addToCart;

    @FindBy(how = How.CSS, using = "input[class = 'button-1 add-to-cart-button valid']")
    public WebElement btn_addCart_2nd;

    @FindBy(how = How.XPATH, using = "//*[@id=\"topcartlink\"]/a/span[2]")
    public WebElement btn_cart;

    @FindBy(how = How.CSS, using = "#bar-notification > div > p")
    public static WebElement Error_Notif;




}
