package SanityTests;

import Extentions.UIActions;
import Extentions.Verifications;
import ProjectUtilities.CommonOps;
import WorkFlows.WebFlows;
import io.qameta.allure.Description;
import org.testng.annotations.Listeners;
import org.testng.annotations.Test;

@Listeners(ProjectUtilities.Listeners.class)
public class WebProjectTests extends CommonOps

{

    @Test(description = "Test01: Register to WebSite")
    @Description("Description: Register to nopCommerce Website, should show I am registered  to website")
    public void test01_Register()
    {
        WebFlows.Register();
        Verifications.textInElement(nopCommerceMainPage.txt_logOut, getData("Verify_Reg"));
    }


    @Test(description = "Test02: Make donation, should show 1 items in cart")
    @Description("Description: Add different donations to cart")
    public void test02_makeDonation()
    {
        WebFlows.makeDonation();
        Verifications.textInElement(ifyouwait.btn_cart, "(1)");
    }

    @Test(description = "Test03: Check Out")
    @Description("Description: Add billing, Credit Card info and make payment")
    public void test03_CheckOut()
    {
        WebFlows.Checkout();
        WebFlows.MakePayment();
        Verifications.textInElement(payment.txt_order_success, getData("Order_Complete"));
        UIActions.Standby();
        UIActions.click(payment.btn_Continue_order_complete);
    }

    @Test(description = "Test04: Verify Logo")
    @Description("Description: Verify Logo is the same in all versions")
    public void test04_verify_logo()
    {
        Verifications.visualElement(nopCommerceMainPage.img_logo, "nopCommerceLogo_V01");
    }

}
