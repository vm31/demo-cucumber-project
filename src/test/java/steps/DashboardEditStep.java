package steps;

import base.BaseTest;
import cucumber.api.java.en.And;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import org.testng.Assert;

public class DashboardEditStep extends BaseTest {

    @When("I navigate to dashboard")
    public void iNavigateToDashboard() {
        if (editTablesPage.getCurrentUrl().contains("admin")) {
            System.out.println(editTablesPage.getCurrentUrl());
        } else {
            System.out.println("user not on dashboard page");
            driver.get("https://admin-demo.nopcommerce.com/admin/");
        }
        //loginPage.navigateToDashboard();

    }

    @Then("I verify table Bestsellers by quantity is displayed")
    public void iVerifyTableHeaderIsDisplayed() {
        Assert.assertTrue(editTablesPage.verifyTableHeaderDisplayed());
        System.out.println(editTablesPage.verifyTableHeaderDisplayed());
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



    @And("I select product :{string},click on view button and verify text displayed")
    public void iSelectProductClickOnViewButtonAndVerifyTextDisplayed(String pName) {

    }

    @Then("I verify if common statistics title is displayed")
    public void i_verify_if_common_statistics_title_is_displayed() {
        Assert.assertTrue(dashboardEditPage.verifyCommonStatsHeader());

    }

    @And("I select box:{string} and verify page title is:{string},{string},{string}{string}")
    public void iSelectBoxAndVerifyPageTitleIs(String box, String title1, String title2, String title3, String title4) {
        switch (box) {
            case "orders":
                dashboardEditPage.clickOrdersBox();
                Assert.assertTrue(driver.getTitle().contains(""));
                break;

            case "Pending return requests":
                dashboardEditPage.clickPendingBox();
                Assert.assertEquals(title2, driver.getTitle());
                break;
            case "Registered customers":
                dashboardEditPage.clickRegisterBox();
                Assert.assertEquals(title3, driver.getTitle());
                break;
            case "Low stock products":
                dashboardEditPage.clickLowStockBox();
                Assert.assertEquals(title4, driver.getTitle());
                break;
            default:
                System.out.println("please specify the box");
                break;


        }

    }

    @Given("i test switch with rowNumber: {int}")
    public void iTestSwitch(int rowNumber) {
        String pdtName = bestsellersByQuantityPage.getProductName1(rowNumber);
        String headerName = bestsellersByQuantityPage.getEditProductHeader(rowNumber);
        //case:1:16
        // case:2:17
        //case:3:18
        //case:4:19
        Assert.assertTrue(headerName.contains(pdtName));
    }


    @And("I click on view button:{int} and verify page display header with product name")
    public void iClickOnViewButtonAndVerifyPageDisplayHeaderWithProductName(int rowNumber) {
        String pdtName = bestsellersByQuantityPage.getProductName1(rowNumber);
        iClickOnViewButton(rowNumber);
        String headerName = bestsellersByQuantityPage.getEditProductHeader(rowNumber);
                //editTablesPage.iClickViewBtn(rowNumber);

                utility.waitForElement(2000);
                Assert.assertTrue(headerName.contains(pdtName));
                System.out.println(pdtName + " matches with " + headerName);







    }
}
