#language: pt
#encoding: utf-8

@whatsapp @android 
Funcionalidade: Envio de mensagem 
Como um usuario 
Eu quero enviar mensagens 
A fim de me comunicar com meus contatos

    Cenario: Envio de mensagem de texto
        Dado que usuario esteja com acesso a internet
        E esteja logado no whatsapp
        E acesse uma conversa
        Quando clicar no input de texto 
        E digitar uma mensagem
        E apertar o botão de envio
        Então mensagem deve ser enviada com sucesso

    Cenario: Envio de mensagem de audio
        Dado que usuario esteja com acesso a internet
        E esteja logado no whatsapp
        E acesse uma conversa
        Quando clicar e segurar no icone de audio
        E gravar uma mensagem de audio
        E soltar o botão de gravar
        Então mensagem deve ser enviada com sucesso

    Cenario: Falha no envio de mensagem de texto
        Dado que usuario esteja logado no whatsapp
        E perca o acesso a internet
        E acesse uma conversa
        Quando clicar no input de texto 
        E digitar uma mensagem
        E apertar o botão de envio
        Então mensagem NÃO deve ser enviada enquanto o acesso nao voltar


Funcionalidade: Postar status
    Como um usuario 
    Eu quero postar status 
    A fim de me comunicar com meus contatos

    Esquema do Cenario: Postar status
        Dado que usuario esteja com acesso a internet
        E esteja logado no whatsapp
        E acesse a aba "status"
        Quando clicar em "Meu status"
        E selecionar uma <midia>
        E apertar o botão de envio
        Então status é postado com sucesso 

        Exemplos:
        |midia  |
        |'Foto' |
        |'Video'|
        |'Texto'|

    Cenario: Visualizar status
        Dado que usuario esteja com acesso a internet
        E esteja logado no whatsapp
        E acesse a aba "status"
        Quando clicar no status de um contato
        Então status é exibido com sucesso
    
    Esquema do Cenario: Falha ao postar status
        Dado esteja logado no whatsapp
        E perco acesso a internet
        E acesse a aba "status"
        Quando clicar em "Meu status"
        E selecionar uma <midia>
        E apertar o botão de envio
        Então status NÃO deve ser enviado enquanto o acesso nao voltar

        Exemplos:
        |midia  |
        |'Foto' |
        |'Video'|
        |'Texto'|