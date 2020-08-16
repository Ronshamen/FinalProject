package WorkFlows;

import Extentions.UIActions;
import ProjectUtilities.CommonOps;
import io.qameta.allure.Step;

public class MobileFlows extends CommonOps
{
    @Step("Fill in form and calculate repayment")
    public static void CalculateMortgage(String Amount, String Term, String Rate)
    {
        UIActions.UpdateTxt(MortgageMain.txt_amount, Amount);
        UIActions.UpdateTxt(MortgageMain.txt_Term, Term);
        UIActions.UpdateTxt(MortgageMain.txt_Rate, Rate);
        UIActions.click(MortgageMain.btn_Cal);

    }
}
