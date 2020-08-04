package pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class LoggedInUserCommonPage {

    @FindBy(xpath = "//a[@href=\"/logout\"]")
    WebElement logoutBtn;


public boolean isLogoutBtnDisplayed(){
    return logoutBtn.isDisplayed();
}

    public void clickLogOut() {
        logoutBtn.click();
    }





}
