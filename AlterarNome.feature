#language: pt
#encoding: iso-8859-1
Funcionalidade: Alterar nome do usuário 
como um usuário do Whatsapp
eu quero alterar o nome de usuário
de modo que eu possa checar o nome alterado

Cenário: 
 Dado Acessar profile
 Quando Clicar na edição do nome
 Então Redefinir o nome de usuário
 E checar se foi alterado