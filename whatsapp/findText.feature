  @runFindTextFeature
  Feature: Find previously messages
    @critical
    Scenario Outline: User search text successfully
      Given I open Whatsapp Application
      Then I'm on the chat screen
      When I type on geral search textfield: <message>
      Then chat will be filtered
      When I click on the first result 
      Then I am on <friendName> private chat
      And I assert all contains: <message> are on highlight

      Examples:
        | friendName             | message          |                                                                   
        | Renato Araújo          | Job Apply        |
        | Juliana Freitas        | Morning Juliaan! |
        | Jhon Due Interviewer   | celerisque       |
        | Grupo pao de alho      | Grupo pao de alho|

    @critical
    Scenario Outline: User search for no content text 
      Given I open Whatsapp Application
      Then I'm on the chat screen
      When I type on geral search textfield: <message>
      Then chat will be filtered
      And no results message are displayed

      Examples:
        | message                                                                             | 
        | cuytruytdryutdrtrytdsrsxzedrartg@#@!!                                               |
        | :) follow my message with emoji to make your day even better                        |
        | 01000011 01101111 01101110 01100011 01110010 01100101 01110100 01110010 01100101    |


