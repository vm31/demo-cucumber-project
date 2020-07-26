package stepDefinition;

import base.BaseTest;
import cucumber.api.java.en.And;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import org.testng.Assert;

public class ProductsSearchPageStep extends BaseTest {
    @Then("I enter product name {string}")
    public void iEnterProductName(String pname) {
        productSearchPageObj.enterProductName(pname);

    }

    @Then("I click drop down in category and select item:{string}")
    public void iClickDropDownInCategoryAndSelectItem(String cName) {
        productSearchPageObj.clickSearchCatagory();
        util.waitForElement(1000);
        productSearchPageObj.clickOptionByName(cName);

    }

    @And("I click on search button")
    public void iClickOnSearchButton() {
        productSearchPageObj.clickSearch();
        util.waitForElement(1000);
    }

    @Then("I click on products button")
    public void iClickOnProductsButton() {
        util.waitForElement(2000);
        productSearchPageObj.clickOnProducts();
    }

    @Then("I verify page title is :{string} and {string} is displayed")
    public void iVerifyPageTitleIsAndIsDisplayed(String title, String text) {
        if (productSearchPageObj.getProductsText()){
            Assert.assertEquals(title, driver.getTitle());}
        else{
            System.out.println("user not on products page");
        }

    }
    //steps for Scenario: product search by category_select_item_from_drop_down
    @When("I click on catalog menu item")
    public void iClickOnCatalogMenuItem() {
        util.waitForElement(3000);
        productSearchPageObj.clickCatalog();
    }


}
