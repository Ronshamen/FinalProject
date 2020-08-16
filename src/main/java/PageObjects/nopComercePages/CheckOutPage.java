package PageObjects.nopComercePages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;

public class CheckOutPage
{
    @FindBy(how = How.XPATH, using = "//div[@class='page-title']/h1")
    public WebElement txt_CheckOut_verify;

   @FindBy(how = How.ID, using = "BillingNewAddress_FirstName")
   public WebElement input_firsN_verify;

   @FindBy(how = How.ID, using = "BillingNewAddress_LastName")
    public WebElement input_lastN_verify;

   @FindBy(how = How.ID, using = "BillingNewAddress_Email")
    public WebElement input_email_verify;

   @FindBy(how = How.ID, using = "BillingNewAddress_CountryId")
    public WebElement dropDown_country;

   @FindBy(how = How.ID, using = "BillingNewAddress_City")
    public WebElement input_city;

   @FindBy(how = How.ID, using = "BillingNewAddress_Address1")
   public WebElement input_address;

   @FindBy(how = How.ID, using = "BillingNewAddress_ZipPostalCode")
    public WebElement input_Zip;

   @FindBy(how = How.ID, using = "BillingNewAddress_PhoneNumber")
    public WebElement input_phone;

   @FindBy(how = How.XPATH, using = "//div[@id='billing-buttons-container']/input")
    public WebElement btn_continue;

   @FindBy(how = How.XPATH, using = "//input[@id='paymentmethod_1']")
    public WebElement btn_CC;

   @FindBy(how = How.XPATH, using = "//div[@id='payment-method-buttons-container']/input")
    public WebElement btn_continue2;

   @FindBy(how = How.XPATH, using = "//ul[@id='payment-method-block']/li[1]/div/div[2]/div")
    public WebElement txt_CC_Verify;

}
