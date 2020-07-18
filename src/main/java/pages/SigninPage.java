package pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.CacheLookup;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class SigninPage {

    public WebDriver ldriver;

    public SigninPage(WebDriver rdriver) {
        ldriver = rdriver;
        PageFactory.initElements(rdriver, this);

    }


    @FindBy(xpath = "//input[@id='Email']")
    @CacheLookup
    WebElement EmailBox;

    @FindBy(xpath = "//input[@id='Password']")
    @CacheLookup
    WebElement PwdBox;

    @FindBy(xpath = "//input[@class='button-1 login-button']")
    @CacheLookup
    WebElement LogInBtn;

    @FindBy(xpath = "//a[@href=\"/logout\"]")
    @CacheLookup
    WebElement logoutBtn;
    //action methods for successful login
  public void enterEmailId(String em){
      EmailBox.clear();
      EmailBox.sendKeys(em);
  }
  public void enterPassword(String pw){
      PwdBox.clear();
      PwdBox.sendKeys(pw);
  }
  public void ClickLogin(){
      LogInBtn.click();
  }
  public void clickLogOut(){
      logoutBtn.click();
  }

}
