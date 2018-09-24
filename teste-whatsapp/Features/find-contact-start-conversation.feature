#Assumindo que o whatsappweb está previamente logado

@find-contact-start-conversation
Feature: Find a contact and start a conversation

    @message-with-success
    Scenario Outline: Find existing contact and send message with success
        Given i'm on the WhatsApp home screen via <url>
        Then i search for the <contact> contact
        And click to start the conversation
        And send <message> to Eduardo
        Then make sure the message has been sent
        And go back to home screen

        Examples:
        | url                        | contact  | message               |
        | https://web.whatsapp.com/  | Eduardo  | Hello Eduardo         |
        | https://web.whatsapp.com/  | Patrick  | Good morning Patrick  |

    @non-existing-contact
    Scenario Outline: Search for a non-existing contact
        Given i'm on the WhatsApp home screen via <url>
        Then i search for the <contact> contact
        And i make sure the contact does not exist

        Examples:
        | url                       | contact |
        | https://web.whatsapp.com/ | AAAAAAA |
        | https://web.whatsapp.com/ | 123ABC  |

