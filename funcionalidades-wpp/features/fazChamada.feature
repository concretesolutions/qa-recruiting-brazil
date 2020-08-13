# language: pt

Funcionalidade: Fazer chamada

Contexto:
    Dado que iniciei a aplicação
    E abri uma conversa com "contato"

Cenário: Iniciando chamada de vídeo 
    """
    Sendo um usuário, eu desejo fazer uma chamada de vídeo
    com o contato escolhido.
    """
    Quando pressiono o ícone "Chamada de vídeo"
    Então devo iniciar uma vídeo chamada com "contato"

Cenário: Iniciando chamada de voz
    """
    Sendo um usuário, eu desejo fazer uma chamada de voz
    com o contato escolhido.
    """
    Quando pressiono o ícone "Chamada de voz"
    Então devo iniciar uma chamada de voz com "contato"
