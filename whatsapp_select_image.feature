Feature: Select a whatsapp image
  Whatsapp allows the user to select one or more images to be sent in a conversation.
  User should be able to select from one to thirty images for each message sent.

  Scenario: Select only one image
    Given I have a WhatsApp account configured in my phone
    And I have at least one image in my gallery
    And I have at least one whatsapp contact saved
    When I select a contact to start a conversation
    And I click on Gallery
    Then I should be able to select 1 image
    And the image that I chose must be selected

  Scenario: Select thirty images
    Given I have a WhatsApp account configured in my phone
    And I have at least 30 images in my gallery
    And I have at least one whatsapp contact saved
    When I select a contact to start a conversation
    And I click on Gallery
    Then I should be able to select 30 images
    And all 30 images that I chose must be selected

  Scenario: Select more than thirty images
    Given I have a WhatsApp account configured in my phone
    And I have more than 30 images in my gallery
    And I have at least one whatsapp contact saved
    When I select a contact to start a conversation
    And I click on Gallery
    Then I should not be able to select 31 images
    And a warning message must be displayed
    And 30 images must remain selected