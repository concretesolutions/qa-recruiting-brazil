Feature: Start a chat and send the first message
	This feature is about starting a chat with 
	any given contact from the users contact list 
	and send a message to them
	
	Scenario Outline: Send message to new contacts
		Given the user have <Contact> contact on his contact list
		And   open WhatsApp app
		And   don't have an opened chat with <Contact>
		And   press the New Chat icon
		And   select <Contact> from the list
		And   a new chat window with the selected contact is displayed
		When  the user write a <Message> to the selected contact
		And   press Send
		Then  the message is added to the chat area
		And   a small check sign appears on the lower right corner of the message indicating that it was sent
		Examples:
		|Contact |Message         |
		|Augusto |Hey...    	    |
		|Rodrigo |Hello man!      |
		|Jessica |Hi, how are you?|
		|Beatriz |What's up?	    |
