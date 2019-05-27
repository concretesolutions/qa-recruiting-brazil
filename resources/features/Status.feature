# language: pt

Funcionalidade Status
O Status do WhatsApp lhe permite compartilhar texto, fotos, vídeos e GIFs animados que desaparecem após 24 horas. Para que você possa compartilhar suas atualizações de status e ver as que são compartilhadas por seus contatos, os dois precisam ter o número de telefone um do outro salvo em suas listas de contatos. 


Cenário: Como um usuário válido, posso enviar uma mensagem de texto no meu status
    Dado que estou na tela de status
    Quando clicar no ícone de digitar
    E digitar uma mensagem 
    E clicar no botão enviar
    Então devo enviar um novo status com sucesso.


Cenário: Como um usuário válido, posso enviar uma foto no meu status
    Dado que estou na tela de status
    Quando clicar no ícone de câmera
    E selecionar uma foto
    E clicar no botão enviar
    Então devo enviar uma foto para meu status com sucesso.
