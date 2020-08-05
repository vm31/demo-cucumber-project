package pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class CommonActionsPage {
    @FindBy(xpath = "//a[@href='/logout']")
    private WebElement logoutBtn;

    public boolean isLogoutBtnDisplayed() {
        return
                logoutBtn.isDisplayed();
    }

    public void clickLogoutBtn() {

        logoutBtn.click();
    }


}
