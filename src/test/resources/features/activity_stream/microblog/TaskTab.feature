Feature: Task Tab
  As a user I should be able to create customized task

  Background: open login page
    Given user is on the login page
    And user logs in as helpdesk
    And user clicks menu "Activity Stream"
    And user clicks "Task" tab under Activity Stream

  @createTask
  Scenario: create a simple task then verify in live feed
    When user writes task title "title" and task content "user story #1 AC1"
    And  user sets task to high priority
    Then user assigns role "Responsible person" to employee "helpdesk22@cybertekschool.com"
    Then user assigns role "Participants" to employee "helpdesk23@cybertekschool.com"
    Then user assigns role "Observers" to employee "helpdesk25@cybertekschool.com"
    Then user sets deadline to "October 30 2020-04 30 PM"
