package PageObjects.nopComercePages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;

public class PaymentPage
{
    @FindBy(how = How.ID, using = "CreditCardType")
    public WebElement drpdwn_CCtype;

    @FindBy(how = How.ID, using = "CardholderName")
    public WebElement Cardholder_name;

    @FindBy(how = How.ID, using = "CardNumber")
    public WebElement Card_Number;

    @FindBy(how = How.ID, using = "ExpireMonth")
    public WebElement drpdwn_exp_date;

    @FindBy(how = How.ID, using = "ExpireYear")
    public WebElement drpdwn_exp_year;

    @FindBy(how = How.ID, using = "CardCode")
    public WebElement input_CVV;

    @FindBy(how = How.XPATH, using = "//div[@id='payment-info-buttons-container']/input")
    public WebElement btn_cont_CC;

    @FindBy(how = How.XPATH, using = "//div[@id='confirm-order-buttons-container']/input")
    public WebElement btn_confirm;

    @FindBy(how = How.XPATH, using = "//input[@value='Continue']")
    public WebElement btn_Continue_order_complete;

    @FindBy(how = How.XPATH, using = "//div[@class='section order-completed']/div/strong")
    public WebElement txt_order_success;
}
