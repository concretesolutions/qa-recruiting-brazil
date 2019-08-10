#language:pt
Funcionalidade: Enviar mensagem

Cenario: Entrar em uma conversa

Dado que estou na tela inicial
Quando toco em uma conversa
Entao entro na tela de chat


Cenario: Enviar mensagem de texto com sucesso

Dado que estou na tela de chat
Quando envio uma mensagem de texto
Entao recebo a confirmacao de envio

@test
Cenario: Enviar mensagem de audio com sucesso

Dado que estou na tela de chat
Quando envio uma mensagem de audio
Entao recebo a confirmacao de envio


