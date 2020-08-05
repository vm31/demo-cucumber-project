package steps;

import base.BaseTest;
import cucumber.api.java.en.And;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import org.testng.Assert;

public class DashBoardCommonStatisticsStep extends BaseTest {
    

    @Then("I verify if common statistics title is displayed")
    public void i_verify_if_common_statistics_title_is_displayed() {
        Assert.assertTrue(dashboardCommonStatisticsPageObj.verifyCommonStatsHeader());

    }

    @And("I verify common statistics boxes:{string} with title contains:{string},{string},{string}{string}")
    public void iSelectBoxAndVerifyPageTitleContains(String box, String title1, String title2, String title3, String title4) {
        switch (box) {
            case "orders":
                dashboardCommonStatisticsPageObj.clickOrdersBox();
                Assert.assertTrue(driver.getTitle().contains(title1));
                break;

            case "Pending return requests":
                dashboardCommonStatisticsPageObj.clickPendingBox();
                Assert.assertTrue(driver.getTitle().contains(title2));
                break;
            case "Registered customers":
                dashboardCommonStatisticsPageObj.clickRegisterBox();
                Assert.assertTrue(driver.getTitle().contains(title3));
                break;
            case "Low stock products":
                dashboardCommonStatisticsPageObj.clickLowStockBox();
                Assert.assertTrue(driver.getTitle().contains(title4));
                break;
            default:
                System.out.println("please specify the box");
                break;


        }

    }




}
