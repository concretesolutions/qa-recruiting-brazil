# Created using an Android phone by Ely_araujo at 2/20/2020 
Feature: Sharing and attach function

  Scenario: Open the camera
    Given User is at a chat session
    When User touches on paper clip icon
    And Selects the camera option
    Then The camera should be opened 
    

  Scenario: Send an emoticon icon
    Given User is at a chat session
    When User touches in a emoticon icon besides the clip paper
    And Selects a smiley icon
    Then The smiley icon should be sent to the chat
    

  Scenario: Send an contact
    Given User is at a chat screen
    When User touches on paper clip icon
    And Selects contact number
    Then the contact selected should appear sent on the chat screen

  Scenario: Stop Live Location Sharing
    Given User is at a chat screen
    And User has shared location
    When User selects to stop sharing
    Then Location sharing stops
    And Location should stop on last user position

  Scenario: Share a location
    Given User is at a chat screen
    And There is a location shared on conversation
    When User selects forward message
    And Chooses the receiver
    And Confirm location forwarding
    Then Location is shared with receiver 