Feature: dashboard Common statistics
  Background:
    Given user is on login page
    And I enter email address:  "admin@yourstore.com" and password: "admin"
    And I click on login button

  Scenario:TC_01_Switching through dashboard Common statistics
    When I navigate to dashboard
#    Then I verify if page title is: "Dashboard / nopCommerce administration"
#    Then I verify if common statistics title is displayed
#    #all these belong to one page , one page will have one title (//title)
#    #if you want to assert in this way find element for each table header
    And I verify title for common statastics boxes title contains:"<title1>","<title2>","<title3>""<title14>"
    And I click on logout link
    Examples:
      | title1  | title2    | title3      | title14                                       |
    | Orders | Return      |Customers | Low stock    |

  Scenario: TC_02_Switching through best seller by Quantity products
    When I navigate to dashboard
##    Then I verify if page title is: "Dashboard / nopCommerce administration"
##    Then I verify table Bestsellers by quantity is displayed
##    And I click on view button:16 and verify page display header with product name
