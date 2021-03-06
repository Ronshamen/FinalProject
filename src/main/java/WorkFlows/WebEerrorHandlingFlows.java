package WorkFlows;

import Extentions.UIActions;
import ProjectUtilities.CommonOps;
import io.qameta.allure.Step;

public class WebEerrorHandlingFlows extends CommonOps
{
    @Step("Make donation using amounts low out of boundary")
    public static void error_Donation_low()
    {
        UIActions.click(ifyouwait.btn_DigitalDownloads);
        UIActions.click(ifyouwait.btn_IfYouWait);
        UIActions.clearTextBox(ifyouwait.input_donation);
        UIActions.UpdateTxt(ifyouwait.input_donation, getData("LowAmount"));
        UIActions.click(ifyouwait.btn_addToCart);
    }

    @Step("Make donation using amounts low out of boundary")
    public static void error_Donation_high()
    {
        UIActions.clearTextBox(ifyouwait.input_donation);
        UIActions.UpdateTxt(ifyouwait.input_donation, getData("HighAmount"));
        UIActions.click(ifyouwait.btn_addCart_2nd);
    }

    @Step("Complete Donation")
    public static void Complete_Error_Donation()
    {
        UIActions.clearTextBox(ifyouwait.input_donation);
        UIActions.UpdateTxt(ifyouwait.input_donation, getData("CorrectAmount"));
        UIActions.Standby();
        UIActions.Standby();
        UIActions.click(ifyouwait.btn_addCart_2nd);
    }

    @Step("Don't accept terms & conditions ")
    public static void error_TermsAndCond()
    {
        UIActions.MouseHoverElements(shoppingCart.btn_cart, shoppingCart.btn_goTo_cart);
        UIActions.click(shoppingCart.btn_check_out);
    }
}
