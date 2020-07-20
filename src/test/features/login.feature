Feature:Positive flow test cases
  Background:
    Given I open home page "https://admin-demo.nopcommerce.com/login"
    Then  verify amazon home display

  Scenario Outline:Successful logout
    Given I enter email address:  "<EMAIL>" and password: "<PASSWORD>"
    Given I click on login button
    Then I verify if page title is "Dashboard / nopCommerce administration"
    When I click on logout link
    #Then I verify if page title is "Your store. Login"
    Then I am on login page
    Examples:
      |EMAIL  |PASSWORD|
      |admin@yourstore.com|admin|


  Scenario Outline:Edit Name in Best sellers by Quality table
    Given I enter email address:  "<EMAIL>" and password: "<PASSWORD>"
    Given I click on login button
    Then I verify if page title is "Dashboard / nopCommerce administration"
    Then I verify table header is displayed
    When I click on view button
    Then I verify if page title is "Edit product details / nopCommerce administration"
    Then I edit product name
    Then I click on Save Button



    Examples:
      |EMAIL  |PASSWORD|
      |admin@yourstore.com|admin|