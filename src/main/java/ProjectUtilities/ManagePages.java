package ProjectUtilities;


import org.openqa.selenium.support.PageFactory;

public class ManagePages extends Base
{
    public static void init()
    {
        nopCommerceLogIn = PageFactory.initElements(driver, PageObjects.nopComercePages.RegisterPage.class);
        nopCommerceMainPage = PageFactory.initElements(driver, PageObjects.nopComercePages.MainPage.class);
        nopCommerceComputerDrop = PageFactory.initElements(driver, PageObjects.nopComercePages.ComputerDropMenuPage.class);
        ifyouwait = PageFactory.initElements(driver, PageObjects.nopComercePages.DigitalDownloads.class);
        Checkout = PageFactory.initElements(driver, PageObjects.nopComercePages.CheckOutPage.class);
        payment = PageFactory.initElements(driver, PageObjects.nopComercePages.PaymentPage.class);
        shoppingCart = PageFactory.initElements(driver, PageObjects.nopComercePages.ShoppingCartPage.class);
        MortgageMain = PageFactory.initElements(driver, PageObjects.Mortgage.mainPage.class);
        ElectronMain = PageFactory.initElements(driver, PageObjects.ElectronDemo.MainPage.class);
        CalcMain = PageFactory.initElements(driver, PageObjects.Calculator.MainPage.class);

    }

}
