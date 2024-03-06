Feature: Register Functionality
  @Register
  Scenario: create an account
    Given   User open the browser
    When    User fill the credential and click on register
    Then    Account should be created