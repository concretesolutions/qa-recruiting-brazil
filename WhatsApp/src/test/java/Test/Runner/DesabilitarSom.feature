Feature: Desabilitar Som

  Scenario: Desabilitar Som do WhatsApp Web
  
    Given entrei no site do WhatsApp
    When eu faço login
    And clico na opcao menu
    And clico na opcao configuracao
    And clico na  opcao notificacao
    Then clico em som
    And volto para configuracaos