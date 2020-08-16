package WorkFlows;

import Extentions.UIActions;
import ProjectUtilities.CommonOps;
import io.qameta.allure.Step;

public class ElectronFlow extends CommonOps
{
    @Step("Get Screen Resolution")
    public static void getScreenInfo()
    {
        UIActions.click(ElectronMain.btn_sys_info);
        UIActions.click(ElectronMain.btn_demo_toggle);
        UIActions.click(ElectronMain.btn_demo_toggle);
        UIActions.click(ElectronMain.btn_screen_info);

    }
}
