
Feature: Cadastro de numero
  
  @CadastroPaisInvalido
  Scenario: Tentativa de cadastro com Pais Invalido
    Given Que eu tenha o WhatsApp instalado
    When Eu concordo com os termos
    And clico na caixa para digitar o numero
    And digito o numero
    And escolho um pais diferente do Brasil
    And aperto na opcao proximo
    Then eu valido que o aviso de erro do pais
    
    @CadastroSemNumero
   Scenario: Tentativa de cadastro sem numero
    Given Que eu tenha o WhatsApp instalado
    When Eu concordo com os termos
    Then aperto na opcao proximo

	@CadastroNumeroErrado
   Scenario: Tentativa de cadastro com numero invalido
 		Given Que eu tenha o WhatsApp instalado
    When Eu concordo com os termos
    And clico na caixa para digitar o numero
    And digito um numero invalido
    And aperto na opcao proximo
    Then eu valido que o numero e errado

  @CadastroDeNumero
  Scenario: Cadastrando numero valido
    Given Que eu tenha o WhatsApp instalado
    When Eu concordo com os termos
    And clico na caixa para digitar o numero
    And digito o numero
    And aperto na opcao proximo
    And confirmo o numero
    Then eu valido que estou aguardando o SMS para finalizar o cadastro