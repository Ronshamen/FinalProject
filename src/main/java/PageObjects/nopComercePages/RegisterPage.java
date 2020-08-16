package PageObjects.nopComercePages;


import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;

public class RegisterPage
{
    @FindBy(how = How.CSS, using = "a[class = 'ico-register']")
    public WebElement btn_register;

    @FindBy(how = How.ID, using = "gender-male")
    public WebElement btn_male;

    @FindBy(how = How.ID, using = "FirstName")
    public WebElement txt_UserFirstName;

    @FindBy(how = How.NAME, using = "LastName")
    public WebElement txt_UserLastName;

    @FindBy(how = How.CSS, using = "select[name = 'DateOfBirthDay']")
    public WebElement dropdown_date;

    @FindBy(how = How.CSS, using = "select[name = 'DateOfBirthMonth']")
    public WebElement dropdown_month;

    @FindBy(how = How.CSS, using = "select[name = 'DateOfBirthYear']")
    public WebElement dropdown_year;

    @FindBy(how = How.CSS, using = "input[data-val-required= 'Email is required.']")
    public WebElement txt_email;

    @FindBy(how = How.CSS, using = "input[type = 'checkbox']")
    public WebElement cBox_Newsletter;

    @FindBy(how = How.CSS, using = "input[type = 'password']")
    public WebElement txt_Password;

    @FindBy(how = How.ID, using = "ConfirmPassword")
    public WebElement vrfy_Password;

    @FindBy(how = How.ID, using = "register-button")
    public WebElement btn_endRegister;

    @FindBy(how = How.CSS, using = "input[name = 'register-continue']")
    public WebElement btn_Continue;

}
