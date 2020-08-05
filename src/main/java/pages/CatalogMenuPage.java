package pages;


import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.Select;


import java.util.List;

public class CatalogMenuPage {
    public WebDriver driver;

    public CatalogMenuPage(WebDriver driver) {
        this.driver = driver;

    }

    @FindBy(xpath = "//ul[@class=\"sidebar-menu tree\"]/li//i[@class=\"fa fa-book\"]")
    WebElement catalogDropDown;

    @FindBy(xpath = "//ul[@class=\"treeview-menu\"]/li//a[@href='/Admin/Product/List']")
    WebElement productsBtn;

    @FindBy(xpath = "//h1[@class='pull-left']")
    WebElement productsText;

    @FindBy(id = "SearchProductName")
    WebElement productNameBox;

    @FindBy(id = "search-products")
    WebElement searchProduct;


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


    public void clickSearch() {
        searchProduct.click();
    }

    public String getOptions() {
        List<WebElement> opts = driver.findElements(By.xpath("//select[@id='SearchCategoryId']/option"));
        String optName="";
        int sizeOfOpts = opts.size();
        System.out.println(sizeOfOpts);
        for (int i = 0; i < opts.size(); i++) {
            optName= opts.get(i).getText();
            System.out.println(optName);
            //System.out.println("Element Num " + i + " is " + opts.get(i).getText());

        }
        return optName;
    }
    public void clickOnOption(String pName){
        WebElement mySelectElm = driver.findElement(By.xpath("//select[@id='SearchCategoryId']"));
        Select mySelect= new Select(mySelectElm);
        List<WebElement> options = mySelect.getOptions();
        for (WebElement pOption : options) {
            if (pOption.getText().equalsIgnoreCase(pName)){
                pOption.click();
            }
        }
    }







}
