# language: pt

Funcionalidade: Enviar mensagem para um grupo via Whatsapp

Cenário: Enviar uma mensagem para um novo grupo
  Dado que eu esteja no app do Whatsapp
  E clico em Novo Grupo
  Quando eu selecionar um ou mais contatos na lista
  E clico em Seguinte
  E informo um nome para o novo grupo
  E clico em Criar
  Então posso enviar uma mensagem para o novo grupo

Cenário: Enviar uma mensagem para um grupo existente
  Dado que eu esteja no app do Whatsapp
  Quando selecionar um grupo existente na lista
  Então posso enviar uma mensagem para o grupo existente.
  
@RegressionTest  
Esquema do Cenario: Enviar mensagens para grupos existentes
      
      Dado que eu esteja no app do Whatsapp
  		Quando eu selecionar o grupo <grupo> na lista
  		Então posso enviar a mensagem <mensagem> para o grupo existente.
    
Exemplos: 
|grupo    |mensagem     |
|Grupo ABC|Olá Grupo ABC| 
|Grupo DEF|Olá Grupo DEF| 