//package Helpers;
//
//import io.restassured.RestAssured;
//import io.restassured.response.Response;
//import io.restassured.specification.RequestSpecification;
//import org.json.simple.JSONObject;
//import org.testng.annotations.Test;
//
//public class Temp
//{
//    String Url = "http://localhost:3000";
//    RequestSpecification httpRequest;
//    Response response;
//    @Test
//    public void testing()
//    {
//        JSONObject param = new JSONObject();
//        param.put("name", "MasterTeam");
//        param.put("email", "MasterTeam@rongrafana.com");
//        RestAssured.baseURI = Url;
//        httpRequest = RestAssured.given().auth().preemptive().basic("admin", "admin");
//        response = httpRequest.get("/api/teams/search?perpage=50&page=1");
//        httpRequest.header("Content-Type", "application/json");
//        httpRequest.body(param.toJSONString());
//        response = httpRequest.post("/api/teams");
//        response = httpRequest.put("/api/teams/3");
//        response = httpRequest.delete("/api/teams/3");
//        System.out.println(response.prettyPrint());
//    }
//}


//------------------------------These are DELETED TESTS!!!--------------------------


//import io.qameta.allure.Description;
//import io.qameta.allure.Step;
//import org.testng.annotations.Test;
//
//@Test(description = "Test02: Add item")
//@Description("Description: Add cheapest laptop to cart, should show 1 item in shopping cart")
//public void test02_addItem()
//        {
//        WebFlows.addItem("Price: Low to High");
//        Assert.assertEquals(pickNotebook.txt_cart.getText(), "(1)");
//        }
//
//@Test(description = "Test03: Delete item")
//@Description("Description: Delete last item added to cart, should show 0 items")
//public void test03_updateCart()
//        {
//        WebFlows.UpdateCart();
//        Assert.assertEquals(updateCart.btn_cart_empty.getText(), "(0)");
//        }
//@Step("Add laptop to cart")
//public static void addItem(String low_high)
//        {
//        UIActions.Standby2();
//        UIActions.MouseHoverElements(nopCommerceTMBMP.btn_computers, nopCommerceComputerDrop.link_notebooks);
//        UIActions.Standby();
//        Verifications.textOnPage(driver.getTitle(), "nopCommerce demo store. Notebooks");
//        UIActions.UpdateDropdown(pickNotebook.drp_SortBy, low_high);
//        UIActions.Standby();
//        UIActions.click(pickNotebook.choose_btn);
//        UIActions.Standby();
//        UIActions.click(pickNotebook.ultraBook_addToCart_click);
//        UIActions.Standby2();
//        }
//
//@Step("Delete last item from cart")
//public static void UpdateCart()
//        {
//        UIActions.Standby2();
//        UIActions.click(updateCart.btn_cart);
//        Verifications.textOnPage(updateCart.txt_cart_page.getText(), "Shopping cart");
//        UIActions.Standby();
//        UIActions.click(updateCart.radio_remove.get(updateCart.radio_remove.size()-1));
//        UIActions.Standby();
//        UIActions.click(updateCart.update_cart);
//        }

//import org.openqa.selenium.WebElement;
//import org.openqa.selenium.support.FindBy;
//import org.openqa.selenium.support.How;
//
//import java.util.List;
//
//public class nopCartPage
//{
//    @FindBy(how = How.CSS, using = "#topcartlink > a > span.cart-label")
//    public WebElement btn_cart;
//
//    @FindBy(how = How.XPATH, using = "//input[@aria-label=\"Remove\"]")
//    public List<WebElement> radio_remove;
//
//    @FindBy(how = How.CSS, using = "#shopping-cart-form > div.cart-options > div.common-buttons > input.button-2.update-cart-button")
//    public WebElement update_cart;
//
//    @FindBy(how = How.CSS, using = "body > div.master-wrapper-page > div.master-wrapper-content > div > div > div > div.page-title > h1")
//    public WebElement txt_cart_page;
//
//    @FindBy(how = How.CSS, using = "#topcartlink > a > span.cart-qty")
//    public WebElement btn_cart_empty;
//}
//public class NoteBookPage
//{
//    @FindBy(how = How.XPATH, using = "//*[@id=\"products-orderby\"]")
//    public WebElement drp_SortBy;
//
//    @FindBy(how = How.XPATH, using = "//div[@class = 'item-box'][1]")
//    public WebElement choose_btn;
//
//    @FindBy(how = How.CSS, using = "input[class = 'button-1 add-to-cart-button']")
//    public WebElement ultraBook_addToCart_click;
//
//    @FindBy(how = How.XPATH, using = "//*[@id=\"topcartlink\"]/a/span[2]")
//    public WebElement txt_cart;

//}

//import org.openqa.selenium.WebElement;
//import org.openqa.selenium.support.FindBy;
//import org.openqa.selenium.support.How;
//
//public class TopMenuBannerMainPage
//{
//    @FindBy(how = How.XPATH, using = "//div[@class=\"header-menu\"]/ul[1]/li[1]/a")
//    public WebElement btn_computers;
//
//    @FindBy(how = How.CSS, using = "a[href = '/electronics']")
//    public WebElement btn_electronics;
//
//    @FindBy(how = How.CSS, using = "a[href = '/apparel']")
//    public WebElement btn_apparel;
//
//    @FindBy(how = How.CSS, using = "a[href = '/digital-downloads']")
//    public WebElement btn_digitalDownloads;
//
//    @FindBy(how = How.CSS, using = "a[href = '/books']")
//    public WebElement btn_books;
//
//    @FindBy(how = How.CSS, using = "a[href = '/jewelry']")
//    public WebElement btn_jewelry;
//
//    @FindBy(how = How.CSS, using = "a[href = '/gift-cards']")
//    public WebElement btn_giftCards;
//
//}
//
//

//import io.qameta.allure.Step;
//
//@Step("Clear text in CC number box, on payment method page")
//public static void clearCCField()
//        {
//        driver.findElement(By.xpath("//*[@id=\"CardNumber\"]")).clear();
//        }
