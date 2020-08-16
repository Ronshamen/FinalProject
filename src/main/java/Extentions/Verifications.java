package Extentions;


import ProjectUtilities.CommonOps;
import io.qameta.allure.Step;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.testng.Assert;
import ru.yandex.qatools.ashot.AShot;
import ru.yandex.qatools.ashot.Screenshot;

import javax.imageio.ImageIO;
import java.awt.image.BufferedImage;
import java.io.File;
import java.io.IOException;

import static org.testng.Assert.assertEquals;
import static org.testng.Assert.assertFalse;

public class Verifications extends CommonOps
{

    @Step("Verify text in element is correct using WebElement")
    public static void textInElement(WebElement elem, String expectedValue)
    {
        if(Platform.equalsIgnoreCase("web"))
            wait.until(ExpectedConditions.visibilityOf(elem));
        else
            assertEquals(elem.getText(), expectedValue);
    }

    @Step("Verify Text with Text")
    public static void textOnPage(String actualValue, String expectedValue)
    {
        assertEquals(actualValue, expectedValue);

    }

    @Step("Verify presence of Element ")
    public static void IsElementPresent(WebElement elem)
    {
        try {
            boolean Error_notice = elem.isDisplayed();
            Assert.assertTrue(Error_notice, "Error Notice Has Popped Up");
        } catch (Exception e) {
            Assert.fail("Error Notice didn't pop up");
        }
    }

    @Step("Verify element visually")
    public static void visualElement(WebElement ImageElement, String ExpectedImageName)
    {
        BufferedImage expectedImage = null;
        try {
            expectedImage = ImageIO.read(new File(getData("ImageRepo") + ExpectedImageName + ".png"));
        } catch (IOException e)
        {
            System.out.println("Error reading image file: " + e);
        }
        Screenshot imageScreenShot = new AShot().takeScreenshot(driver, ImageElement);
        BufferedImage actualImage = imageScreenShot.getImage();
        diff = imageDiff.makeDiff(actualImage, expectedImage);
        assertFalse(diff.hasDiff(), "Images are not the same");
    }

}
