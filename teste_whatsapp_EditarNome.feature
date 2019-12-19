# language: pt

Funcionalidade: Editar nome do perfil Whatsapp Web
 
 Contexto: Usuario deve estar logado no whatsapp Web com sua conta

  Cenário: Tentar editar o nome com campo em branco

  Dado que eu esteja logado no whatsapp Web
  Quando eu clico no ícone Menu
  E acesso a opção configuração
  E acesso a edição do perfil pela foto
  E limpo o campo Nome
  E clico no botão de confirmação
  Então deverá aparecer um popup com a mensagem 'Seu nome precisa ser preenchido'
  E clico no botão OK
  E preencho o campo nome
  E clico no botão de confirmaçãp
  Então o sistema irá apresentar o nome inserido
