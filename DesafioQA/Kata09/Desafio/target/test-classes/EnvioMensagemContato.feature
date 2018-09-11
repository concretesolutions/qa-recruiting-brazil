# language: pt

Funcionalidade: Enviar mensangem para um contato via Whatsapp

Cenário: Enviar uma mensagem para um novo contato
  Dado que eu esteja no app do Whatsapp
  E clico em Novo Conversa
  Quando selecionar um contato novo na lista
  Então posso enviar uma mensagem para o contato novo

Cenário: Enviar uma mensagem para um contato existente
  Dado que eu esteja no app do Whatsapp
  Quando selecionar um contato existente na lista
  Então posso enviar uma mensagem para um contato existente.
  
@RegressionTest  
Esquema do Cenario: Enviar mensagens para contatos existentes
      
      Dado que eu esteja no app do Whatsapp
  		Quando eu selecionar o grupo <grupo> na lista
  		Então posso enviar a mensagem <mensagem> para o grupo existente.
    
Exemplos: 
|grupo    |mensagem     |
|Grupo ABC|Olá Grupo ABC| 
|Grupo DEF|Olá Grupo DEF| 
