Feature: Best seller By Quantity table
  Background:
    Given user is on login page
    And I enter email address and password
    And I click on login button

  Scenario Outline:TC_01_Best Seller By Quality_Successful_Edit_ProductName
    When I navigate to dashboard
    Then I verify if page title is: "Dashboard / nopCommerce administration"
    Then I verify table Bestsellers by quantity is displayed
    And I click on view button:16
    Then I verify if page title is: "Edit product details / nopCommerce administration"
    And I edit product name "<myinput>"
    And I click on Save Button
    Then I verify successful message
    Examples:
      |myinput  |
      |mango|
  Scenario: TC_02_verify best seller by Quantity products name after clicking view button with page header
    When I navigate to dashboard
    Then I verify if page title is: "Dashboard / nopCommerce administration"
    Then I verify table Bestsellers by quantity is displayed
    And I click on view button:16 and verify page display header with product name


