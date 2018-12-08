Feature: Message

    Scenario: TCM_001 - Send a message successfully
        Given I am on Chat list page
        When  I click on search button
        Given I am on Search page
        When  I search for the contact "Paulo"
        And   I click on the contact "1"
        Given I am on Chat page
        When  I write the message "Hello, Paulo! How are you?"
        Then  I verify that the message  "Hello, Paulo! How are you?" is displayed

    Scenario: TCM_002 - Send a message with accent marks
        Given I am on Chat list page
        When  I click on search button
        Given I am on Search page
        When  I search for the contact "Paulo"
        And   I click on the contact "1"
        Given I am on Chat page
        When  I write the message "¡Hola, Paulo! ¿Cómo estás? "
        Then  I verify that the message  "¡Hola, Paulo! ¿Cómo estás?" is displayed

    Scenario: TCM_003 - Send a long message
        Given I am on Chat list page
        When  I click on search button
        Given I am on Search page
        When  I search for the contact "Paulo"
        And   I click on the contact "1"
        Given I am on Chat page
        When  I write the message with "1000" characters
        Then  I verify that the message displayed has "1000" characters

    Scenario: TCM_004 - Send a picture on message
        Given I am on Chat list page
        When  I click on search button
        Given I am on Search page
        When  I search for the contact "Paulo"
        And   I click on the contact "1"
        Given I am on Chat page
        When  I click on camera button
        Given I am on Camera page
        When  I click on the take a picture button
        Given I am on Edit picture page
        When  I click on send picture button
        Given I am on Chat page
        Then  I verify that picture is displayed
