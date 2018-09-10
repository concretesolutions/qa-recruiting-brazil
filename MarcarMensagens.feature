Feature: MarcarMensagens
	Desejo marcar mensagens favoritas
	A fim de localizá-las mais facilmente

Background:
	Given Existe o grupo de trabalho 'Concrete' no WhatsApp
	And a mensagem 'Mensagem Favorita' está presente na conversa do grupo
	And 'Mensagem Favorita' não está marcada 
	
Scenario: Marcar uma mensagem 	
	Given Eu acesso o grupo 'Concrete'
	When Eu seleciono a mensagem 'Mensagem Favorita'
	And pressiono o botão Marcar Mensagem
	Then a mensagem é marcada

Scenario: Visualizar mensagem marcada	
	Given Eu acesso a opção Menu
	When escolho a opção Mensagens Marcadas
	Then a mensagem 'Mensagem Favorita' é exibida na lista de mensagens marcadas