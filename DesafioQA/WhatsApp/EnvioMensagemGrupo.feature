# language: pt

Funcionalidade: Enviar mensagem para um grupo via Whatsapp

Cen�rio: Enviar uma mensagem para um novo grupo
  Dado que eu esteja no app do Whatsapp
  E clico em Novo Grupo
  Quando eu selecionar um ou mais contatos na lista
  E clico em Seguinte
  E informo um nome para o novo grupo
  E clico em Criar
  Ent�o posso enviar uma mensagem para o novo grupo

Cen�rio: Enviar uma mensagem para um grupo existente
  Dado que eu esteja no app do Whatsapp
  Quando selecionar um grupo existente na lista
  Ent�o posso enviar uma mensagem para o grupo existente.
  
@RegressionTest  
Esquema do Cenario: Enviar mensagens para grupos existentes
      
      Dado que eu esteja no app do Whatsapp
  		Quando eu selecionar o grupo <grupo> na lista
  		Ent�o posso enviar a mensagem <mensagem> para o grupo existente.
    
Exemplos: 
|grupo    |mensagem     |
|Grupo ABC|Ol� Grupo ABC| 
|Grupo DEF|Ol� Grupo DEF| 