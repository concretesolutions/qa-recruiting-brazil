
#language: pt

  Funcionalidade: Enviar mensagem via whatsapp
    A fim de realizar o envio de uma mensagem
    Como um usuário ativo
    Eu quero ser capaz de enviar mensagens via whatsapp para um destinatário


    Cenário: Enviar mensagem de texto com emojis
      Dado uma conversa válida com um destinatário
      Quando uma mensagem de texto com um emoji for enviada
      Então a menasgem deve ser enviada ao destinatário

    Cenário: Enviar mensagem com foto via whatsapp
      Dado uma conversa válida com um destinatário
      Quando uma mensagem com arquivo de foto for anexado
      Então a mensagem com foto deve ser enviada ao destinatário