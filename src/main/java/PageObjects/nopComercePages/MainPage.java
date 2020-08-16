package PageObjects.nopComercePages;


import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;

public class MainPage
{
    @FindBy(how = How.CSS, using = "a[class = 'ico-logout']")
    public WebElement txt_logOut;

    @FindBy(how = How.CSS, using = "img[src='https://demo.nopcommerce.com/Themes/DefaultClean/Content/images/logo.png']")
    public WebElement img_logo;
}
