# Created by rfranca at 31/08/2018#
# language: pt

Funcionalidade: Envio de mensagem

Contexto: Logado no WhatsAppWeb
  Dado que o usuario está logado no WhatsAppWeb

  @enviar_msg_contato
  Cenário: Deve enviar mensagem para o Morty
    E abre o chat com o Morty
    Quando envia uma mensagem
    Então o contato recebeu a mensagem

  @enviar_msg_grupo
  Cenário: Deve enviar mensagem para o grupo X-Wing
    E inicia uma conversa do grupo X-Wing
    Quando envia uma mensagem
    Então o grupo recebeu a mensagem