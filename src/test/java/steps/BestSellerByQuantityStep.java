package steps;

import base.BaseTest;
import cucumber.api.java.en.And;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import org.testng.Assert;

public class BestSellerByQuantityStep extends BaseTest {

    @When("I navigate to dashboard")
    public void iNavigateToDashboard() {
        if (bestSellersByQuantityPageObj.getCurrentUrl().contains("admin")) {
            System.out.println(bestSellersByQuantityPageObj.getCurrentUrl());
        } else {
            System.out.println("user not on dashboard page");
            driver.get("https://admin-demo.nopcommerce.com/admin/");
        }
        //loginPage.navigateToDashboard();

    }

    @Then("I verify table Bestsellers by quantity is displayed")
    public void iVerifyTableHeaderIsDisplayed() {
        Assert.assertTrue(bestSellersByQuantityPageObj.verifyTableHeaderDisplayed());
        System.out.println(bestSellersByQuantityPageObj.verifyTableHeaderDisplayed());
    }

    @And("I click on view button:{int}")
    public void iClickOnViewButton(int rownumber) {
        if (bestSellersByQuantityPageObj.verifyTableHeaderDisplayed()) {
            System.out.println("view button is displayed");
        }
        else {
            bestSellersByQuantityPageObj.clickPlusBtn();
        }
        utility.waitForElement(3000);
        bestSellersByQuantityPageObj.iClickViewBtn(rownumber);
    }

    @And("I edit product name {string}")
    public void iEditProductName(String input) {
        bestSellersByQuantityPageObj.enterProductName(input);

    }

    @And("I click on Save Button")
    public void iClickOnSaveButton() {
        bestSellersByQuantityPageObj.clickSave();

    }

    @Then("I verify successful message")
    public void iVerifySuccessfulMessage() {
        Assert.assertTrue(bestSellersByQuantityPageObj.getSuccessFulMsg().equalsIgnoreCase("×\nThe product has been updated successfully."));
        System.out.println(bestSellersByQuantityPageObj.getSuccessFulMsg());
    }

    @And("I click on view button:{int} and verify page display header with product name")
    public void iClickOnViewButtonAndVerifyPageDisplayHeaderWithProductName(int rowNumber) {
        String pdtName = bestSellersByQuantityPageObj.getProductName1(rowNumber);
        iClickOnViewButton(rowNumber);
        String headerName = bestSellersByQuantityPageObj.getEditProductHeader(rowNumber);
        //bestSellersByQuantityPage.iClickViewBtn(rowNumber);

        utility.waitForElement(2000);
        Assert.assertTrue(headerName.contains(pdtName));
        System.out.println(headerName + " contains " + pdtName);







    }

}
