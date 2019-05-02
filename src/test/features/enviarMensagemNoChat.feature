#language: pt
Funcionalidade: Enviar mensagem de texto

  Narrativa:
    Afim de trocar mensagens entre contatos
    Os usuários podem enviar e receber mensagens entre si.

  Cenário: Um Usuário envia uma mensagem para um contato selecionado
    Dado que o usuário "Assis" está na tela inicial
        E selecionou o contato "Júnior"
    Quando "Assis" envia a mensagem "oi!"
    Então "oi!" é exibido na caixa de conversas

