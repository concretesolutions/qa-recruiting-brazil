Fature: Invite friends to use WhatsApp
	This feature is used to invite anyone to use WhatsApp
	The invite can be sent through a number of social medias and other tools
	In order for these tests to be performed, the test user must have an account 
	on the following services: WhatsApp, Instagram and Gmail (E-mail and Hangouts)
	
	Background:
	Given The user enter WhatsApp
	And   press the three vertical dots on the right upper side of the screen
	And   press Settings
	And   press Invite a Friend
	
	Scenario: Invite a friend through Instagram
		Given the user press the Instagram icon
		And   the user is redirected to Instagram
		When  choose a contact and press SEND
		Then  the SEND button changes to UNDO
	
	Scenario: Invite a friend through Hangouts
		Given the user press the Hangouts icon
		And   the user is redirected to Hangouts
		And   choose a contact from the list shown
		And   a premade invite message is shown on the chat text box
		When  the user press the green arrow to send the message
		Then  the message is displayed on the chat area
		And   below it the text Now indicates that it was sent
	
	Scenario: Invite a friend through Gmail
		Given the user press the Gmail icon
		And   the user is redirected to Gmail
		And   a premade email is shown
		And   a email is informed on the To field
		When  the user press the white arrow to send the email
		Then  the user is redirected to the Settings acreen from WhatsApp
		
