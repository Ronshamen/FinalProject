package ProjectUtilities;

import io.qameta.allure.Attachment;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.testng.ITestListener;
import org.testng.ITestContext ;
import org.testng.ITestResult ;
public class Listeners extends CommonOps implements ITestListener
{
        public void onFinish(ITestContext arg0) {
            System.out.println("-------------Ending Execution-----------");

        }

        public void onStart(ITestContext arg0) {
            System.out.println("-------------starting Execution-----------");

        }

        public void onTestFailedButWithinSuccessPercentage(ITestResult arg0) {
            // TODO Auto-generated method stub

        }

        public void onTestSuccess(ITestResult test) {
            System.out.println("--------test" + test.getName() + "passed--------");

        }

        public void onTestSkipped(ITestResult test) {
            System.out.println("--------skipping test" + test.getName() + "--------");

        }

        public void onTestStart(ITestResult test) {
            System.out.println("--------starting test" + test.getName() + "--------");

        }

        public void onTestFailure(ITestResult test) {
            System.out.println("--------test" + test.getName() + "passed--------");
            if(!Platform.equalsIgnoreCase("api"))
                saveScreenshot();
        }
        @Attachment(value = "Page screen-shot", type = "image/png")
        public byte[] saveScreenshot()
        {
            return ((TakesScreenshot)driver).getScreenshotAs(OutputType.BYTES);
        }
    }

