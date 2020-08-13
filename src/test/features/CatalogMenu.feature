Feature: Catalog menu button
  Background:
    Given user is on login page
    And I enter email address and password
    And I click on login button

  Scenario:TC_01_ product search by category_select_item_from_drop_down
    Given I select catalog menu item
    When I click on products button
    Then I verify page title is :"Products / nopCommerce administration" and "Products" is displayed
    And I enter product name "apple"
    And I click drop down in category and select item:"Computers >> Desktops"
    And I click on search button

