package WorkFlows;

import Extentions.UIActions;
import ProjectUtilities.CommonOps;
import io.qameta.allure.Step;

public class CalcFlow extends CommonOps
{
    @Step("Calculate addition")
    public static void Calculate()
    {
        UIActions.click(CalcMain.btn_clear);
        UIActions.click(CalcMain.btn_One);
        UIActions.click(CalcMain.btn_Plus);
        UIActions.click(CalcMain.btn_Nine);
        UIActions.click(CalcMain.btn_Equals);
    }
}
