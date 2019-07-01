#language:pt

Funcionalidade: Pesquisar contato e enviar mensagem
  Para que eu possa enviar mensagens utilizando o Whatsapp Web
  Sendo que tenho um smartphone capaz de ler um QRCode
  Posso acessar uma conversa ou grupo e enviar uma mensagem

  Cenario: Configurar mensagem de recado
    Dado que acesso o whatsapp web
    E realizo a leitura do QRCode com um smartphone
    E clico no menu de opções e seleciono a opção Perfil
    Quando troco a mensagem para "Recado automatizado"
    Entao vejo como recado a mensagem "Recado automatizado"


  @cenario2
  Cenario: Desabilitar notificações na área de trabalho
    Dado estou logado no WhatsApp Web
    E clico no menu de opções e seleciono a opção Configurações
    E clico em Notificações
    Quando desmarco a opção Notificações na área de trabalho
    Então vejo que a opção está desmarcada
