Feature: Create Groups
    As a User 
    I want to create groups
    In order to have a conversation with more than one contact simultaneously

    Background:
        Given that whatsapp is installed
        And the user have at least one contact registered

    Scenario Outline: Create a group by more options menu
        Given that whatsapp is opened
        When I click on the "More Options" button
        And click on "Create New Group" option
        And add any contact to the group
        And click on the next button
        And give the name "<group_name>" to the group
        And click on the confirm button
        Then I should see the "<expected_group_name>" on the top of the conversation

        Examples:
            | group_name | expected_group_name |
            | New Group  | New Group           |
            | Group With More Than 25 Caracteres | Group With More Than 25 C |
            | !@#$%¨&*()ç° | !@#$%¨&*()ç°      |

    Scenario Outline: Create a group by the new conversation menu
        Given that whatsapp is opened
        When I click on the "New Conversation" button
        And click on "Create New Group" option
        And add any contact to the group
        And click on the next button
        And give the name "<group_name>" to the group
        And click on the confirm button
        Then I should see the "<expected_group_name>" on the top of the conversation

        Examples:
            | group_name | expected_group_name |
            | New Group  | New Group           |
            | Group With More Than 25 Caracteres | Group With More Than 25 C |
            | !@#$%¨&*()ç° | !@#$%¨&*()ç°      |

    Scenario: Trying to create a group without contacts
        Given that whatsapp is opened
        When I click on the "More Options" button
        And click on "Create New Group" option
        And click on the next button
        Then I should see a message saying "At least 1 contact must be selected"

    Scenario: Simulate a network failure during creation of the group
        Given that whatsapp is opened
        When I click on the "More Options" button
        And click on "Create New Group" option
        And add any contact to the group
        And click on the next button
        And give the name "Failed Group" to the group
        And force a connection failure
        And click on the confirm button
        Then I should see the group "Failed Group" with the message "Couldn't create. Tap to retry."
    
    Scenario: Retry group creation after network failure
        Given that whatsapp is opened
        When I click on the "More Options" button
        And click on "Create New Group" option
        And add any contact to the group
        And click on the next button
        And give the name "Retry Group" to the group
        And force a connection failure
        And click on the confirm button
        And I reconnect the device
        And click on the group "Retry Group"
        Then I should see the created group "Retry Group"