Feature: Catalog menu button
  Background:
    Given I launch url "https://admin-demo.nopcommerce.com/login"
    Then  verify amazon home display
    Given I enter email address:  "admin@yourstore.com" and password: "admin"
    When I click on login button

  Scenario: product search by category_select_item_from_drop_down
    When I click on catalog menu item
    Then I click on products button
    Then I verify page title is :"Products / nopCommerce administration" and "Products" is displayed
    Then I enter product name "apple"
    Then I check drop down options
#    And I click on search button

