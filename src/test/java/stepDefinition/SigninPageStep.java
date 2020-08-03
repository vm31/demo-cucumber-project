package stepDefinition;

import base.BaseTest;
import cucumber.api.java.en.Given;
import org.testng.Assert;

public class SigninPageStep extends BaseTest {

    @Given("user is on signin page")
    public void isSignINPageDisplayed() {
        if (loggedInUserCommonObj.isLogoutBtnDisplayed()) {
            loggedInUserCommonObj.clickLogoutBtn();
        }
        System.out.println("user is on signin page");
        Assert.assertTrue(signInPageObj.isDisplayed());
    }


}
