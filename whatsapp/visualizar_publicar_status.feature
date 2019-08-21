#language: pt

Funcionalidade: Visualizar/Publicar Status

Contexto: Logado no WhatsAppWeb
  Dado que o usuario está logado no WhatsApp
	Quando aciona a aba Status

Cenário: Publicar Status Texto
  E seleciona o ícone editar (lápis)
	E digita o Texto
	E aciona o ícone Enviar
	Então é exibido o Texto para meus contatos

Cenário: Publicar Status Foto
  E seleciona o ícone Camera
	E seleciona/tira uma Foto
	E aciona o ícone Enviar
	Então é exibida a Imagem para meus contatos
	
Cenário: Visualizar Status de Contatos
  E seleciona Status de um contato existente
	Então são exibidos as Imagens, Vídeos, Textos cadastrados como Status pelos Contatos
