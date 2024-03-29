Feature: add custom events and post
  As a usr I want to create custom events

  Background: user navigate to event tab
    Given user is on the login page
    And user logs in as helpdesk
    And user is on "Activity Stream" module
    And user clicks "Event" tab under Activity Stream

  @createEvent
  Scenario: create custom event
    And  user writes event title "code review" event content "bitrix overview"
    Then user enters event "start" date "November 5 2020"
    And  user enters event "end" date "November 10 2020"
    Then user enters event "start" time "02:30 PM"
    And  user enters event "end" time "04:30 PM"
    And  user clicks addMore option
    Then user selects from dropdown "Availability" option "Free"
    Then user selects from dropdown "Repeat" option "Daily"
    Then user selects from dropdown "Calendar" option "helpdesk99@cybertekschool.com"
    Then user selects from dropdown "Importance" option "High"
    Then user clicks send button



