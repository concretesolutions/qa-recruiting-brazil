#language: pt

@whatsapp
Funcionalidade: Sons de alerta do whatsapp

Cenario: Desativar sons para mensagens recebidas e enviadas
    Dado que estou logado no whatsapp
    Quando nao quero ouvir sons de mensagens recebidas e enviadas
    Então eu devo desativar Sons da Conversa



Cenario:  Tocar sons para mensagens recebidas e enviadas
    Dado que estou logado no whatsapp
    Quando quero ouvir sons de mensagens recebidas e enviadas
    Então eu devo ativar Sons da Conversa

