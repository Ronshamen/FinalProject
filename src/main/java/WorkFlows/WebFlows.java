package WorkFlows;
import Extentions.UIActions;
import Extentions.Verifications;
import ProjectUtilities.CommonOps;
import io.qameta.allure.Step;

public class WebFlows extends CommonOps
{


    @Step("Register to nopCommerce Website")
    public static void Register()
    {
        UIActions.click(nopCommerceLogIn.btn_register);
        UIActions.Standby();
        UIActions.click(nopCommerceLogIn.btn_male);
        UIActions.UpdateTxt(nopCommerceLogIn.txt_UserFirstName, getData("UserFirst"));
        UIActions.UpdateTxt(nopCommerceLogIn.txt_UserLastName, getData("UserLast"));
        //-------BirthDate is irrelevant and can repeat in all tests-------------////
        UIActions.UpdateDropdown(nopCommerceLogIn.dropdown_date, "5");
        UIActions.UpdateDropdown(nopCommerceLogIn.dropdown_month, "May");
        UIActions.UpdateDropdown(nopCommerceLogIn.dropdown_year, "1995");
        UIActions.UpdateTxt(nopCommerceLogIn.txt_email, getData("E_mail"));
        UIActions.click(nopCommerceLogIn.cBox_Newsletter);
        UIActions.UpdateTxt(nopCommerceLogIn.txt_Password, getData("PassWord"));
        UIActions.UpdateTxt(nopCommerceLogIn.vrfy_Password, getData("PassWord"));
        UIActions.click(nopCommerceLogIn.btn_endRegister);
        UIActions.Standby();
        UIActions.click(nopCommerceLogIn.btn_Continue);

    }


    @Step("Make donation using song called If You Wait")
    public static void makeDonation()
    {
        UIActions.click(ifyouwait.btn_DigitalDownloads);
        Verifications.textOnPage(ifyouwait.txt_DigitalDownloads.getText(), getData("Page_Digital"));
        UIActions.Standby();
        UIActions.click(ifyouwait.btn_IfYouWait);
        Verifications.textOnPage(ifyouwait.txt_IfYouWait.getText(), getData("Page_IfYouWait"));
        UIActions.clearTextBox(ifyouwait.input_donation);
        UIActions.Standby();
        UIActions.UpdateTxt(ifyouwait.input_donation, getData("CorrectAmount"));
        UIActions.click(ifyouwait.btn_addToCart);
        UIActions.Standby();
    }

    @Step("Check out")
    public static void Checkout()
    {
        UIActions.Standby();
        UIActions.MouseHoverElements(shoppingCart.btn_cart, shoppingCart.btn_goTo_cart);
        Verifications.textOnPage(shoppingCart.txt_cart_verify.getText(), getData("Page_ShopCart"));
        UIActions.Standby();
        UIActions.click(shoppingCart.radio_accept_terms);
        UIActions.click(shoppingCart.btn_check_out);
        UIActions.Standby();
        Verifications.textOnPage(Checkout.txt_CheckOut_verify.getText(),getData("Page_CheckOut"));
        Verifications.textOnPage(Checkout.input_firsN_verify.getAttribute("value"), getData("UserFirst"));
        Verifications.textOnPage(Checkout.input_lastN_verify.getAttribute("value"), getData("UserLast"));
        Verifications.textOnPage(Checkout.input_email_verify.getAttribute("value"), getData("E_mail"));
        UIActions.UpdateDropdown(Checkout.dropDown_country, getData("Country"));
        UIActions.UpdateTxt(Checkout.input_city, getData("City"));
        UIActions.UpdateTxt(Checkout.input_address, getData("Address"));
        UIActions.UpdateTxt(Checkout.input_Zip, getData("Zip"));
        UIActions.UpdateTxt(Checkout.input_phone, getData("Phone"));
        UIActions.Standby();
    }

    @Step("Make payment")
    public static void MakePayment()
    {

        UIActions.click(Checkout.btn_continue);
        UIActions.Standby();
        UIActions.click(Checkout.btn_CC);
        UIActions.click(Checkout.btn_continue2);
        UIActions.Standby();
        UIActions.UpdateDropdown(payment.drpdwn_CCtype, getData("CardType"));
        UIActions.UpdateTxt(payment.Cardholder_name, getData("UserFirst") + " " + getData("UserLast"));
        UIActions.UpdateTxt(payment.Card_Number, getData("CardNo"));
        UIActions.UpdateDropdown(payment.drpdwn_exp_date, getData("ExpMonth"));
        UIActions.UpdateDropdown(payment.drpdwn_exp_year, getData("ExpYear"));
        UIActions.UpdateTxt(payment.input_CVV, getData("CVV"));
        UIActions.click(payment.btn_cont_CC);
        UIActions.Standby();
        UIActions.click(payment.btn_confirm);
    }

}
