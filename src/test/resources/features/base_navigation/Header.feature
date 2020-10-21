Feature: Header navigation tools
  As user, i want to be able to search and clock in

  Background: open login page
    Given user is on the login page
    And user logs in as helpdesk

  @ClockInFull
  Scenario: verify full clockIn function
    When user clicks header "time"
    And  user clicks "Continue working day" button on clock popup
    Then  user inputs "dilyar" under "task" and submits
    And  user inputs start "05:00 pm" and end "05:30 pm" for event
    Then user inputs "aji" under "event" and submits

