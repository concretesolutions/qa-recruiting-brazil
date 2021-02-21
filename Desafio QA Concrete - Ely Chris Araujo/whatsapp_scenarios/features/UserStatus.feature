# Created using an Android phone by Ely_araujo at 2/20/2020 
Feature: User Status

  Scenario: Add User status
    Given User is at Status Screen
    When User selects "My status" option
    And Takes a photo or video
    And Selects confirm option
    Then User status is posted on Status screen
     
  Scenario: Create a text status
    Given User is at Status Screen
    When User selects pencil icon
    And Insert "abc" on text field
    And Selects confirm option
    Then User status is posted with "abc" text
    

  Scenario: View a recent update
    Given User is at Status Screen
    And There is at least one status on recent updates
    When User selects a status from user "x"
    Then User "x" status is shown
    And User "x" status must be placed at viewed updates

  Scenario: Change User status privacy
    Given User is at "privacy" screen
    And There is at least one contact on user phone
    When User selects "status" option
    And Selects "Only share with..." option
    And Selects at least one contact from phone
    And Selects confirm option
    Then User Status privacy is changed to "Only share with..." 