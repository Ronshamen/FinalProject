package PageObjects.Calculator;

import ProjectUtilities.CommonOps;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;

public class MainPage extends CommonOps
{
    @FindBy(how = How.NAME, using = "Clear")
    public WebElement btn_clear;

    @FindBy(how = How.NAME, using = "One")
    public WebElement btn_One;

    @FindBy(how = How.NAME, using = "Plus")
    public WebElement btn_Plus;

    @FindBy(how = How.NAME, using = "Nine")
    public WebElement btn_Nine;

    @FindBy(how = How.NAME, using = "Equals")
    public WebElement btn_Equals;

    @FindBy(how = How.XPATH, using = "//*[@AutomationId = 'CalculatorResults']")
    public WebElement field_Result;
}
