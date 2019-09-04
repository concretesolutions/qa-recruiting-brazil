Feature: Whatsappweb function
Description: Change the wallpaper at whatsappweb
 
Scenario: User needs to be logged on whatsappweb and must have at least one contacts	
	Given that i am on conversation area
	When i click on an existing conversation
	And i click on menu
	And i click on wallpapers conversation
	Then i choose the desired color