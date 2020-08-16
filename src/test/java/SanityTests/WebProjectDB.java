package SanityTests;

import Extentions.Verifications;
import ProjectUtilities.CommonOps;
import WorkFlows.DBWebFlows;
import io.qameta.allure.Description;
import org.testng.annotations.Listeners;
import org.testng.annotations.Test;

@Listeners(ProjectUtilities.Listeners.class)
public class WebProjectDB extends CommonOps
{

    @Test(description = "Test01: Register to WebSite with DB")
    @Description("Description: Register to nopCommerce Website using credentials from DB, should show I am registered  to website")
    public void test01_RegisterWithDB()
    {
        DBWebFlows.RegisterDB();
        Verifications.textInElement(nopCommerceMainPage.txt_logOut, getData("Verify_Reg"));
    }


    @Test(description = "Test02: Make donation using sums from DB")
    @Description("Description: Add different donations to cart using amounts set on DB")
    public void test02_makeDonationWithDB()
    {
        DBWebFlows.makeDonationDB();
        Verifications.IsElementPresent(ifyouwait.Error_Notif);
    }

    @Test(description = "Test03: Check Out using DB")
    @Description("Description: Add billing info from DB and proceed to payment")
    public void test03_CheckOut()
    {
        DBWebFlows.CheckoutDB();
        Verifications.textInElement(Checkout.txt_CC_Verify, getData("Verify_txt_CCimg"));
    }

    @Test(description = "Test04: Verify Logo")
    @Description("Description: Verify Logo is the same in all versions")
    public void test04_verify_logo()
    {
        Verifications.visualElement(nopCommerceMainPage.img_logo, "nopCommerceLogo_V01");
    }


}
