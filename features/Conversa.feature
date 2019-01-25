#language: pt
@conversa
Funcionalidade: Conversar no Whatsapp

Contexto: Logar no Whatsapp Web
    Dado que estou logado no Whatsapp Web

    Cenário: Abrir uma nova conversa
        Quando crio uma nova conversa
        Então posso conversar com a pessoa
@cen2
    Cenário: Conversar com um contato já existente
        Quando seleciono uma conversa já existente
        Então posso conversar com a pessoa
@cen3
    Cenário: Excluir uma mensagem
        Quando enviei mensagem para uma pessoa
        E clico em apagar conversa
        Então a mensagem é apagada do Whatsapp
