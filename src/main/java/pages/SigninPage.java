package pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.CacheLookup;
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

    //elements for Edit Name in Best sellers by Quality table scenario

    @FindBy(xpath = "//*[@id=\"bestsellers-report-quantity-box\"]/div[1]/h3")
    @CacheLookup
    WebElement tableHeader;
    @FindBy(xpath = "//*[@id=\"bestsellers-report-quantity-box\"]/div[1]/div/button/i")
    @CacheLookup
    WebElement plusButton;
    @FindBy(xpath = "//*[@id=\"bestsellers-byquantity-grid\"]/tbody/tr[2]/td[4]/a")
    @CacheLookup
    WebElement viewButton;
    @FindBy(xpath = "//*[@id=\"Name\"]")
    @CacheLookup
    WebElement productNameBox;
    @FindBy(xpath = "//*[@id=\"product-form\"]/div[1]/div/button[1]")
    @CacheLookup
    WebElement saveButton;
    @FindBy(xpath = "//*[@class=\"alert alert-success alert-dismissable\"]")
    @CacheLookup
    WebElement updateSuccessMSg;



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
  //Action commands for Edit Name in Best sellers by Quality table scenario

    public boolean verifyTableHeaderDisplayed(){
      return tableHeader.isDisplayed();

    }
    public void clickViewBtn(){
      viewButton.click();}

      public boolean verifyViewBtnDisplayed(){
      return viewButton.isDisplayed();}

      public void clickPlusBtn(){
      plusButton.click();
      }
      public void  getProductName(){
          String x=productNameBox.getAttribute("value");
          System.out.println("Value of type attribute: "+ x);
      }
      public void clearProductName(){
      productNameBox.clear();
      }
      public void addStringToProductName(){
          String x=productNameBox.getAttribute("value");
          productNameBox.sendKeys("x" + "plus");
      }

    public void ClickSave(){
      saveButton.click();
    }
    public boolean checkSuccessFul_Msg(){
      return updateSuccessMSg.isDisplayed();

    }

}
