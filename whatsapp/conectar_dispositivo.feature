#language:pt

Funcionalidade: Conectar dispositivo

Sendo um usuário do WhatsApp mobile 
Quero conectar um novo disposito 
Afim de utilizar o WhatsApp Web

Contexto:
    Dado que o usuário esteja dentro da aplicação WhatsApp Mobile
    E que o acesso a funcionalidade WhatsApp Web seja acessada

Cenário: Conectar um novo dispositivo com sucesso

Quando ativar a funcão para conectar um aparelho
E realizar a autenticação 
E o scanner de código QR ser apresentado
Então o usuário deve apontar o leitor para o código de código de barra para o código gerado no WhatsApp Web
E o sistema deve permir acesso ao WhatsApp Web