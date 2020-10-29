Feature: add custom polls and post
  As a usr I want to create custom polls

  Background: user navigate to poll tab
    Given user is on the login page
    And user logs in as helpdesk
    And user clicks menu "Activity Stream"
    And user clicks "Poll" tab under Activity Stream

  @createPoll
  Scenario: user create poll with 2 questions
    And  user writes poll content "group poll"
    And  user adds employee "helpdesk23@cybertekschool.com" from tab "Recent"
    Then user enters question "1" content "what would you like for lunch?"
    And  user enters answer "1" content "steak"
    And  user enters answer "2" content "pasta"
    And  user adds another question
    Then user enters question "2" content "what would you like for drinks?"
    And  user enters answer "1" content "soda"
    And  user enters answer "2" content "tea"
    Then user clicks send button


