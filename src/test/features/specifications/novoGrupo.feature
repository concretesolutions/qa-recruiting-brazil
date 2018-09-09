#language: pt

  Funcionalidade: Criar Novo Grupo

    Cenário: Crio um novo grupo
      Dado que estou na tela de listagem de mensagens do Whatsapp
      Quando clico no botão nova mensagem
      E clico no botão Novo grupo
      E seleciono o primeiro contato da listagem de contatos
      E clico no botão avançar
      E digito no nome <nomeGrupo> no campo para nome do grupo
      E clico no botão de confirmar
     Então vejo a tela da conversa com o nome <nomeGrupo>

   Exemplos:
  |nomeGrupo          |
  |semcaracterespecial|
  |comAcentuação      |
  |com1@#$_&-+(/*!?   |

    Cenário: Sem selecionar contato para novo grupo, devo ver uma mensagem de erro
      Dado que estou na tela de listagem de mensagens do Whatsapp
      Quando clico no botão nova mensagem
      E clico no botão Novo grupo
      E clico no botão avançar
      Então vejo a mensagem "Pelo menos 1 contato deve ser selecionado"

