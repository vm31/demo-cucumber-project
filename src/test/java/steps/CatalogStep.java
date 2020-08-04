package steps;

import base.BaseTest;
import cucumber.api.java.en.And;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import org.testng.Assert;

public class CatalogStep extends BaseTest {

    @Given("I select catalog menu item")
    public void iClickOnCatalogMenuItem() {
        utility.waitForElement(3000);
        productSearchPage.clickCatalog();
    }


    @When("I click on products button")
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

    @And("I enter product name {string}")
    public void iEnterProductName(String pname) {
        productSearchPage.enterProductName(pname);

    }

    @And("I click drop down in category and select item:{string}")
    public void iClickDropDownInCategoryAndSelectItem(String pName) {
        //productSearchPage.clickSearchCatagory();
        utility.waitForElement(2000);
        productSearchPage.getOptions();
        productSearchPage.clickOnOption(pName);


    }

    @And("I click on search button")
    public void iClickOnSearchButton() {
        productSearchPage.clickSearch();
        utility.waitForElement(2000);
    }
}
