Feature: SEARCH CHATS
    As a user
    In order to find previous conversations
    I want to search chats

    Scenario: User search for a chat and is able to find it

        Given User is on chat list
        When "a term search" is entered
        Then a "list" of chats is displayed

    Scenario: User search for a chat and is unable to find it

        Given User is on chat list
        When "a term search" is entered
        Then a the message "No Results" is displayed

    Scenario: User search for a chat and cancel

        Given User is on chat list
        When "a term search" is entered
        And a "chat list found" is displayed
        And "Cancel" is pressed
        Then the "original chat list" is displayed