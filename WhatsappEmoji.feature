Feature: Send Emojis
  As a user from whatsap
  I want to be able to send emojis
  So I can better express myself

  Scenario Outline: Send Emojis to my contacts
    Given I enter in whatsapp
    And I open the chat from "<Contact>" screen
    When I select the emoji "<EmojiName>" to send
    Then my contact should see the emoji on their screen
    Examples:
    |Contact|EmojiName   |
    |João  	|Smile       |
    |Maria 	|Cry      	 |
    |Ricardo|HappyFace   |
