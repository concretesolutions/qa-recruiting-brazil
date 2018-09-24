Feature: Call Contact
  As a user from whatsapp
  I want to be able to call my contacts
  So I can talk to them

  Scenario: Call Contact
    Given I enter in whatsapp
    And I open the chat from "<Contact>" screen
    When I click on three dots menu
    And Touch on "Call Contact"
    Then The call is performed