Feature: Access WhatsApp via browser
		 As a user
	     I want to access my messages with a browser
	     So I can talk to my friends without my phone

Scenario Outline: Access WhatsApp Web for the first time
	Given I have the <Browser> open
	And I`m at the WhatsApp page
	And I have my WhatsApp phone app active
	And I never user WhatsAppWeb before
	When I access the general menu
	And click "WhatsApp Web" option
	And I target my phone camera to the QR code on the <Browser>
	Then I`m connected to the app on the browser
	
	Examples:
	|Browser          |
	|Internet Explorer|
	|Google Chrome    |
	|Mozilla Firefox  |
	|Opera            |
	|Safari           |
	
Scenario Outline: Access WhatsApp Web on a known computer
	Given I have the <Browser> open
	When I access the WhatsApp page
	Then I`m connected to the app on the browser	
	Examples:
	|Browser          |
	|Internet Explorer|
	|Google Chrome    |
	|Mozilla Firefox  |
	|Opera            |
	|Safari           |
	
Scenario Outline: Access WhatsApp Web for the first time
	Given I have the <Browser> open
	And I`m at the WhatsApp page
	And I have my WhatsApp phone app active
	And I never user WhatsAppWeb before
	When I access the general menu
	And click "WhatsApp Web" option
	And click the + button
	And I target my phone camera to the QR code on the <Browser>
	Then I`m connected to the app on the browser
	
	Examples:
	|Browser          |
	|Internet Explorer|
	|Google Chrome    |
	|Mozilla Firefox  |
	|Opera            |
	|Safari           |
	
