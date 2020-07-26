Feature: Catalog menu button
  Background:
    Given user is on signin page
    Then  I verify title is: ""
    When I enter email address:  "admin@yourstore.com" and password: "admin"
    And I click on login button
    Then I verify

  Scenario: product search by category_select_item_from_drop_down
    When I click on catalog menu item
    Then I click on products button
    Then I verify page title is :"Products / nopCommerce administration" and "Products" is displayed
    Then I enter product name "apple"
    Then I click drop down in category and select item:"computers"
    And I click on search button

