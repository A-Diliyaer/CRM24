@MessageTab
Feature: MessageTab
  As a user i should be able to create message post

  Background: open login page
    Given user is on the login page
    And user logs in as helpdesk
    And user clicks menu "Activity Stream"
    And user clicks "Message" tab under Activity Stream

  @SingleFileAttached
  Scenario: upload single file from local disk, then send as attachement
    When user writes "old files" in content box
    And  user clicks on post button Upload files
    When user uploads local file "C:/Users/Aji/Desktop/CRM24/old6file.txt"
    And  "old6file.txt" should display under attached files
    When user clicks send button
    Then new feed should display with the "old6file.txt"

  @SingleImgAttached
  Scenario: upload single photo from local disk, then send as attachment
    When user writes "upload old screenshot" in content box
    And  user clicks on post button Upload files
    When user uploads local file "C:/Users/Aji/Desktop/CRM24/old6img.PNG"
    And  "old6img.PNG" should display under attached files
    When user clicks send button
    Then new feed should display with the "old6img.PNG"

  @addDestination
  Scenario: add employee from Employees and departments tab then send/verify message
    When user writes "old files" in content box
    And  user adds employee "helpdesk23@cybertekschool.com" from tab "Recent"
    And  employee "helpdesk23@cybertekschool.com" should appear in the destination box
    When user clicks send button
    Then new feed should be addressed to employee "helpdesk23@cybertekschool.com"

  @addLink
  Scenario: add link to message content then send/verify message
    When user clicks on post button Link
    And  user inputs "youtube" into "Link text" field
    And  user inputs "www.youtube.com" into "Link URL" field
    And  user clicks link "Save"
    And  user clicks send button
    When user clicks attached link "www.youtube.com" in new feed
    Then new window should load with given link "www.youtube.com"

  @insertVideo
  Scenario: insert a video to message content then send/verify message
    When user writes "singing dog" in content box
    When user clicks on post button Insert video
    And  user inputs "https://www.youtube.com/watch?v=_RzsPdmfcaw&ab_channel=TimbuFun" into "video URL" field
    And  user verify video selected successfully
    And  user clicks link "Save"
    And  user clicks send button
    Then user verify attached video title "The Voice Dog (Remix) By Timbu Fun - feat. Walter Geoffrey The Frenchie"

  @addQuote
  Scenario: add quote to message content then send/verify message
    When user clicks on post button Quote
    And  user enters text "Quote1" into QuoteBlock
    And  user clicks send button
    Then user verifies attached quote text "Quote1"

  @addMention
  Scenario: add mention to message content then send/verify message
    When user clicks on post button Add mention
    And  user adds mention "helpdesk22@cybertekschool.com" from tab "Recent"
    And  user clicks send button
    Then user verify mention "helpdesk22@cybertekschool.com"
    
  @addTag
  Scenario: add tag to message content then send/verify message
    When user writes "adding tag" in content box
    When user clicks on post button Add tag
    And  user adds tag "tag"
    And  user clicks send button
    Then user verify attached tag "tag" on new feed

