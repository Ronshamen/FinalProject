package PageObjects.nopComercePages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;

public class ShoppingCartPage
{
    @FindBy(how = How.XPATH, using = "//div[@class='page-title']/h1")
    public WebElement txt_cart_verify;

    @FindBy(how = How.XPATH, using = "//li[@id='topcartlink']/a/span[1]")
    public WebElement btn_cart;

    @FindBy(how = How.XPATH, using = "//div[@class='mini-shopping-cart']/div/input")
    public WebElement btn_goTo_cart;

    @FindBy(how = How.XPATH, using = "//button[@id=\"checkout\"]")
    public WebElement btn_check_out;

    @FindBy(how = How.XPATH, using = "//div[@id='terms-of-service-warning-box']/p")
    public WebElement pop_up_text;

    @FindBy(how = How.XPATH, using = "//button[@title='Close']")
    public WebElement pop_up_close;

    @FindBy(how = How.XPATH, using = "//input[@id=\"termsofservice\"]")
    public WebElement radio_accept_terms;

}
