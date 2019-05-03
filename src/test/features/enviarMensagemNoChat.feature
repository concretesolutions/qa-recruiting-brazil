#language: pt
Funcionalidade: Enviar mensagem de texto

  Narrativa:
    Afim de conectar pessoas
    Os usuários podem enviar e receber mensagens entre si.

  Cenário: Um Usuário envia uma mensagem para um contato selecionado
    Dado que o usuário "Assis" está na tela inicial
        E selecionou o contato "Júnior"
    Quando envia a mensagem "oi!"
    Então a mensagem é vista na caixa de conversas
