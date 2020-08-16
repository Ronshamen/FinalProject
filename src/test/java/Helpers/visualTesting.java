package Helpers;

import ProjectUtilities.CommonOps;
import ProjectUtilities.HelpersMethods;
import org.testng.annotations.Test;

public class visualTesting extends CommonOps
{
    @Test
    public void createScreenShot()
    {
        HelpersMethods.takeElementScreenshot(nopCommerceMainPage.img_logo, "nopCommerceLogo_V01");
    }


}
