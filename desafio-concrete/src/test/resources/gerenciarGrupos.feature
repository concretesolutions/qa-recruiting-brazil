#language: pt

  #Deve conter
  #Especificação de duas funcionalidades do Whatsapp (não importa se o app é Android, iOS, Windows Phone ou versão Web) em Gherkin ou Gauge
  #Cada especificação deve conter ao menos um cenário de teste

  #Pre condição: Deve ter um contato com o nome Carolina criado

Funcionalidade: Gerenciar um grupo de conversas no Whatsapp
    A fim de gerenciar um grupo
    Como um usuário do Whatsapp
    Desejo criar, modificar e sair de um novo grupo de conversas

    Cenário de Fundo:
      Dado que o usuário esteja logado na conta Web Whatsapp
      E que está na tela inicial

    Cenário: Criar um grupo de conversas
      Quando o usuário clica em Novo Grupo
      E informa o nome "Novo Grupo" e o contato "Carolina"
      Então o grupo "Novo Grupo" deverá ser encontrado
      E deverá ser possível enviar mensagens para o grupo

    Cenário: Modificar o nome do grupo
      Dado que o usuário está no grupo "Modificar Grupo"
      Quando ele modifica o nome do grupo para "Grupo modificado"
      Então o grupo "Grupo modificado" deverá ser encontrado

    Cenário: Sair de um grupo
      Dado que o usuário está no grupo "Sair do Grupo"
      Então o usuário deve sair do grupo
      E ele deve ver a mensagem de exclusão



