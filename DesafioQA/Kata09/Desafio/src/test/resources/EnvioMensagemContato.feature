# language: pt

Funcionalidade: Enviar mensangem para um contato via Whatsapp

Cen�rio: Enviar uma mensagem para um novo contato
  Dado que eu esteja no app do Whatsapp
  E clico em Novo Conversa
  Quando selecionar um contato novo na lista
  Ent�o posso enviar uma mensagem para o contato novo

Cen�rio: Enviar uma mensagem para um contato existente
  Dado que eu esteja no app do Whatsapp
  Quando selecionar um contato existente na lista
  Ent�o posso enviar uma mensagem para um contato existente.
  
@RegressionTest  
Esquema do Cenario: Enviar mensagens para contatos existentes
      
      Dado que eu esteja no app do Whatsapp
  		Quando eu selecionar o grupo <grupo> na lista
  		Ent�o posso enviar a mensagem <mensagem> para o grupo existente.
    
Exemplos: 
|grupo    |mensagem     |
|Grupo ABC|Ol� Grupo ABC| 
|Grupo DEF|Ol� Grupo DEF| 
