Feature: Login Feature using input data from excel
  This feature is responsible for testing all the scenarios related to application authentication

  @web
  Scenario: Check Login functionality with correct username and password
    Given Customer open binup-jewelry application
    When he clicks sign in link
    And enters UserName and Password provided in excel
    When he clicks login button
    Then he should see welcome greeting after successful login