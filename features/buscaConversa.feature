#language:pt

Funcionalidade: Buscar conversa no histórico do WhatsApp
    Quero buscar uma conversa no histórico do WhatsApp - versão app mobile

    Contexto:
        Dado que eu esteja logado com um número de telefone válido
        E que eu esteja na tela inicial do app WhatsApp

    Cenário: Buscar conversa com contato cadastrado e histórico de mensagens
        Dado que eu tenha o contato "Amanda Morais" cadastrado na agenda 
        E que eu tenha histórico de conversas com "Amanda Morais"
        Quando eu clicar na lupa para buscar
        E digitar "Amanda Morais"
        Então eu devo ver a opção "Amanda Morais" como primeiro resultado da busca
        E eu devo ver o conteúdo da última frase recebida ou enviada

    Cenário: Buscar conversa com contato cadastrado e sem histórico de mensagens
        Dado que eu tenha o contato "Adalto Souza" cadastrado na agenda
        E que eu não tenha histórico de conversas com "Adalto Souza"
        Quando eu clicar na lupa para buscar
        E digitar "Adalto Souza"
        Então eu devo ver a opção "Adalto Souza" como primeiro resultado da busca
        E eu não verei nenhum conteúdo prévio

    Cenário: Buscar conversa com contato que não está cadastrado na agenda
        Dado que eu não tenha o contato "Paula Amarantes" cadastrado na agenda
        Quando eu clicar na lupa para buscar
        E digitar "Paula Amarantes"
        Então eu não devo ver retorno da busca
        E eu devo ver a mensagem "Sem resultados para 'Paula Amarantes'"
        