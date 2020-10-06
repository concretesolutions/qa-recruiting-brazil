#language:pt

Funcionalidade: Conversar por mensagem de texto pelo WhatsApp
    Como usuário
    Quero mandar mensagem para meus contatos
    Para que me aproxime virtualmente deles

    Versão 2.20.200.22 app mobile para Android WhatsApp Messenger

    Contexto:
        Dado que eu esteja logado

    Cenário: Buscar conversa
        Dado que eu esteja na tela inicial do WhatsApp
        Quando eu fizer uma busca por conteúdo
        Então o resultado da pesquisa conterá os termos buscados

    Cenário: Apagar conversa
        Dado que eu tenha um histórico de mensagens
        Quando eu excluir uma
        Então ela não aparecerá para a outra pessoa
        E para mim aparecerá uma mensagem de que foi apagada