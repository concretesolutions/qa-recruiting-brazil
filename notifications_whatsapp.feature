Feature: 2 contact notifications

Scenario: Mute notifications for 1 year
Given using whatsapp
And select a conversation
And I click on settings
And I click to mute notifications
When I click ok
Then I can silence the contact

Scenario: Reactivate notifications
Given using whatsapp
And select a conversation
And I click on settings
When I click reactivate notifications
Then I can reactivate contact notifications