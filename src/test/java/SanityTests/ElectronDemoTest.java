package SanityTests;

import Extentions.Verifications;
import ProjectUtilities.CommonOps;
import WorkFlows.ElectronFlow;
import io.qameta.allure.Description;
import org.testng.annotations.Listeners;
import org.testng.annotations.Test;

@Listeners(ProjectUtilities.Listeners.class)
public class ElectronDemoTest extends CommonOps
{
    @Test(description = "Test01: Verify Screen resolution")
    @Description("Get screen resolution from app and verify")
    public void test01_verify_resolution()
    {
        ElectronFlow.getScreenInfo();
        Verifications.textInElement(ElectronMain.field_screen_info, "Your screen is: 1536px x 864px");
    }
}
