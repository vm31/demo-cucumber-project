Feature: driver actions

  Scenario:verify back button
    When I click on back button
    Then I verify
  Scenario: verify forward button
    When I click on forward button
    Then I verify
  Scenario: verify maximize button
    When I click on maximize button
    Then I verify
  Scenario: verify refresh button
    When I click on refresh button
    Then I verify
    And I click on minimize button
