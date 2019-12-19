# language: pt
Funcionalidade: Alterar confifuração whatsapp

Contexto: Usuario deve estar logado no whatsapp com sua conta

  Cenário: Usuario irá desativar o modo "confirmacao de leitura"
    Dado que estou no Menu principal na área de conversas
    Quando acesso a opcao de Configuração 
    E acesso a opção conta
    E acesso a opção privacidade 
    E desativo a opcão confirmação de leitura 
    Então Não poderá mais visualizar nem exibir confirmações de leitura.