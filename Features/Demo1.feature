Feature: My Account Login feature
  Description: This Feature will Test a login feature

  Scenario: login with valid username and password
    Given open browser
    When enter the url "https://www.facebook.com/"
    And Enter username and password
    And Click on login button
    And close browser