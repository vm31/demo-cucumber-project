package stepDefinition;

import baseTest.BaseTest;
import cucumber.api.java.en.And;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import org.testng.Assert;

public class switchStep extends BaseTest {

    @Then("I verify if common statistics title is displayed")
    public void i_verify_if_common_statistics_title_is_displayed() {
        Assert.assertTrue(switchPage.verifyCommonStatsHeader());

    }

    @And("I select box:{string} and verify page title is:{string},{string},{string}{string}")
    public void iSelectBoxAndVerifyPageTitleIs(String box, String title1, String title2, String title3, String title4) {
        switch (box) {
            case "orders":
                switchPage.clickOrdersBox();
                Assert.assertEquals(title1, driver.getTitle());
                break;

            case "Pending return requests":
                switchPage.clickPendingBox();
                Assert.assertEquals(title2, driver.getTitle());
                break;
            case "Registered customers":
                switchPage.clickRegisterBox();
                Assert.assertEquals(title3, driver.getTitle());
                break;
            case "Low stock products":
                switchPage.clickLowStockBox();
                Assert.assertEquals(title4, driver.getTitle());
                break;
            default:
                System.out.println("please specify the box");
                break;


        }

    }

    @Given("i test switch with rowNumber: {int}")
    public void iTestSwitch(int rowNumber) {
        String pdtName = bestsellersByQuantityPage.getProdutName1(rowNumber);
        String headerName = bestsellersByQuantityPage.getEditProductHeader(rowNumber);
        //case:1:16
        // case:2:17
        //case:3:18
        //case:4:19
        Assert.assertTrue(headerName.contains(pdtName));
    }

    @Given ("I edit productName")
    public void editProductName


}
