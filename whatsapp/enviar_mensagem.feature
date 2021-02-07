#language:pt

Funcionalidade: Enviar Mensagem

Sendo um usuário do WhatsApp Mobile 
Quero enviar uma mensagem para um contato existe

Contexto:
    Dado que o usuário esteja dentro da aplicação WhatsApp Mobile
    Quando o usuário acessar a lista de contatos
    E selecionar um contato existente

Cenário: Enviar mensagem com sucesso 

    Quando preencher a mensagem desejada 
    Então a mensagem deve ser enviada 
    E apresentar a notificação de envio 

Cenário: Tentativa de envio com mensagem em branco

    Quando tentar realizar o envio de mensagem 
    Então o sistema deve demonstrar a mensagem de alerta "Não é possível enviar mensagem vazia"

    # Caso houvesse mais cenários poderia utilizar o esquema de cenários para mapear o envio de formas diferentes , com mensagens de alertas diferentes. 
    # Optei por deixar declarado, pois eram apenas dois cenários. 

