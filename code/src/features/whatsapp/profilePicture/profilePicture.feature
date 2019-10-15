Feature: See and change profile picture
		 As a user
	     I want see which picture I`m using in my profile and change it
	     So I can update my profile and check my data

Scenario: See profile picture at configuration view
	Given I`m at the main view
	When I open the menu
	And click "Configuration" option
	Then I see my actual picture
	
Scenario: See profile picture at profile view
	Given I`m at the main view
	When I open the menu
	And click "Configuration" option
	And I click the profile picture
	Then I see my actual picture enlarged

Scenario: Change profile picture
	Given I`m at the main view
	When I open the menu
	And click "Configuration" option
	And I click the profile picture
	And I click at camera
	And I select a picture on my phone
	Then I see that my profile picture has changed
