
Feature: Mudar Papel de Parede

  Scenario: Mudar Papel de Parede do WhatsApp Web

  Given entrei no site do WhatsApp
    When eu faço login
    And clico na opcao menu
    And clico na opcao configuracao
    And clico na  opcao papel de parede
    Then clico no papel de parede azul
    And volto para configuracaos
