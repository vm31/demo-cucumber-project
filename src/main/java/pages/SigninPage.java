package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import sun.font.TrueTypeFont;

public class SigninPage {

    public WebDriver ldriver;

    public SigninPage(WebDriver rdriver) {
        ldriver = rdriver;
        PageFactory.initElements(rdriver, this);

    }


    @FindBy(xpath = "//input[@id='Email']")
    WebElement EmailBox;

    @FindBy(xpath = "//input[@id='Password']")
    WebElement PwdBox;

    @FindBy(xpath = "//input[@class='button-1 login-button']")
    WebElement LogInBtn;

    @FindBy(xpath = "//a[@href=\"/logout\"]")
    WebElement logoutBtn;

    //elements for Edit Name in Best sellers by Quality table scenario

    @FindBy(xpath = "//*[@id=\"bestsellers-report-quantity-box\"]/div[1]/h3")
    WebElement tableHeader;

    @FindBy(xpath = "//*[@id=\"bestsellers-report-quantity-box\"]//i[@class=\"fa fa-plus\"]")
    WebElement plusButton;

    @FindBy(xpath = "//*[@id=\"bestsellers-byquantity-grid\"]//a[@href=(\"/Admin/Product/Edit/17\")]")
    WebElement viewButton;

    @FindBy(xpath = "//*[@id=\"Name\"]")
    WebElement productNameBox;

    @FindBy(xpath = "//*[@id=\"product-form\"]/div[1]/div/button[1]")
    WebElement saveButton;

    @FindBy(xpath = "//div[@class=\"alert alert-success alert-dismissable\"]")
    WebElement updateSuccessMSg;

    @FindBy(xpath = "//span[contains(text(),\"Dashboard\")]")
    WebElement dashboardBtn;



    //action methods for successful login
    public void enterEmailId(String em) {
        EmailBox.clear();
        EmailBox.sendKeys(em);
    }

    public void enterPassword(String pw) {
        PwdBox.clear();
        PwdBox.sendKeys(pw);
    }

    public void ClickLogin() {
        LogInBtn.click();
    }

    public void clickLogOut() {
        logoutBtn.click();
    }
    //Action commands for Edit Name in Best sellers by Quality table scenario

    public boolean verifyTableHeaderDisplayed() {
        return tableHeader.isDisplayed();

    }

    public void clickViewBtn() {
        viewButton.click();
    }

    public boolean verifyViewBtnDisplayed() {
        return viewButton.isDisplayed();
    }

    public void clickPlusBtn() {
        plusButton.click();
    }

    public String getProductName() {
        String x = productNameBox.getAttribute("value");
        System.out.println("Value of type attribute: " + x);
        return x;
    }

    public void clearProductName() {
        productNameBox.clear();
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
    public void Dashboard(){
        dashboardBtn.click();

    }
    public void iClickViewBtn(int rowNumber){
        //*[@id='bestsellers-byquantity-grid']//a[@href=('/Admin/Product/Edit/"+16+"')]
        WebElement viewBtn=ldriver.findElement(By.xpath("//*[@id='bestsellers-byquantity-grid']//a[@href=('/Admin/Product/Edit/"+rowNumber+"')]"));
        viewBtn.click();
    }


}
