#language: pt
Funcionalidade: Envio de mensagem de texto

Contexto: Logado no WhatsAppWeb
    Dado que o usuario está logado no WhatsApp

Cenário: Enviar mensagem de texto contato
	  E acione o ícone contato
    Quando seleciona um contato existente
	  E digita um texto 
    E aciona o botão enviar
	  Então são exibidos os checks de enviado/recebido.
	
Cenário: Enviar mensagem de texto grupo
	  E selecione o grupo na lista de conversas
    Quando digita um texto 
    E aciona o botão enviar
	  Então são exibidos os checks de enviado/recebido.
