Feature: Invalid Login Feature using Scenario Outline and Examples keyword
  Description: This feature is responsible for testing all the scenarios related to application authentication
  Scenario Outline: Verify Login functionality with invalid credentials using Examples

    Given User opens binup-jewelry application
    When User clicks sign in link
    And User enters "<username>" and "<password>"
    And User clicks login button
    Then invalid account message is displayed

  Examples:
  | username  | password  |
  | bin1@email.com | password1 |
  | bin22@jewelry.com | password2 |