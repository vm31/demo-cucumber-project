package stepDefinition;

import baseTest.BaseTest;
import cucumber.api.java.en.And;
import cucumber.api.java.en.Then;
import javafx.scene.effect.Light;
import org.testng.Assert;

public class switchStep extends BaseTest {

    @Then("I verify if common statistics title is displayed")
    public void i_verify_if_common_statistics_title_is_displayed() {
        Assert.assertTrue(switchPage.verifyCommonStatsHeader());

    }

    @And("I select box:{string} and verify page title is:{string},{string},{string}{string}")
    public void iSelectBoxAndVerifyPageTitleIs(String box, String title1, String title2, String title3, String title4) {
            switch (box){
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



}
