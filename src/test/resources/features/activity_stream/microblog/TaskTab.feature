Feature: Task Tab
  As a user I should be able to create customized task

  Background: open login page
    Given user is on the login page
    And user logs in as helpdesk
    And user is on "Activity Stream" module
    And user clicks "Task" tab under Activity Stream

  @createTask
  Scenario: create a simple task then verify in live feed
    When user writes task title "Calendar" and task content "user story #1 AC1"
    And  user sets task to high priority
    Then user assigns role "Responsible person" to employee "helpdesk22@cybertekschool.com"
    Then user assigns role "Participants" to employee "helpdesk23@cybertekschool.com"
    Then user assigns role "Observers" to employee "helpdesk25@cybertekschool.com"
    Then user sets deadline to "November 5 2020-04 30 PM"
    Then user submits task and verifies confirmation message "Task has been created"


  @additionalTaskCriteria
  Scenario: create a task with additional Criteria
    When user writes task title "Arpat Task" and task content "user story #1 AC1"
    And  user sets task to high priority
    Then user assigns role "Responsible person" to employee "helpdesk22@cybertekschool.com"
    Then user assigns role "Participants" to employee "helpdesk23@cybertekschool.com"
    Then user assigns role "Observers" to employee "helpdesk25@cybertekschool.com"
    Then user sets deadline to "November 5 2020-04 30 PM"
    Then user clicks more option button
    And  user selects checkbox "Task planned time"
    And  user enters task planned time "4"hrs "30"mins
    Then user adds calendar reminder for "November 5 2020-04 30 PM"
    And  user selects reminder assignee "to creator"
    Then user selects reminder type "instant" message
    Then user selects checkbox "Activate"
    Then user selects task type "Gantt" and attaches task "Calendar [2356]"
    Then user selects task type "Subtask of" and attaches task "reminder [2354]"
    Then user selects task type "Dependent tasks" and attaches task "deadline [2352]"
    Then user submits task and verifies confirmation message "Task has been created"

  @RepeatedTask
  Scenario: create a simple repeated task
    When user writes task title "Arpat Task" and task content "user story #1 AC1"
    And  user assigns role "Responsible person" to employee "helpdesk22@cybertekschool.com"
    And  user clicks more option button
    And  user selects checkbox "Activate"
    Then user selects repeat term "day"
    And  user selects "1-work day" with an interval of "1 month"
    Then user sets "Task created on:" to "10 30 PM"
    And  user sets "Make recurring after:" to "November 10 2020"












