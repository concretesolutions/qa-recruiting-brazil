#language: pt

  #Deve conter
  #Especificação de duas funcionalidades do Whatsapp (não importa se o app é Android, iOS, Windows Phone ou versão Web) em Gherkin ou Gauge
  #Cada especificação deve conter ao menos um cenário de teste

  Funcionalidade: Gerenciar um grupo de conversas no Whatsapp
    A fim de gerenciar um grupo
    Como um usuário do Whatsapp
    Desejo criar, modificar e sair de um novo grupo de conversas

    Cenário de Fundo: Abrir aplicativo
      Dado que eu tenha uma conta válida no Whatsapp
      Então devo abrir o aplicativo

    Cenario: Criar um grupo de conversas
      Dado que na tela de conversas
      Quando clico botão que lista os contatos
      E clico em "Novo Grupo"
      E seleciono dois contatos para participar do grupo
      E clico na seta do lado inferior direito
      E digito "Novo Grupo"
      E clico em salvar
      Então o grupo deverá ser criado no Whatsapp
      E deverá ser possível enviar mensagens.

    Cenario: Sair de um grupo de conversas
      Dado que eu tenha um grupo criado
      E estou na tela de conversas do grupo
      Quando clico no botão de Configurações
      E clico em mais
      E clico em Sair do grupo
      Então meu usuário deve sair do grupo
      E não deve conseguir enviar mensagens
      E não deve conseguir receber mensagens.

    Cenario: Modificar o nome de um grupo de conversas
      Dado que eu tenha um grupo criado
      E estou na tela de conversas do grupo
      Quando clico no botão de Configurações
      E clico em Dados do grupo
      E clico no botão de Editar
      E modifico o nome do grupo para "Novo nome"
      E clico em OK
      Então o nome do grupo deve ser alterado para "Novo nome".

    Cenario: Remover um usuário do grupo de conversas
      Dado que eu tenha um grupo criado
      E estou na tela de conversas do grupo
      Quando clico no botão de Configurações
      E clico em Dados do grupo
      E clico no contato "Carolina"
      E clico em Remover usuário
      E clicar em OK
      Entao o contato "Carolina" deve ser removido do grupo
      E não deve conseguir enviar mensagens
      E não deve conseguir receber mensagens.





