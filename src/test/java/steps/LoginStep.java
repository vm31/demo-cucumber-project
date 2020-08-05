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

        loginPage.enterEmailId(email);
        loginPage.enterPassword(pwd);

    }

    @And("I click on login button")
    public void i_click_on_login() {
        loginPage.ClickLogin();
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
        loggedInUserCommonPage.clickLogOut();
    }
    @Then("I verify if login page is displayed")
    public void iAmOnLoginPage() {
        Assert.assertEquals("Your store. Login", driver.getTitle());


    }


    @Given("user is on login page")
//    public void userIsOnLoginPage() {
//        if (loginPage.isLoginPageDisplayed()){
//            loginPage.getLoginPageDisplayMsg();
//            System.out.println(loginPage.getLoginPageDisplayMsg());
//            System.out.println("user is on signIn page");
//        }else {
//            loggedInUserCommonPage.isLogoutBtnDisplayed();
//            loggedInUserCommonPage.clickLogOut();
//            System.out.println("user is already inside and can see logout button");
//        }
    public void navigateLoginPage() throws NoSuchElementException {
        try {
            if (loginPage.isLoginPageDisplayed()) {
                System.out.println("user is on login page");

            } else {
                loggedInUserCommonPage.clickLogOut();
                System.out.println("log out btn is clicked");
            }

        }
        catch(Exception e){
            e.printStackTrace();

    }


    }



}
