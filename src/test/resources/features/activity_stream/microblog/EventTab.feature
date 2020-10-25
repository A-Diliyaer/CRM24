Feature: add custom events and post
  As a usr I want to create custom events

  Background: user navigate to event tab
    Given user is on the login page
    And user logs in as helpdesk
    And user clicks menu "Activity Stream"
    And user clicks "Event" tab under Activity Stream

  @createEvent
  Scenario: create custom event
    And  user writes event title "code review" event content "bitrix overview"
    Then user enters event "start" date "October 30 2020"
    And  user enters event "end" date "October 30 2020"
    Then user enters event "start" time "02:30 PM"
    And  user enters event "end" time "04:30 PM"
    And  user clicks addMore option
    Then user selects from dropdown "Availability" option "Free"
    Then user selects from dropdown "Repeat" option "Daily"
    Then user selects from dropdown "Calendar" option "helpdesk99@cybertekschool.com"
    Then user selects from dropdown "Importance" option "High"
    Then user clicks send button



