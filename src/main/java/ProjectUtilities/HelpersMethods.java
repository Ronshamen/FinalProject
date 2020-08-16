package ProjectUtilities;

import org.openqa.selenium.WebElement;
import ru.yandex.qatools.ashot.AShot;

import javax.imageio.ImageIO;
import java.io.File;
import java.io.IOException;

public class HelpersMethods extends CommonOps
{
    public static void takeElementScreenshot(WebElement ImageElement, String ImageName)
    {
        imageScreenShot = new AShot().takeScreenshot(driver, ImageElement);
        try {
            ImageIO.write(imageScreenShot.getImage(), "png", new File(getData("ImageRepo") + ImageName + ".png"));
        } catch (IOException e)
        {
            System.out.println("Error writing image, please see " + e);
        }

    }
}
