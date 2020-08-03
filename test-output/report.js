$(document).ready(function() {var formatter = new CucumberHTML.DOMFormatter($('.cucumber-report'));formatter.uri("file:src/test/features/DashboardEdit.feature");
formatter.feature({
  "name": "dashboard Common statistics",
  "description": "",
  "keyword": "Feature"
});
formatter.scenarioOutline({
  "name": "Switching through dashboard Common statistics",
  "description": "",
  "keyword": "Scenario Outline"
});
formatter.step({
  "name": "I navigate to dashboard",
  "keyword": "When "
});
formatter.step({
  "name": "I verify if page title is: \"Dashboard / nopCommerce administration\"",
  "keyword": "Then "
});
formatter.step({
  "name": "I verify if common statistics title is displayed",
  "keyword": "Then "
});
formatter.step({
  "name": "I select box:\"Pending return requests\" and verify page title is:\"\u003ctitle1\u003e\",\"\u003ctitle2\u003e\",\"\u003ctitle3\u003e\"\"\u003ctitle14\u003e\"",
  "keyword": "And "
});
formatter.step({
  "name": "I click on logout link",
  "keyword": "And "
});
formatter.examples({
  "name": "",
  "description": "",
  "keyword": "Examples",
  "rows": [
    {
      "cells": [
        "title1",
        "title2",
        "title3",
        "title14"
      ]
    },
    {
      "cells": [
        "Orders / nopCommerce administration",
        "Return requests / nopCommerce administration",
        "Customers / nopCommerce administration",
        "Low stock / nopCommerce administration"
      ]
    }
  ]
});
formatter.background({
  "name": "",
  "description": "",
  "keyword": "Background"
});
formatter.step({
  "name": "user is on login page",
  "keyword": "Given "
});
formatter.match({
  "location": "LoginStep.userIsOnLoginPage()"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "I enter email address:  \"admin@yourstore.com\" and password: \"admin\"",
  "keyword": "And "
});
formatter.match({
  "location": "LoginStep.i_enter_email_address_as_and_password_as(String,String)"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "I click on login button",
  "keyword": "And "
});
formatter.match({
  "location": "LoginStep.i_click_on_login()"
});
formatter.result({
  "status": "passed"
});
formatter.scenario({
  "name": "Switching through dashboard Common statistics",
  "description": "",
  "keyword": "Scenario Outline"
});
formatter.step({
  "name": "I navigate to dashboard",
  "keyword": "When "
});
formatter.match({
  "location": "DashboardEditStep.iNavigateToDashboard()"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "I verify if page title is: \"Dashboard / nopCommerce administration\"",
  "keyword": "Then "
});
formatter.match({
  "location": "LoginStep.page_title_should_be(String)"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "I verify if common statistics title is displayed",
  "keyword": "Then "
});
formatter.match({
  "location": "DashboardEditStep.i_verify_if_common_statistics_title_is_displayed()"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "I select box:\"Pending return requests\" and verify page title is:\"Orders / nopCommerce administration\",\"Return requests / nopCommerce administration\",\"Customers / nopCommerce administration\"\"Low stock / nopCommerce administration\"",
  "keyword": "And "
});
formatter.match({
  "location": "DashboardEditStep.iSelectBoxAndVerifyPageTitleIs(String,String,String,String,String)"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "I click on logout link",
  "keyword": "And "
});
formatter.match({
  "location": "LoginStep.i_click_on_logout_link()"
});
formatter.result({
  "status": "passed"
});
formatter.background({
  "name": "",
  "description": "",
  "keyword": "Background"
});
formatter.step({
  "name": "user is on login page",
  "keyword": "Given "
});
formatter.match({
  "location": "LoginStep.userIsOnLoginPage()"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "I enter email address:  \"admin@yourstore.com\" and password: \"admin\"",
  "keyword": "And "
});
formatter.match({
  "location": "LoginStep.i_enter_email_address_as_and_password_as(String,String)"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "I click on login button",
  "keyword": "And "
});
formatter.match({
  "location": "LoginStep.i_click_on_login()"
});
formatter.result({
  "status": "passed"
});
formatter.scenario({
  "name": "Switching through best seller by Quantity products",
  "description": "",
  "keyword": "Scenario"
});
formatter.step({
  "name": "I navigate to dashboard",
  "keyword": "When "
});
formatter.match({
  "location": "DashboardEditStep.iNavigateToDashboard()"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "I verify if page title is: \"Dashboard / nopCommerce administration\"",
  "keyword": "Then "
});
formatter.match({
  "location": "LoginStep.page_title_should_be(String)"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "I verify table Bestsellers by quantity is displayed",
  "keyword": "Then "
});
formatter.match({
  "location": "DashboardEditStep.iVerifyTableHeaderIsDisplayed()"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "I click on view button:16 and verify page display header with product name",
  "keyword": "And "
});
formatter.match({
  "location": "DashboardEditStep.iClickOnViewButtonAndVerifyPageDisplayHeaderWithProductName(int)"
});
formatter.result({
  "status": "passed"
});
});