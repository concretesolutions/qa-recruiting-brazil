#language: pt

  #Deve conter
  #Especificação de duas funcionalidades do Whatsapp (não importa se o app é Android, iOS, Windows Phone ou versão Web) em Gherkin ou Gauge
  #Cada especificação deve conter ao menos um cenário de teste

  Funcionalidade: Gerenciar conversas no Whatsapp
    A fim de gerenciar uma conversa
    Como um usuário do Whatsapp
    Desejo criar, buscar e remover uma conversa no Whatsapp

    Cenário de Fundo: Abrir aplicativo
      Dado que eu tenha uma conta válida no Whatsapp
      E possuo contatos cadastrados
      Então devo abrir o aplicativo

    Cenario: Criar uma nova conversa com contato existente
      Dado que na tela de conversas
      Quando clico no botão que lista os contatos
      E clico em "Carolina"
      Então uma nova conversa deve ser iniciada
      E deverá ser possível enviar mensagens para o contato.

    Cenario: Buscar uma conversa
      Dado que na tela de conversas
      Quando clico no botão de busca
      E digito "Carolina"
      E clico no contato
      Então a tela da conversa deve ser mostrada
      E deverá ser possível enviar mensagens para o contato.

    Cenario: Remover uma conversa
      Dado que na tela de conversas
      Quando clico e seguro por uns segundos no nome "Carolina"
      E clico no botão excluir
      Então a conversa deve ser excluída
      E não deverá ser possível ver as mensagens antigas enviadas para o contato.

    Cenario: Buscar uma conversa com contato inexistente
      Dado que na tela de conversas
      Quando clico no botão de busca
      E digito "Contato inexistente"
      Então deverá ser mostrado "Sem resultados para 'Contato inexistente'".