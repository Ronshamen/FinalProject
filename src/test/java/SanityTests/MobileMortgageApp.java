package SanityTests;

import Extentions.Verifications;
import ProjectUtilities.CommonOps;
import WorkFlows.MobileFlows;
import io.qameta.allure.Description;
import org.testng.annotations.Listeners;
import org.testng.annotations.Test;

@Listeners(ProjectUtilities.Listeners.class)
public class MobileMortgageApp extends CommonOps
{

    @Test(description = "Test01: Verify Mortgage")
    @Description("Calculate mortgage and verify amount")
    public void test01_verify_repayment()
    {
        MobileFlows.CalculateMortgage(getData("Mobile_Amount"), getData("Mobile_Term"), getData("Mobile_Rate"));
        Verifications.textInElement(MortgageMain.txt_repayment, getData("Mobile_Expct"));
    }
}
