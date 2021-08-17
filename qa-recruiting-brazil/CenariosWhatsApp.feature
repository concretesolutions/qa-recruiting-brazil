#language: pt
#encoding: utf-8

@whatsapp @android 
Funcionalidade: Enviar mensagem
Como um usuario 
Eu quero enviar mensagens 
A fim de me comunicar com meus contatos

    Contexto: Estar em uma conversa
        Dado que eu esteja em uma conversa

    Cenário: Enviar mensagem de texto
        Quando envio uma mensagem de texto
        Então visualizo que a mensagem foi enviada

    Cenário: Enviar mensagem de áudio
        Quando envio uma mensagem de áudio
        Então visualizo que a mensagem foi enviada

    Cenário: Enviar mensagem de texto sem conexão com a internet
        Dado que eu perca o acesso a Internet
        Quando envio uma mensagem de texto
        Então visualizo que a mensagem foi enviada
        E vejo que a mensagem está com o envio pendente


Funcionalidade: Postar status
    Como um usuario 
    Eu quero postar status 
    A fim de me comunicar com meus contatos

    Contexto: Estar nos status
        Dado que eu esteja nos status

    Esquema do Cenário: Postar status
        Quando Seleciono uma <midia>
        Então visualizo que o status foi postado

        Exemplos:
        |midia  |
        |'Foto' |
        |'Video'|
        |'Texto'|

    Cenário: Visualizar status
        Quando acesso o status de um contato
        Então visualizo o status selecionado
    
    Esquema do Cenário: Postar status sem conexão com a internet
        Dado que eu perca o acesso a Internet
        Quando Seleciono uma <midia>
        Então visualizo que o status foi postado
        E vejo que o status está com o envio pendente

        Exemplos:
        |midia  |
        |'Foto' |
        |'Video'|
        |'Texto'|