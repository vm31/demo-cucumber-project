$(document).ready(function() {var formatter = new CucumberHTML.DOMFormatter($('.cucumber-report'));formatter.uri("file:src/test/features/catalog.feature");
formatter.feature({
  "name": "Catalog menu button",
  "description": "",
  "keyword": "Feature"
});
formatter.background({
  "name": "",
  "description": "",
  "keyword": "Background"
});
formatter.before({
  "status": "passed"
});
formatter.step({
  "name": "I launch url \"https://admin-demo.nopcommerce.com/login\"",
  "keyword": "Given "
});
formatter.match({
  "location": "Steps.i_open_home_page(String)"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "I verify home page display",
  "keyword": "Then "
});
formatter.match({
  "location": "Steps.verify_home_page_display()"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "I enter email address:  \"admin@yourstore.com\" and password: \"admin\"",
  "keyword": "Given "
});
formatter.match({
  "location": "Steps.i_enter_email_address_as_and_password_as(String,String)"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "I click on login button",
  "keyword": "When "
});
formatter.match({
  "location": "Steps.i_click_on_login()"
});
formatter.result({
  "status": "passed"
});
formatter.scenario({
  "name": "product search by category_select_item_from_drop_down",
  "description": "",
  "keyword": "Scenario"
});
formatter.step({
  "name": "I click on catalog menu item",
  "keyword": "When "
});
formatter.match({
  "location": "Steps.iClickOnCatalogMenuItem()"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "I click on products button",
  "keyword": "Then "
});
formatter.match({
  "location": "Steps.iClickOnProductsButton()"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "I verify page title is :\"Products / nopCommerce administration\" and \"Products\" is displayed",
  "keyword": "Then "
});
formatter.match({
  "location": "Steps.iVerifyPageTitleIsAndIsDisplayed(String,String)"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "I enter product name \"apple\"",
  "keyword": "Then "
});
formatter.match({
  "location": "Steps.iEnterProductName(String)"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "I click drop down in category and select item:\"Computers \u003e\u003e Desktops\"",
  "keyword": "Then "
});
formatter.match({
  "location": "Steps.iClickDropDownInCategoryAndSelectItem(String)"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "I click on search button",
  "keyword": "And "
});
formatter.match({
  "location": "Steps.iClickOnSearchButton()"
});
formatter.result({
  "status": "passed"
});
formatter.after({
  "status": "passed"
});
});