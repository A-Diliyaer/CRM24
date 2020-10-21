@Login
Feature: Login
  As user, I want to be able to login with username and password

  Background: open login page
    Given user is on the login page

  @any
  Scenario: login as helpdesk and verify title
    When user logs in as helpdesk
    Then user should verify title is Portal

  @role
  Scenario Outline: Login as helpdesk and verify that current user is helpdesk
    When user logs in as <role>
    Then user should verify title is Portal
    Examples:
    |role|
    |helpdesk |
    |marketing|
    |hr       |

  @ErrorMsg
  Scenario: login with unauthorized credentials and verify error msg
    When user enters helpdesk@cybertek and user123
    Then user should verify errorMsg

  @credentials
  Scenario Outline: user names test for user <name>
    When user enters <username> and <password>
    Then user name should be <name>
    Examples: credentials
    |          username            | password |           name               |
    |helpdesk99@cybertekschool.com | UserUser |helpdesk99@cybertekschool.com |
    |marketing99@cybertekschool.com| UserUser |marketing99@cybertekschool.com|
    |hr99@cybertekschool.com       | UserUser |hr99@cybertekschool.com       |