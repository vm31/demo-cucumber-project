Feature: dashboard Common statistics
  Background:
    Given I enter email address:  "admin@yourstore.com" and password: "admin"
    And I click on login button

  Scenario Outline:Switching through dashboard Common statistics
    When I navigate to dashboard
    Then I verify if page title is: "Dashboard / nopCommerce administration"
    Then I verify if common statistics title is displayed
    And I select box:"Pending return requests" and verify page title is:"<title1>","<title2>","<title3>""<title14>"
    Examples:
      | title1                           | title2 | title3 | title14 |
    | Orders / nopCommerce administration|  Return requests / nopCommerce administration|Customers / nopCommerce administration| Low stock / nopCommerce administration        |