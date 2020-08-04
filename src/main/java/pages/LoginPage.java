package pages;


import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;


public class LoginPage {

    public WebDriver driver;

    public LoginPage(WebDriver driver) {
        this.driver = driver;}

    @FindBy(xpath = "//div[@class='returning-wrapper fieldset']//div/strong")
    WebElement loginPageMsg;

    @FindBy(xpath = "//input[@id='Email']")
    WebElement emailBox;

    @FindBy(xpath = "//input[@id='Password']")
    WebElement pwdBox;

    @FindBy(xpath = "//input[@class='button-1 login-button']")
    WebElement logInBtn;







    //action methods for successful login
    public boolean isLoginPageDisplayed(){
        return loginPageMsg.isDisplayed();
    }
    public String getLoginPageDisplayMsg(){
        return loginPageMsg.getText();


    }
    public void enterEmailId(String em) {
        emailBox.clear();
        emailBox.sendKeys(em);
    }

    public void enterPassword(String pw) {
        pwdBox.clear();
        pwdBox.sendKeys(pw);
    }

    public void ClickLogin() {
        logInBtn.click();
    }





}
