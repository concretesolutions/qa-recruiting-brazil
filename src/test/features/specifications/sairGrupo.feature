#language: pt

  Funcionalidade: Sair de um grupo

    Cenário: Como adminstrador, saio de um grupo
      Dado que sou o usuário adminstrador de um grupo
      Quando estou na tela de conversa do grupo
      E clico sobre o nome do grupo
      E clico no botão Sair do Grupo
      E confirmo clicando na opção Sair
      Então vejo a mensagem "Você não é mais participante deste grupo"
      E não consigo enviar mensagens no grupo
      E outro contato do grupo se torna o adminstrador


