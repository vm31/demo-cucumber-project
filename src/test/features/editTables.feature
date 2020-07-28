Feature: Edit tables
  Background:
    Given I enter email address:  "admin@yourstore.com" and password: "admin"
    And I click on login button

  Scenario Outline:Best Seller By Quality_Successful_Edit_ProductName
    When I navigate to dashboard
    Then I verify if page title is: "Dashboard / nopCommerce administration"
    Then I verify table Bestsellers by quantity is displayed
    And I click on view button:17
    Then I verify if page title is: "Edit product details / nopCommerce administration"
    And I edit product name "<myinput>"
    And I click on Save Button
    Then I verify successful message
    Examples:
      |myinput  |rownumber|
      |mango|17|
