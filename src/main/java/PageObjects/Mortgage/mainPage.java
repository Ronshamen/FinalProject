package PageObjects.Mortgage;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;

public class mainPage
{
    @FindBy(how = How.ID, using = "etAmount")
    public WebElement txt_amount;

    @FindBy(how = How.ID, using = "etTerm")
    public WebElement txt_Term;

    @FindBy(how = How.ID, using = "etRate")
    public WebElement txt_Rate;

    @FindBy(how = How.ID, using = "btnCalculate")
    public WebElement btn_Cal;

    @FindBy(how = How.ID, using = "tvRepayment")
    public WebElement txt_repayment;
}
