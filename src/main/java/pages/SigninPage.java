package pages;


import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;


public class SigninPage {

    public WebDriver ldriver;

    public SigninPage(WebDriver rdriver) {
        ldriver = rdriver;
        PageFactory.initElements(rdriver, this);

    }


    @FindBy(xpath = "//input[@id='Email']")
    WebElement emailBox;

    @FindBy(xpath = "//input[@id='Password']")
    WebElement pwdBox;

    @FindBy(xpath = "//input[@class='button-1 login-button']")
    WebElement logInBtn;

    @FindBy(xpath = "//a[@href=\"/logout\"]")
    WebElement logoutBtn;





    //action methods for successful login
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

    public void clickLogOut() {
        logoutBtn.click();
    }



}
