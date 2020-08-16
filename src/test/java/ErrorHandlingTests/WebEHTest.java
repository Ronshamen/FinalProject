package ErrorHandlingTests;

import Extentions.UIActions;
import Extentions.Verifications;
import ProjectUtilities.CommonOps;
import WorkFlows.WebEerrorHandlingFlows;
import io.qameta.allure.Description;
import org.testng.annotations.Test;

public class WebEHTest extends CommonOps
{
    @Test(description = "Test01: Make donation using amount out of boundary")
    @Description("Description: Add donations to cart - lower or higher than allowed")
    public void test01_makeErrorInDonation()
    {
        WebEerrorHandlingFlows.error_Donation_low();
        Verifications.IsElementPresent(ifyouwait.Error_Notif);
        WebEerrorHandlingFlows.error_Donation_high();
        Verifications.IsElementPresent(ifyouwait.Error_Notif);
        WebEerrorHandlingFlows.Complete_Error_Donation();

    }

    @Test(description = "Test02: Check out w/out accepting term & conditions")
    @Description("Description: Click on check out w/out accepting T&C and verify text in alert window")
    public void test02_Alert_Window()
    {
        WebEerrorHandlingFlows.error_TermsAndCond();
        UIActions.Standby();
        UIActions.switchToWindow();
        Verifications.textInElement(shoppingCart.pop_up_text, "Please accept the terms of service before the next step.");
        UIActions.click(shoppingCart.pop_up_close);

    }

}
