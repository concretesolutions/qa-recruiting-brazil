# Created by arthurw at 8/18/2020
Feature: User Status

  Scenario: Add User status
    Given User is at Status Screen
    When User selects "My status" option
    And Takes a photo or video
    And Selects confirm option
    Then User status is posted
    And User Status must be on Status screen

  Scenario: Create a text status
    Given User is at Status Screen
    When User selects pencil icon
    And Insert "abc" on text field
    And Selects confirm option
    Then User status is posted
    And Status must contain "abc" text

  Scenario: View a recent update
    Given User is at Status Screen
    And There is at least one status on recent updates
    When User selects a status from user "x"
    Then User "x" status is shown
    And User "x" status must be placed at viewed updates

  Scenario: Mute an User status
    Given User is at Status screen
    And There is at least one status on Status screen
    When User selects a status from user "x"
    And Selects settings option at top right corner
    And Selects "mute" option
    And Selects "confirm" option
    Then User "x" status must be placed at viewed updates

  Scenario: Change User status privacy
    Given User is at "privacy" screen
    And There is at least one contact on user phone
    When User selects "status" option
    And Selects "Only share with..." option
    And Selects at least one contact from phone
    And Selects confirm option
    Then User Status privacy is changed to "Only share with..."