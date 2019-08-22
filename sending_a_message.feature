Feature: Searching and sending a message to a contact

In order to talk with my family and friends
As a user
I want to send messages easily

Scenario Outline: Sending a message to some contacts
    Given I am logged in on Whatsapp Web
    When I search for <contact>
    And I click on <contact> to open a conversation
    And I send <message>
	Then I should see the <message> sent to <contact>
Examples:
| contact | message                   |
| Pai     | Oi, pai!                  |
| Pam     | Boa tarde, Pam! Tudo bem? |