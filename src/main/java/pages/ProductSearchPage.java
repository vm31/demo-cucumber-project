package pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import java.util.List;

public class ProductSearchPage {
    public WebDriver ldriver;

    public ProductSearchPage(WebDriver rdriver) {
        ldriver = rdriver;
        PageFactory.initElements(rdriver, this);

    }

    @FindBy(xpath = "//ul[@class=\"sidebar-menu tree\"]/li//i[@class=\"fa fa-book\"]")
    WebElement catalogDropDown;

    @FindBy(xpath = "//ul[@class=\"treeview-menu\"]/li//a[@href='/Admin/Product/List']")
    WebElement productsBtn;

    @FindBy(xpath = "//h1[@class='pull-left']")
    WebElement productsText;

    @FindBy(id = "SearchProductName")
    WebElement productNameBox;

    @FindBy(id = "SearchCategoryId")
    WebElement searchCategoryIDropDown;

    @FindBy(id = "search-products")
    WebElement searchProduct;

    @FindBy(xpath = "//select[@id='SearchCategoryId']")
    List<WebElement> options;

    //List<WebElements> optionLinks = driver.findElements(By.cssSelector(commonOptionPath));


    //actions methods
    public void clickCatalog() {
        catalogDropDown.click();
    }
    public boolean verifyProductsIsDisplayed(){
        return productsBtn.isDisplayed();
    }

    public void clickOnProducts() {
        productsBtn.click();
    }

    public boolean getProductsText() {
        return productsText.isDisplayed();


    }

    public void enterProductName(String pName) {
        productNameBox.sendKeys(pName);
    }

    public void clickSearchCatagory() {
        searchCategoryIDropDown.click();

    }

    public void clickSearch() {
        searchProduct.click();
    }

    public String clickOptionByName(String name) {
        for (WebElement sample : options) {
            if (sample.getText().equals(name)) {
                sample.click();

            }

        }
        return name;

    }








}
