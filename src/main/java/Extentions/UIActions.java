package Extentions;


import ProjectUtilities.CommonOps;
import io.qameta.allure.Step;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.Select;

import java.util.Set;

public class UIActions extends CommonOps

{
    @Step("click on element")
    public static void click(WebElement elem)
    {
        if(Platform.equalsIgnoreCase("web"))
            wait.until(ExpectedConditions.elementToBeClickable(elem));
        elem.click();
    }

    @Step("Add text to field")
    public static void UpdateTxt(WebElement elem, String value)
    {
        if(Platform.equalsIgnoreCase("web"))
            wait.until(ExpectedConditions.visibilityOf(elem));
        elem.sendKeys(value);
    }

    @Step("Choose object from dropdown ")
    public static void UpdateDropdown(WebElement elem, String value)
    {
        if(Platform.equalsIgnoreCase("web"))
             wait.until(ExpectedConditions.visibilityOf(elem));
        Select myValue = new Select(elem);
        myValue.selectByVisibleText(value);
    }

    @Step("Mouse hover to element")
    public static void MouseHoverElements(WebElement elem1, WebElement elem2)
    {
        if(Platform.equalsIgnoreCase("web"))
            wait.until(ExpectedConditions.visibilityOf(elem1));
        action.moveToElement(elem1).build().perform();
            try {
             Thread.sleep(2000);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        action.moveToElement(elem2).click().build().perform();
    }

    @Step("wait for JS code to be active - 1 second")
    public static void Standby()
        {
            try {
                Thread.sleep(Long.parseLong(getData("sleep")));
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }


    @Step("Clear text in price box, on donation song page")
    public static void clearTextBox(WebElement elem)
    {
        elem.clear();
    }


    @Step("Switch to new window")
    public static void switchToWindow()
    {
        Set<String> currentWindowHandle;
        currentWindowHandle = driver.getWindowHandles();
        java.util.Set<String> availableWindows =driver.getWindowHandles();

        int Windows = 2;//totally how many  windows initialize here.
        if (availableWindows.size()==Windows) {
            String popUpWindowHandle = null;
            for (String windowHandle2 : availableWindows) {
                if(!availableWindows.equals(currentWindowHandle))
                    popUpWindowHandle= windowHandle2;
                driver.switchTo().window(popUpWindowHandle);
            }
        }
    }

}
