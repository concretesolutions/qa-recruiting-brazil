#Assumindo que o whatsappweb está previamente logado

@edit-user-name
Feature: Edit the user name

    @edit-name-success
    Scenario Outline: Change the user name with success
        Given i'm on the WhatsApp home screen via <url>
        Then access my profile
        And click do edit my name
        And inser the new user name: <name>
        Then i click save the new user name
        And go back do home screen
        When i access my profile
        Then my user name should be <name>

        Examples:
        | url                        | name    |
        | https://web.whatsapp.com/  | Thales  |
        | https://web.whatsapp.com/  | Luiz    |

    @name-exceeds-max-length
    Scenario Outline: Change the user name to one that exceeds the maximun length
        Given i'm on the WhatsApp home screen via <url>
        Then access my profile
        And click do edit my name
        And i try to inser the new user name: <name>
        Then i make sure that only the first <max-length> characters will be be entered

        Examples:
        | url                       | contact | max-length |
        | https://web.whatsapp.com/ | AAAAAAA | 25         |
        | https://web.whatsapp.com/ | 123ABC  | 25         |