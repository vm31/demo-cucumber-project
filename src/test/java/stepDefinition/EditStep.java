package stepDefinition;

import baseTest.BaseTest;
import cucumber.api.java.en.And;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import org.openqa.selenium.WebDriver;
import org.testng.Assert;

public class EditStep extends BaseTest {

    @When("I navigate to dashboard")
    public void iNavigateToDashboard() {
        if (editTablesPage.getCurrentUrl().contains("admin")) {
            System.out.println(editTablesPage.getCurrentUrl());
        } else {
            System.out.println("user not on dashboard page");
            driver.get("https://admin-demo.nopcommerce.com/admin/");
        }
        //signInPage.navigateToDashboard();

    }

    @Then("I verify table Bestsellers by quantity is displayed")
    public void iVerifyTableHeaderIsDisplayed() {
        Assert.assertTrue(editTablesPage.verifyTableHeaderDisplayed());
    }

    @And("I click on view button:{int}")
    public void iClickOnViewButton(int rownumber) {
        if (editTablesPage.verifyTableHeaderDisplayed()) {
            System.out.println("view button is displayed");
        }
        else {
            editTablesPage.clickPlusBtn();
        }
        utility.waitForElement(3000);
        editTablesPage.iClickViewBtn(rownumber);
    }

    @And("I edit product name {string}")
    public void iEditProductName(String input) {
        editTablesPage.enterProductName(input);

    }

    @And("I click on Save Button")
    public void iClickOnSaveButton() {
        editTablesPage.clickSave();

    }

    @Then("I verify successful message")
    public void iVerifySuccessfulMessage() {
        Assert.assertTrue(editTablesPage.getSuccessFulMsg().equalsIgnoreCase("×\nThe product has been updated successfully."));
        System.out.println(editTablesPage.getSuccessFulMsg());
    }



}
