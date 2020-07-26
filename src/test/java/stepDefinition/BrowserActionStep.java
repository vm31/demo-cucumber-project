package stepDefinition;

import baseTest.BaseTest;
import cucumber.api.java.en.And;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import org.openqa.selenium.Point;

public class BrowserActionStep extends BaseTest {


    @When("I click on back button")
    public void iClickOnBackButton() {
        driver.navigate().back();

    }
    @When("I click on forward button")
    public void iClickOnForwardButton() {
        driver.navigate().forward();
    }

    @When("I click on maximize button")
    public void iClickOnMaximiseButton() {
        driver.manage().window().maximize();
    }

    @When("I click on refresh button")
    public void iClickOnRefreshButton() {
        driver.navigate().refresh();
    }

    @When("I click on minimize button")
    public void iClickOnMinimiseButton() {
        driver.manage().window().setPosition(new Point(0, -2000));
    }


    @Then("I see {string}")
    public void iSee(String arg0) {
    }
}


