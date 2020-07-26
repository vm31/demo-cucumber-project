Feature: driver actions

  Background:
    Given I launch url "https://admin-demo.nopcommerce.com/login"

    Scenario:verify driver actions
      When I click on back button
      Then I click on forward button
      Then I click on maximize button
      Then I click on refresh button
      And I click on minimize button
