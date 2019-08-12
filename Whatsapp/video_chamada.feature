#language:pt

Funcionalidade: Chamada de vídeo
    Realizar uma chamda de vídeo entre dois usuários

    Cenário: Aceitar uma chamada de vídeo
        Dado que o usuário esteja conectado ao Whatsapp
        E selecione um contato da sua lista de contatos
        E solicite uma chamada de vídeo
        Quando o contato aceitar a solicitação 
        Então uma chamda de vídeo é estabelecida entre os dois usuários

    Cenário: Rejeitar uma chamada de vídeo 
        Dado que o usuário esteja conectado ao Whatsapp
        E selecione um contato da sua lista de contatos
        E solicite uma chamada de vídeo
        Quando o contato rejeitar a solicitação 
        Então uma chamada de vídeo não deve ser estabelecida entre os dois usuários 

    Cenário: Usuário no qual foi solicitada a chamada e vídeo esteja Offline 
        Dado que o usuário esteja conectado ao Whatsapp
        E selecione um contato da sua lista de contatos
        E solicite uma chamada de vídeo
        Mas o contato esteja offline 
        Então a chamada de vídeo não pode ser estabelicida

