$(document).ready(function() {var formatter = new CucumberHTML.DOMFormatter($('.cucumber-report'));formatter.uri("file:src/test/features/DashBoardCommonStatistics.feature");
formatter.feature({
  "name": "dashboard Common statistics",
  "description": "",
  "keyword": "Feature"
});
formatter.scenarioOutline({
  "name": "TC_01_Verify common statistics boxes with page title",
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
  "name": "I verify common statistics boxes:\"Registered customers\" with title contains:\"\u003ctitle1\u003e\",\"\u003ctitle2\u003e\",\"\u003ctitle3\u003e\"\"\u003ctitle4\u003e\"",
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
        "title4"
      ]
    },
    {
      "cells": [
        "Orders",
        "Return",
        "Customers",
        "Low stock"
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
  "location": "LoginStep.returnToLoginPage()"
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
  "location": "CommonActionsStep.i_click_on_login()"
});
formatter.result({
  "status": "passed"
});
formatter.scenario({
  "name": "TC_01_Verify common statistics boxes with page title",
  "description": "",
  "keyword": "Scenario Outline"
});
formatter.step({
  "name": "I navigate to dashboard",
  "keyword": "When "
});
formatter.match({
  "location": "BestSellerByQuantityStep.iNavigateToDashboard()"
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
  "location": "DashBoardCommonStatisticsStep.i_verify_if_common_statistics_title_is_displayed()"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "I verify common statistics boxes:\"Registered customers\" with title contains:\"Orders\",\"Return\",\"Customers\"\"Low stock\"",
  "keyword": "And "
});
formatter.match({
  "location": "DashBoardCommonStatisticsStep.iSelectBoxAndVerifyPageTitleContains(String,String,String,String,String)"
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
});