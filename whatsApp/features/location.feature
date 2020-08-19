Feature: Location Sharing

  Scenario: Send Current Location
    Given User is at a chat screen
    When User touches on paper clip icon
    And Selects location option
    And Chooses to send current location
    Then Location is sent on chat
    And Location must be compliant with actual user location

  Scenario: Share Live Location
    Given User is at a chat screen
    When User touches on paper clip icon
    And Selects location option
    And Chooses to share live location
    And Selects 15 minutes option
    And Selects send button
    Then Location is shared on chat
    And Location must be on for 15 minutes

  Scenario: Refresh nearby places
    Given User is at a chat screen
    When User touches on paper clip icon
    And Selects location option
    And Selects refresh button
    Then List of nearby places is updated

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