package stepDefinition;

import cucumber.api.java.en.And;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import org.openqa.selenium.Point;
import org.openqa.selenium.WebDriver;

public class driverStep {
    WebDriver driver;

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
}
