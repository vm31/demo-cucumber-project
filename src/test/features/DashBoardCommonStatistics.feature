Feature: dashboard Common statistics
  Background:
    Given user is on login page
    And I enter email address and password
    And I click on login button

  Scenario Outline:TC_01_Verify common statistics boxes with page title
    When I navigate to dashboard
    Then I verify if page title is: "Dashboard / nopCommerce administration"
    Then I verify if common statistics title is displayed
    And I verify common statistics boxes:"Registered customers" with title contains:"<title1>","<title2>","<title3>""<title4>"
    And I click on logout link
    Examples:
      | title1  | title2    | title3      | title4|
    | Orders | Return      |Customers | Low stock    |


