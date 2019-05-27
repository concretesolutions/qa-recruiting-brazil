# language: pt

Funcionalidade Enviar Mensagem de texto
    Funcionalidade permite enviar uma mensagem texto, fotos, vídeos e GIFs animados. 


Cenário: Como um usuário válido, posso enviar mensagem de texto
    Dado que estou em uma conversa
    Quando digitar um texto
    E clicar no botão de enviar
    Então devo enviar a mensagem com sucesso
 
Cenário: Como um usuário válido, posso enviar fotos
    Dado que estou em uma conversa
    Quando clicar no botão em anexo
    E clicar no ícone Galeria
    E clicar na foto desejada
    E clicar no botão de enviar
    Então devo enviar a mensagem com a imagem selecionada com sucesso.
