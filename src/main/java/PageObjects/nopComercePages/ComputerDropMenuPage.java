package PageObjects.nopComercePages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;

public class ComputerDropMenuPage
{
    @FindBy(how = How.CSS, using = "a[href'/desktops']")
    public WebElement link_desktops;

    @FindBy(how = How.XPATH, using = "//div[@class=\"header-menu\"]/ul[1]/li[1]/ul/li[2]")
    public WebElement link_notebooks;

    @FindBy(how = How.CSS, using = "a[href'/software']")
    public WebElement link_software;

}
