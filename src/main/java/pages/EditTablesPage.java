package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class EditTablesPage {
    public WebDriver ldriver;

    public EditTablesPage(WebDriver rdriver) {
        ldriver = rdriver;
        PageFactory.initElements(rdriver, this);

    }

//elements for Edit Name in Best sellers by Quality table scenario

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


    //Action commands for Edit Name in Best sellers by Quality table scenario

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
        String url=ldriver.getCurrentUrl();
        return url;


    }
    public void iClickViewBtn(int rowNumber){
        WebElement viewBtn=ldriver.findElement(By.xpath("//*[@id='bestsellers-byquantity-grid']//a[@href=('/Admin/Product/Edit/"+rowNumber+"')]"));
        viewBtn.click();
    }
}
