Feature:Positive flow test cases
  Background:
    Given i open home page "https://admin-demo.nopcommerce.com/login"
    Then  verify amazon home display
  Scenario Outline:Successful login with valid credentials
    Then i enter email address as "<email>" and password as "<password>"
    Given i click on login
    Then page title should be "Dashboard / nopCommerce administration"
    When i click on logout link
    Then page title should be "Your store. Login"
    Examples:
      |email  |password|
      |admin@yourstore.com|admin|