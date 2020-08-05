Feature:Positive flow test cases
   Background:
     Given user is on login page
     And I enter email address:  "admin@yourstore.com" and password: "admin"
     And I click on login button

  Scenario:TC_01_Successful logout
    Then I verify if page title is: "Dashboard / nopCommerce administration"
    And I click on logout link
    Then I verify if login page is displayed






