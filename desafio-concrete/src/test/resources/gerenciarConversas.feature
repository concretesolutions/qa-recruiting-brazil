#language: pt

  #Deve conter
  #Especificação de duas funcionalidades do Whatsapp (não importa se o app é Android, iOS, Windows Phone ou versão Web) em Gherkin ou Gauge
  #Cada especificação deve conter ao menos um cenário de teste

  #Pre condição: Deve ter 2 contatos com o nome Carolina e Fernanda criados e possuindo conversa

  Funcionalidade: Gerenciar conversas no Whatsapp
    A fim de gerenciar uma conversa
    Como um usuário do Whatsapp
    Desejo criar, buscar e remover uma conversa no Whatsapp

     Cenário de Fundo:
       Dado que o usuário esteja logado na conta Web Whatsapp
       E que está na tela inicial

     Cenário: Criar uma nova conversa com contato existente
        Dado que o usuário clique em Nova Conversa
        E pesquisa por "Carolina"
        Então a conversa deve ser iniciada com "Carolina"
        E deverá ser possível enviar mensagens para o contato.

    Esquema do Cenário: Buscar uma conversa
      Dado que o usuário está na tela de busca
      E busca por "<Contato>"
      Então a conversa deve ser iniciada com "<Contato>"

      Exemplos:
        | Contato |
        | Carolina  |
        | Fernanda |

    Cenário: Remover uma conversa
      Dado que o usuário clique em Nova Conversa
      E busca por "Carolina"
      E clica em Configurações
      Quando clica no botão excluir
      Então a conversa deve ser excluída
