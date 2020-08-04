package stepDefinition;

import baseTest.BaseTest;
import cucumber.api.java.en.And;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import org.openqa.selenium.WebDriver;
import org.testng.Assert;

public class loginStep extends BaseTest {


    @Given("I enter email address:  {string} and password: {string}")
    public void i_enter_email_address_as_and_password_as(String email, String pwd) {

        loginPageObj.enterEmailId(email);
        loginPageObj.enterPassword(pwd);

    }

    @And("I click on login button")
    public void i_click_on_login() {
        loginPageObj.ClickLogin();
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
        loginPageObj.clickLogOut();
    }
    @Then("I verify if login page is displayed")
    public void iAmOnLoginPage() {
        Assert.assertEquals("Your store. Login", driver.getTitle());


    }
    @Given("user is on login page")
    public void navigateToLoginPage(){
        if(commonActionsObj.isLogoutBtnDisplayed()){
            commonActionsObj.clickLogoutBtn();
        }
    }
}
