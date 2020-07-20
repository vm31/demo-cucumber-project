$(document).ready(function() {var formatter = new CucumberHTML.DOMFormatter($('.cucumber-report'));formatter.uri("file:src/test/features/login.feature");
formatter.feature({
  "name": "Positive flow test cases",
  "description": "",
  "keyword": "Feature"
});
formatter.scenarioOutline({
  "name": "Successful logout",
  "description": "",
  "keyword": "Scenario Outline"
});
formatter.step({
  "name": "I enter email address:  \"\u003cEMAIL\u003e\" and password: \"\u003cPASSWORD\u003e\"",
  "keyword": "Given "
});
formatter.step({
  "name": "I click on login button",
  "keyword": "Given "
});
formatter.step({
  "name": "I verify if page title is \"Dashboard / nopCommerce administration\"",
  "keyword": "Then "
});
formatter.step({
  "name": "I click on logout link",
  "keyword": "When "
});
formatter.step({
  "name": "I am on login page",
  "keyword": "Then "
});
formatter.examples({
  "name": "",
  "description": "",
  "keyword": "Examples",
  "rows": [
    {
      "cells": [
        "EMAIL",
        "PASSWORD"
      ]
    },
    {
      "cells": [
        "admin@yourstore.com",
        "admin"
      ]
    }
  ]
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
  "name": "I open home page \"https://admin-demo.nopcommerce.com/login\"",
  "keyword": "Given "
});
formatter.match({
  "location": "Steps.i_open_home_page(String)"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "verify amazon home display",
  "keyword": "Then "
});
formatter.match({
  "location": "Steps.verify_amazon_home_display()"
});
formatter.result({
  "status": "passed"
});
formatter.scenario({
  "name": "Successful logout",
  "description": "",
  "keyword": "Scenario Outline"
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
  "keyword": "Given "
});
formatter.match({
  "location": "Steps.i_click_on_login()"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "I verify if page title is \"Dashboard / nopCommerce administration\"",
  "keyword": "Then "
});
formatter.match({
  "location": "Steps.page_title_should_be(String)"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "I click on logout link",
  "keyword": "When "
});
formatter.match({
  "location": "Steps.i_click_on_logout_link()"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "I am on login page",
  "keyword": "Then "
});
formatter.match({
  "location": "Steps.iAmOnLoginPage()"
});
formatter.result({
  "status": "passed"
});
formatter.after({
  "status": "passed"
});
formatter.scenarioOutline({
  "name": "Edit Name in Best sellers by Quality table",
  "description": "",
  "keyword": "Scenario Outline"
});
formatter.step({
  "name": "I enter email address:  \"\u003cEMAIL\u003e\" and password: \"\u003cPASSWORD\u003e\"",
  "keyword": "Given "
});
formatter.step({
  "name": "I click on login button",
  "keyword": "Given "
});
formatter.step({
  "name": "I verify if page title is \"Dashboard / nopCommerce administration\"",
  "keyword": "Then "
});
formatter.step({
  "name": "I verify table header is displayed",
  "keyword": "Then "
});
formatter.step({
  "name": "I click on view button",
  "keyword": "When "
});
formatter.step({
  "name": "I verify if page title is \"Edit product details / nopCommerce administration\"",
  "keyword": "Then "
});
formatter.step({
  "name": "I edit product name",
  "keyword": "Then "
});
formatter.step({
  "name": "I click on Save Button",
  "keyword": "Then "
});
formatter.examples({
  "name": "",
  "description": "",
  "keyword": "Examples",
  "rows": [
    {
      "cells": [
        "EMAIL",
        "PASSWORD"
      ]
    },
    {
      "cells": [
        "admin@yourstore.com",
        "admin"
      ]
    }
  ]
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
  "name": "I open home page \"https://admin-demo.nopcommerce.com/login\"",
  "keyword": "Given "
});
formatter.match({
  "location": "Steps.i_open_home_page(String)"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "verify amazon home display",
  "keyword": "Then "
});
formatter.match({
  "location": "Steps.verify_amazon_home_display()"
});
formatter.result({
  "status": "passed"
});
formatter.scenario({
  "name": "Edit Name in Best sellers by Quality table",
  "description": "",
  "keyword": "Scenario Outline"
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
  "keyword": "Given "
});
formatter.match({
  "location": "Steps.i_click_on_login()"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "I verify if page title is \"Dashboard / nopCommerce administration\"",
  "keyword": "Then "
});
formatter.match({
  "location": "Steps.page_title_should_be(String)"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "I verify table header is displayed",
  "keyword": "Then "
});
formatter.match({
  "location": "Steps.iVerifyTableHeaderIsDisplayed()"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "I click on view button",
  "keyword": "When "
});
formatter.match({
  "location": "Steps.iClickOnViewButton()"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "I verify if page title is \"Edit product details / nopCommerce administration\"",
  "keyword": "Then "
});
formatter.match({
  "location": "Steps.page_title_should_be(String)"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "I edit product name",
  "keyword": "Then "
});
formatter.match({
  "location": "Steps.iEditProductName()"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "I click on Save Button",
  "keyword": "Then "
});
formatter.match({
  "location": "Steps.iClickOnSaveButton()"
});
formatter.result({
  "status": "passed"
});
formatter.after({
  "status": "passed"
});
});