Feature: 1 contact lock and unlock

Scenario: Block an existing contact
Given using whatsapp
And select a conversation
And I click on settings
And I click more
When I click block
Then I can block contact

Scenario: unblock an existing contact
Given using whatsapp
And select a conversation
And I click on settings
And I click more
When I click unlock
Then I can unblock contact