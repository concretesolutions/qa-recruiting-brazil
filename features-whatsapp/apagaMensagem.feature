#language:pt

Funcionalidade: Apagar uma mensagem de uma conversa do WhatsApp
    Quero apagar uma mensagem no histórico do WhatsApp - versão app mobile para Android

    Cenário: Selecionando a mensagem enviada
        Dado que eu esteja logado com um número de telefone válido
        E que eu esteja na tela da conversa com "Amanda Morais"
        E que eu tenha mensagens enviadas na conversa com "Amanda Morais"
        E que eu tenha enviado a mensagem "estou saindo de casa"
        Quando eu pressionar por 3 segundos a mensagem "estou saindo de casa"
        Então eu devo ver um novo menu superior com as opções "Responder", "Favoritar", "Deletar", "Copiar" e "Compartilhar"

    Cenário: Acionando o menu superior para deletar a mensagem enviada
        Dado que eu tenha pressionado por 3 segundos a mensagem "estou saindo de casa"
        E que eu esteja vendo o novo menu superior com as opções "Responder", "Favoritar", "Deletar", "Copiar" e "Compartilhar"
        Quando eu clicar na lixeira para "Deletar"
        Então eu devo ver um modal de confirmação "Deseja apagar a mensagem?"
        E eu devo ver as opções "Apagar para mim", "Cancelar", "Apagar para todos"

    Cenário: Deletando para todos a mensagem enviada
        Dado que eu tenha um modal aberto com as opções "Apagar para mim", "Cancelar", "Apagar para todos"
        Quando eu clicar na opção "Apagar para todos"
        Então no lugar da mensagem enviada devo ver a mensagem "Você apagou essa mensagem"
        E no lugar da mensagem recebida, "Amanda Morais" deve ver a mensagem "Essa mensagem foi apagada"
        