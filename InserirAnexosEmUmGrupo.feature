Feature: InserirAnexosEmUmGrupo
	Como membro de um grupo	de trabalho
	Eu desejo compartilhar anexos com meus colegas
	A fim de que todos no grupo possam acessá-los

Background:
	Given Existe o grupo de trabalho 'Concrete' no WhatsApp

Scenario Outline: Compartilhar um Documento em um grupo	
	Given Eu possuo o documento <nomeDocumento> disponível na memória do meu dispositivo
	
	
	When Eu acesso o grupo 'Concrete'
	And pressiono a botão Anexo
	And seleciono a opção Documento
	And escolho o documento <nomeDocumento> 
	When pressiono Enviar
	Then a mensagem é marcada como enviada 
Examples:
	|nomeDocumento|
	|testDoc.doc|
	|testePdf.pdf|
	

Scenario: Compartilhar um Contato em um grupo	
	Given Eu possuo o contato 'Maria' disponível na minha lista de contatos
	When Eu acesso o grupo 'Concrete'
	And pressiono a botão Anexo
	And seleciono a opção Contatos
	And seleciono o contato 'Maria'
	And seleciono todos os números disponíveis 
	When pressiono Enviar
	Then a mensagem é marcada como enviada 