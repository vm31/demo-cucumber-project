package steps;

import base.BaseTest;
import cucumber.api.java.en.And;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import org.testng.Assert;

import java.security.NoSuchAlgorithmException;
import java.util.NoSuchElementException;

public class LoginStep extends BaseTest {


    @And("I enter email address:  {string} and password: {string}")
    public void i_enter_email_address_as_and_password_as(String email, String pwd) {

        loginPageObj.enterEmailId(email);
        loginPageObj.enterPassword(pwd);

    }



    @Then("I verify if page title is: {string}")
    public void page_title_should_be(String title) {
        if (driver.getPageSource().contains("Login was successful.")) {
            driver.close();
            Assert.assertTrue(false);
        } else {
            Assert.assertEquals(title, driver.getTitle());
        }


    }

    @When("I click on logout link")
    public void i_click_on_logout_link() {
        commonActionsPageObj.clickLogoutBtn();
    }
    @Then("I verify if login page is displayed")
    public void iAmOnLoginPage() {
        Assert.assertEquals("Your store. Login", driver.getTitle());


    }


    @Given("user is on login page")
        public void returnToLoginPage() {
        String url = driver.getCurrentUrl();
        System.out.println("current page url is"+url);
            if(url.contains("ReturnUrl")){
                System.out.println("user is on login page");
            }else{
                commonActionsPageObj.clickLogoutBtn();
            }
            Assert.assertTrue(loginPageObj.isLoginPageDisplayed());

    }

}
