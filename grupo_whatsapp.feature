#language: pt
#encoding: utf-8
@criar_grupo
Funcionalidade: Grupos de WhatsApp Android
  Como usuário do aplicativo WhatsApp
  Posso criar um grupo de comunicação entre amigos
  Para discutir, compartilhar notícias e informações entre amigos, familiares e colegas

  Contexto: Acesso aplicativo WhatsApp
    Dado que eu esteja no aplicativo do WhatsApp

  @add_novo_grupo
  Cenário: Criar novo grupo de WhatsApp
    Quando seleciona a aba conversas
    E clico no ícone contatos
    Então são apresentados os contatos que têm disponíveis no WhatsApp
    Quando seleciono o botão Novo grupo
    E seleciono os contatos e preencho as informações do novo grupo "Teste Concrete"
    Então o grupo é criado com sucesso, apresentando a mensagem
    """
    Você criou o grupo "Teste Concrete"
    """

  @descricao_grupo
  Cenário: alterar descrição do grupo
    Quando seleciona o grupo criado "Teste Concrete"
    E clico no menu configurações > Dados do grupo
    Então são apresentadas as informações referentes ao grupo
    Quando seleciono a opção Adicionar descrição do grupo
    E preencho a nova descrição do grupo
    Então a descrição fica visível para todos os contatos participantes do grupo
