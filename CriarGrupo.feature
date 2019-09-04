Feature: Plataforma de Aceitação
Description: Creating a new group

Scenario: User needs to be logged on whatsappweb
	Given that i am on conversation area
	When i acess a new conversation 
	And i click at new group
	And i write an name
	And i click on the arrow button
	And i write the group name
	Then i created the new group