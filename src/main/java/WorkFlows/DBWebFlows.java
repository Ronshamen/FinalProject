package WorkFlows;

import Extentions.DBActions;
import Extentions.UIActions;
import Extentions.Verifications;
import ProjectUtilities.CommonOps;
import io.qameta.allure.Step;

import java.util.List;

public class DBWebFlows extends CommonOps {

    @Step("Register to nopCommerce Website with DB Credentials")
    public static void RegisterDB()
    {
        List<String> cred = DBActions.getCredentials(getData("Cred_login_quarry"));
        UIActions.click(nopCommerceLogIn.btn_register);
        UIActions.click(nopCommerceLogIn.btn_male);
        UIActions.UpdateTxt(nopCommerceLogIn.txt_UserFirstName, cred.get(0));
        UIActions.UpdateTxt(nopCommerceLogIn.txt_UserLastName, cred.get(1));
        //-------BirthDate is irrelevant and can repeat in all tests-------------////
        UIActions.UpdateDropdown(nopCommerceLogIn.dropdown_date, "5");
        UIActions.UpdateDropdown(nopCommerceLogIn.dropdown_month, "May");
        UIActions.UpdateDropdown(nopCommerceLogIn.dropdown_year, "1995");
        UIActions.UpdateTxt(nopCommerceLogIn.txt_email, cred.get(2));
        UIActions.click(nopCommerceLogIn.cBox_Newsletter);
        UIActions.UpdateTxt(nopCommerceLogIn.txt_Password, cred.get(3));
        UIActions.UpdateTxt(nopCommerceLogIn.vrfy_Password, cred.get(3));
        UIActions.click(nopCommerceLogIn.btn_endRegister);
        UIActions.click(nopCommerceLogIn.btn_Continue);

    }

    @Step("Make donation using amounts from DB")
    public static void makeDonationDB()
    {
        List<String> cred = DBActions.getDonation(getData("Donation_quarry"));
        UIActions.click(ifyouwait.btn_DigitalDownloads);
        Verifications.textOnPage(ifyouwait.txt_DigitalDownloads.getText(), getData("Page_Digital"));
        UIActions.click(ifyouwait.btn_IfYouWait);
        Verifications.textOnPage(ifyouwait.txt_IfYouWait.getText(), getData("Page_IfYouWait"));
        UIActions.clearTextBox(ifyouwait.input_donation);
        UIActions.UpdateTxt(ifyouwait.input_donation, cred.get(0));
        UIActions.click(ifyouwait.btn_addToCart);
        Verifications.textInElement(ifyouwait.btn_cart, "(1)");
        UIActions.clearTextBox(ifyouwait.input_donation);
        UIActions.UpdateTxt(ifyouwait.input_donation, cred.get(1));
        UIActions.click(ifyouwait.btn_addCart_2nd);
        Verifications.textInElement(ifyouwait.btn_cart, "(2)");
        UIActions.clearTextBox(ifyouwait.input_donation);
        UIActions.UpdateTxt(ifyouwait.input_donation, cred.get(2));
        UIActions.click(ifyouwait.btn_addCart_2nd);
        Verifications.IsElementPresent(ifyouwait.Error_Notif);
        UIActions.clearTextBox(ifyouwait.input_donation);
        UIActions.UpdateTxt(ifyouwait.input_donation, cred.get(3));
        UIActions.click(ifyouwait.btn_addCart_2nd);

    }

    @Step("CheckOut using credentials from DB")
    public static void CheckoutDB()
    {
        List<String> cred = DBActions.getCredentials(getData("Cred_CheckOut_quarry"));
        UIActions.MouseHoverElements(shoppingCart.btn_cart, shoppingCart.btn_goTo_cart);
        Verifications.textOnPage(shoppingCart.txt_cart_verify.getText(), getData("Page_ShopCart"));
        UIActions.click(shoppingCart.radio_accept_terms);
        UIActions.click(shoppingCart.btn_check_out);
        Verifications.textOnPage(Checkout.txt_CheckOut_verify.getText(), getData("Page_CheckOut"));
        UIActions.UpdateDropdown(Checkout.dropDown_country, cred.get(0));
        UIActions.UpdateTxt(Checkout.input_city, cred.get(1));
        UIActions.UpdateTxt(Checkout.input_address, cred.get(2));
        UIActions.UpdateTxt(Checkout.input_Zip, cred.get(3));
        UIActions.UpdateTxt(Checkout.input_phone, cred.get(4));
        UIActions.click(Checkout.btn_continue);
    }

}