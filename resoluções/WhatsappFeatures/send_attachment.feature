Feature: Send Attachments
    As a User 
    I want to send attachments
    In order to share content with my contacts

    Background:
        Given that whatsapp is installed
        And the user have at least one contact registered

    Scenario: Send a photo from the gallery
        Given that whatsapp is opened
        And I am in a conversation
        When I send a photo from "the gallery"
        And wait for it to upload
        Then I should see a single mark on the sended attachment
        And the contact should receive my attachment

    Scenario: Try to send a not suported format from the gallery
        Given that whatsapp is opened
        And I am in a conversation
        When I try to send a "Photo not supported" from "the gallery"
        Then I should see a message saying "The file format is not supported."

    Scenario: Send a contact
        Given that whatsapp is opened
        And I am in a conversation
        When I send a contact
        Then I should see a single mark on the sended attachment
        And the contact should receive my attachment

    Scenario: Simulate a network failure while a attachment is uploading
        Given that whatsapp is opened
        And I am in a conversation
        When I send a attachment
        And force a connection failure
        Then the attachment should not be sended
        And I should see the option to resend the attachment

    Scenario: Resent a attachment after network failure
        Given that whatsapp is opened
        And I am in a conversation
        When I send a attachment
        And force a connection failure
        And I wait the resend button to be showed
        And I reconnect the device
        And I resend the attachment
        And wait for it to upload
        Then I should see a single mark on the sended attachment
        And the contact should receive my attachment

    Scenario Outline: Send a doc
        Given that whatsapp is opened
        And I am in a conversation
        When I send a doc with "<extension>" extension
        And wait for it to upload
        Then I should see a single mark on the sended attachment
        And the contact should receive my attachment

        Examples:
            | extension |
            |      .doc |
            |      .xls |
            |      .pdf |
            |      .ppt |
