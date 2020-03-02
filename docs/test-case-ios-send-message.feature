Feature: SEND MESSAGE
  As a user
  In order to communicate with other users
  I want to send a message

  Scenario: User send a message successfully

    Given User is on a chat
    When a "message" is filled
    And "send button" is pressed
    Then a "message" is sent
    And one "tick" is displayed

  Scenario: User send a message and a message is delivered successfully

    Given User is on a chat
    When a "message" is filled
    And "send button" is pressed
    Then a "message" is sent
    And two "tick" are displayed

  Scenario: User not fill message field and is unable to send message

    Given User is on a chat
    When a "message" is not filled
    Then "send button" is not displayed