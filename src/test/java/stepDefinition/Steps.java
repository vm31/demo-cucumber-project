package stepDefinition;

import baseTest.BaseTest;
import cucumber.api.java.After;
import cucumber.api.java.Before;
import cucumber.api.java.en.*;
import helper.Utility;
import org.apache.log4j.Logger;
import org.apache.log4j.PropertyConfigurator;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.ie.InternetExplorerDriver;
import org.testng.Assert;
import pages.HomePage;
import pages.SigninPage;
import static org.junit.Assert.*;
import java.io.FileInputStream;
import java.io.IOException;
import java.util.Properties;

public class Steps extends BaseTest {
    @Before
    public void setup() throws IOException {
        configprop = new Properties();
        FileInputStream configPropfile = new FileInputStream("data.properties");
        configprop.load(configPropfile);
        logger= Logger.getLogger("demo-project");//added logger
        PropertyConfigurator.configure("log4j.properties");

        String br = configprop.getProperty("BROWSER");
        if (br.equals("chrome"))
        {
            System.setProperty("webdriver.chrome.driver", configprop.getProperty("chrome_path"));
            driver = new ChromeDriver();
        }
        else if (br.equals("firefox")){
            System.setProperty("webdriver.gecko.driver", configprop.getProperty("firefox_path"));
            driver = new FirefoxDriver();

        }
        else if(br.equals("ie")){
            System.setProperty("webdriver.ie.driver", configprop.getProperty("ie_path"));
            driver = new InternetExplorerDriver();
        }

    }
    @Given("I open home page {string}")
    public void i_open_home_page(String url) {
        logger.info("*****opening url****");
        driver.get(url);
        homePage=new HomePage(driver);
        signInPage=new SigninPage(driver);
        utility=new Utility(driver);
    }

    @Then("verify amazon home display")
    public void verify_amazon_home_display() {
        Assert.assertTrue(homePage.homePageText());
        System.out.println(homePage.homePageText());
    }

    @Given("I enter email address:  {string} and password: {string}")
    public void i_enter_email_address_as_and_password_as(String email, String pwd) {

        signInPage.enterEmailId(email);
        signInPage.enterPassword(pwd);

    }

    @Given("I click on login button")
    public void i_click_on_login() {
        signInPage.ClickLogin();
    }

    @Then("I verify if page title is {string}")
    public void page_title_should_be(String title) {
        if(driver.getPageSource().contains("Login was successful."))
        {
            driver.close();
            Assert.assertTrue(false);
        }
        else {
            Assert.assertEquals(title,driver.getTitle());
        }




    }

    @When("I click on logout link")
    public void i_click_on_logout_link() {
        signInPage.clickLogOut();
    }


    @After
    public void userClosesBrowser() {
        logger.info("*** user close browser***");
        driver.quit();
    }


    @Then("I am on login page")
    public void iAmOnLoginPage() {
        Assert.assertEquals("Your store. Login",driver.getTitle());


    }
    //steps for Edit Name in Best sellers by Quality table

    @Then("I verify table header is displayed")
    public void iVerifyTableHeaderIsDisplayed() {
         Assert.assertTrue(signInPage.verifyTableHeaderDisplayed());
    }

    @When("I click on view button")
    public void iClickOnViewButton() {
        if(signInPage.verifyTableHeaderDisplayed()){
            System.out.println("view button is displayed");
        }
        else{
            signInPage.clickPlusBtn();
        }
        signInPage.clickViewBtn();
    }

    @Then("I edit product name")
    public void iEditProductName() {
        signInPage.getProductName();
        signInPage.clearProductName();
        signInPage.addStringToProductName();
        
    }

    @Then("I click on Save Button")
    public void iClickOnSaveButton() {
        signInPage.ClickSave();
        signInPage.checkSuccessFul_Msg();
    }
}
