package stepDefinition;

import baseTest.BaseTest;
import cucumber.api.java.After;
import cucumber.api.java.Before;
import cucumber.api.java.en.*;
import helper.Utility;
import org.apache.log4j.Logger;
import org.apache.log4j.PropertyConfigurator;
import org.openqa.selenium.Point;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.ie.InternetExplorerDriver;
import org.testng.Assert;
import pages.HomePage;
import pages.ProductSearchPage;
import pages.SigninPage;
import java.io.FileInputStream;
import java.io.IOException;
import java.util.Properties;

public class Steps extends BaseTest {
    @Before
    public void setup() throws IOException {
        configprop = new Properties();
        FileInputStream configPropfile = new FileInputStream("data.properties");
        configprop.load(configPropfile);
        logger = Logger.getLogger("demo-project");//added logger
        PropertyConfigurator.configure("log4j.properties");

        String br = configprop.getProperty("BROWSER");
        if (br.equals("chrome")) {
            System.setProperty("webdriver.chrome.driver", configprop.getProperty("chrome_path"));
            driver = new ChromeDriver();
        } else if (br.equals("firefox")) {
            System.setProperty("webdriver.gecko.driver", configprop.getProperty("firefox_path"));
            driver = new FirefoxDriver();

        } else if (br.equals("ie")) {
            System.setProperty("webdriver.ie.driver", configprop.getProperty("ie_path"));
            driver = new InternetExplorerDriver();
        }

    }

    @Given("I launch url {string}")
    public void i_open_home_page(String url) {
        logger.info("*****opening url****");
        driver.get(url);
        homePage = new HomePage(driver);
        signInPage = new SigninPage(driver);
        productSearchPage = new ProductSearchPage(driver);
        utility = new Utility(driver);
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
        signInPage.clickLogOut();
    }


    @After
    public void userClosesBrowser() {
        logger.info("*** user close browser***");
        driver.quit();
    }


    @Then("I am on login page")
    public void iAmOnLoginPage() {
        Assert.assertEquals("Your store. Login", driver.getTitle());


    }
    //steps for Edit Name in Best sellers by Quality table

    @And("I verify table Bestsellers by quantity is displayed")
    public void iVerifyTableHeaderIsDisplayed() {
        Assert.assertTrue(signInPage.verifyTableHeaderDisplayed());
    }

    @When("I click on view button:{int}")
    public void iClickOnViewButton(int rownumber) {
        if (signInPage.verifyTableHeaderDisplayed()) {
            System.out.println("view button is displayed");
        }
        else {
            signInPage.clickPlusBtn();
        }
        utility.waitForElement(3000);
        signInPage.iClickViewBtn(rownumber);
    }

    @When("I edit product name {string}")
    public void iEditProductName(String input) {
        // signInPage.getProductName();
        //signInPage.clearProductName();
        signInPage.enterProductName(input);

    }

    @And("I click on Save Button")
    public void iClickOnSaveButton() {
        signInPage.clickSave();

    }

    @Then("I verify successful message")
    public void iVerifySuccessfulMessage() {
        Assert.assertTrue(signInPage.getSuccessFulMsg().equalsIgnoreCase("×\nThe product has been updated successfully."));
        System.out.println(signInPage.getSuccessFulMsg());
    }

    @When("I navigate to dashboard")
    public void iNavigateToDashboard() {
        if (signInPage.getCurrentUrl().contains("admin")) {
            System.out.println(signInPage.getCurrentUrl());
        } else {
            System.out.println("user not on dashboard page");
            driver.get("https://admin-demo.nopcommerce.com/admin/");
        }
        //signInPage.navigateToDashboard();

    }

    // driver actions
    @When("I click on back button")
    public void iClickOnBackButton() {
        driver.navigate().back();

    }

    @Then("I click on forward button")
    public void iClickOnForwardButton() {
        driver.navigate().forward();
    }

    @Then("I click on maximize button")
    public void iClickOnMaximiseButton() {
        driver.manage().window().maximize();
    }

    @Then("I click on refresh button")
    public void iClickOnRefreshButton() {
        driver.navigate().refresh();
    }

    @And("I click on minimize button")
    public void iClickOnMinimiseButton() {
        driver.manage().window().setPosition(new Point(0, -2000));
    }




//steps for Scenario: product search by category_select_item_from_drop_down
   @When("I click on catalog menu item")
   public void iClickOnCatalogMenuItem() {
       utility.waitForElement(3000);
       productSearchPage.clickCatalog();
   }


    @Then("I click on products button")
    public void iClickOnProductsButton() {
        utility.waitForElement(2000);
        productSearchPage.clickOnProducts();
    }

    @Then("I verify page title is :{string} and {string} is displayed")
    public void iVerifyPageTitleIsAndIsDisplayed(String title, String text) {
        if (productSearchPage.getProductsText()){
            Assert.assertEquals(title, driver.getTitle());}
        else{
            System.out.println("user not on products page");
        }

    }

    @Then("I enter product name {string}")
    public void iEnterProductName(String pname) {
        productSearchPage.enterProductName(pname);

    }

    @And("I check drop down options")
    public void iClickDropDownInCategoryAndSelectItem() {
        productSearchPage.clickSearchCatagory();
        utility.waitForElement(2000);
        productSearchPage.getOptions();

    }

    @And("I click on search button")
    public void iClickOnSearchButton() {
        productSearchPage.clickSearch();
        utility.waitForElement(2000);
    }
}