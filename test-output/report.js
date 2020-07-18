$(document).ready(function() {var formatter = new CucumberHTML.DOMFormatter($('.cucumber-report'));formatter.uri("file:features/login.feature");
formatter.feature({
  "name": "Positive flow test cases",
  "description": "",
  "keyword": "Feature"
});
formatter.scenarioOutline({
  "name": "Successful login with valid credentials",
  "description": "",
  "keyword": "Scenario Outline"
});
formatter.step({
  "name": "i enter email address as \"\u003cemail\u003e\" and password as \"\u003cpassword\u003e\"",
  "keyword": "Then "
});
formatter.step({
  "name": "i click on login",
  "keyword": "Given "
});
formatter.step({
  "name": "page title should be \"Dashboard / nopCommerce administration\"",
  "keyword": "Then "
});
formatter.step({
  "name": "i click on logout link",
  "keyword": "When "
});
formatter.step({
  "name": "page title should be \"Your store. Login\"",
  "keyword": "Then "
});
formatter.examples({
  "name": "",
  "description": "",
  "keyword": "Examples",
  "rows": [
    {
      "cells": [
        "email",
        "password"
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
  "name": "i open home page \"https://admin-demo.nopcommerce.com/login\"",
  "keyword": "Given "
});
formatter.match({
  "location": "loginStep.i_open_home_page(String)"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "verify amazon home display",
  "keyword": "Then "
});
formatter.match({
  "location": "loginStep.verify_amazon_home_display()"
});
formatter.result({
  "status": "passed"
});
formatter.scenario({
  "name": "Successful login with valid credentials",
  "description": "",
  "keyword": "Scenario Outline"
});
formatter.step({
  "name": "i enter email address as \"admin@yourstore.com\" and password as \"admin\"",
  "keyword": "Then "
});
formatter.match({
  "location": "loginStep.i_enter_email_address_as_and_password_as(String,String)"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "i click on login",
  "keyword": "Given "
});
formatter.match({
  "location": "loginStep.i_click_on_login()"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "page title should be \"Dashboard / nopCommerce administration\"",
  "keyword": "Then "
});
formatter.match({
  "location": "loginStep.page_title_should_be(String)"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "i click on logout link",
  "keyword": "When "
});
formatter.match({
  "location": "loginStep.i_click_on_logout_link()"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "page title should be \"Your store. Login\"",
  "keyword": "Then "
});
formatter.match({
  "location": "loginStep.page_title_should_be(String)"
});
formatter.result({
  "status": "passed"
});
formatter.after({
  "status": "passed"
});
});