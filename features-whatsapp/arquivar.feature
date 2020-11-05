Feature: Arquivar conversa
    Como Usuario
    Quero arquivar uma conversar
    Para que possa limpar o feed de conversas

    Background: Logado no whatsapp via smartphone
        Given eu esteja logado
        And estou no feed de conversas

    Scenario: arquiva conversa especifica
        When escolho uma conversa para ser arquivada
        And seleciono a opcao "Arquivar"
        Then o sistema exibe a mensagem "1 conversa arquivada - Desfazer"


    Scenario Outline: arquiva varias conversas
        When seleciono <quantidadeConversas>
        And seleciono a opcao "Arquivar"
        Then o sistema exibe a <mensagemFeedback>

        Examples:
            | quantidadeConversas | mensagemFeedback                     |
            | 2                   | "2 conversas arquivadas - Desfazer"  |
            | 20                  | "20 conversas arquivadas - Desfazer" |