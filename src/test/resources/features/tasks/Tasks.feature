Feature: Tasks Module

  Background: open login page
    Given user is on the login page
    And user logs in as helpdesk
    And user is on "Tasks" module

  Scenario: create quick task
    Given user creates quick task without options
    And user




