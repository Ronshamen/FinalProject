package SanityTests;

import Extentions.Verifications;
import ProjectUtilities.CommonOps;
import WorkFlows.CalcFlow;
import io.qameta.allure.Description;
import org.testng.annotations.Listeners;
import org.testng.annotations.Test;

@Listeners(ProjectUtilities.Listeners.class)
public class DesktopCalculatorTest extends CommonOps
{
    @Test(description = "Test01: Verify addition command")
    @Description("Description: Make addition and verify result")
    public void test01_verify_addition()
    {
        CalcFlow.Calculate();
        String CalcResult = CalcMain.field_Result.getText().replace("Display is", "").trim();
        Verifications.textOnPage(CalcResult, "10");
    }
}
