#language:pt

Funcionalidade: Enviar Áudio 
    Gravar e enviar um áudio para um contato

    Cenário: Pressionando botão
         Dado que o usuário esteja conectado ao Whatsapp
         E selecione um contato da sua lista de contatos
         E grave um áudio presisonando o botão 'Microfone'
         Quando despressionar o botão 'Microfone'
         Então o áudio gerado no tempo que o botão estava pressionado é enviado

    Cenário: Cancelar envio de áudio gravado
        Dado que o usuário esteja conectado ao Whatsapp
        E selecione um contato da sua lista de contatos
        E grave um áudio presisonando o botão 'Microfone'
        Quando arrastar o botão 'Microfone' para a esquerdar 
        Então o áudio gravado não é enviado
   
    Cenário: Gravar áudio sem ficar pressionado o botão
        Dado que o usuário esteja conectado ao Whatsapp
        E selecione um contato da sua lista de contatos
        E grave um áudio presisonando o botão 'Microfone'
        Quando arrastar o botão 'Microfone' para cima 
        Então o usuario pode despressionar o botão 'Microfone' e o aplicativo continuará a gravar o audio a ser enviado