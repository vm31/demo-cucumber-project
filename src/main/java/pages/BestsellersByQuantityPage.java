package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class BestsellersByQuantityPage {

    public WebDriver driver;

    public BestsellersByQuantityPage(WebDriver driver) {
        this.driver=driver;

    }


    @FindBy(xpath = "//*[@id=\"bestsellers-report-quantity-box\"]/div[1]/h3")
    WebElement tableHeader;

    @FindBy(xpath = "//*[@id=\"bestsellers-report-quantity-box\"]//i[@class=\"fa fa-plus\"]")
    WebElement plusButton;

    @FindBy(xpath = "//*[@id=\"Name\"]")
    WebElement productNameBox;

    @FindBy(xpath = "//*[@id=\"product-form\"]/div[1]/div/button[1]")
    WebElement saveButton;

    @FindBy(xpath = "//div[@class=\"alert alert-success alert-dismissable\"]")
    WebElement updateSuccessMSg;


    public boolean verifyTableHeaderDisplayed() {
        return tableHeader.isDisplayed();

    }

    public void clickPlusBtn()
    {
        plusButton.click();
    }

    public String getProductName() {
        String x = productNameBox.getAttribute("value");
        System.out.println("Value of type attribute: " + x);
        return x;
    }

    public void enterProductName(String myInput) {
        String l = getProductName();
        productNameBox.clear();
        productNameBox.sendKeys(l + myInput);
    }

    public void clickSave() {

        saveButton.click();
    }

    public String getSuccessFulMsg() {
        return updateSuccessMSg.getText();

    }
    public String getCurrentUrl(){
        String url=driver.getCurrentUrl();
        return url;


    }
    public void iClickViewBtn(int rowNumber){
        WebElement viewBtn=driver.findElement(By.xpath("//*[@id='bestsellers-byquantity-grid']//a[@href=('/Admin/Product/Edit/"+rowNumber+"')]"));
        viewBtn.click();
    }


    public String getProductName1(int rowNumber){
        WebElement productNameElem = driver.findElement(By.xpath("//*[@id='bestsellers-byquantity-grid']//a[@href=('/Admin/Product/Edit/"+rowNumber+"')]//../../td[1]"));
        String x = productNameElem.getText();
        System.out.println(x);
        return  x;
    }

    public String getEditProductHeader(int rowNumber){
        WebElement editHeader= driver.findElement(By.xpath("//*[@action='/Admin/Product/Edit/"+rowNumber+"']/div[@class='content-header clearfix']/h1"));
        return editHeader.getText();
    }


















}
