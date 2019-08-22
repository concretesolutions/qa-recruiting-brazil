Feature: Changing my name in Whatsapp Web

In order to make people to identify myself
As a user
I want to edit my name to add the same name as my friends use to call me

@changeName
Scenario: Changing a profile picture
    Given I am logged in on Whatsapp Web
	When I click on the small profile picture icon on the left
    And I click on the pencil beside my current name
    And I type my new name
    And I save it
	Then I should see my name updated