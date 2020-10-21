@Config
Feature: base page config settings
  As user, I want to be able to set homepage and verify

  Background: open login page
    Given user is on the login page
    And user logs in as helpdesk

  @defaultHome
  Scenario: verify default homepage
    When user clicks header "logo"
    Then Activity Stream page should load

  @customHome
  Scenario: verify custom homepage selection
    When user hovers over Tasks and clicks on edit icon
    And user clicks edit option Make home page for all Bitrix24
    And  user clicks header "logo"
    Then Tasks page should load

