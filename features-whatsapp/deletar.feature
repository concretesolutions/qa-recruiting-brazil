Feature: Limpar historico
  Como Usuario
  Quero limpar o historico de uma conversa
  Para que nao tenha registros da mesma

  Background: Logado no whatsapp via smartphone
    Given eu esteja logado
    And estou com uma conversa aberta
    And seleciono as opcoes de conversa
    And habilito a opcao de "Limpar conversa"

  Scenario: limpa historico
    When o sistema exibe a "Tem certeza de que deseja limpar as mensagens nesta conversa?"
    Then confirmo a deleção, o histórico é apagado

  Scenario: limpa historico e arquivos de midia
    When o sistema exibe a opcao de "Apagar arquivos de midia" habilitada
    Then confirmo a deleção, o histórico de mensagens e midias relacionados são apagados.