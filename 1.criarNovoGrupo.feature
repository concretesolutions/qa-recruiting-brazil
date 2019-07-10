# language: pt
# encoding: utf-8

Funcionalidade: Criando um novo grupo
  A fim de criar um novo grupo
  Como um usuário já registrado
  Eu quero criar um novo grupo de conversação

  Contexto:
    Dado eu estou na tela Conversas (featureNovoGrupo)
    Quando eu pressiono o botao Opcoes (featureNovoGrupo)
    E eu inicio a criacao de um novo grupo (featureNovoGrupo)

  Cenário: Falha ao tentar criar um novo grupo de conversação
    E eu pressiono o botao Próximo (featureNovoGrupo)
    Então eu aguardo ser exibida a mensagem de verificacao "Pelo menos 1 contato deve ser selecionado" (featureNovoGrupo)

  Cenário: Criação de um novo grupo efetuada com sucesso
    E eu seleciono o contato "Teste Concrete" (featureNovoGrupo)
    E eu pressiono o botao Próximo (featureNovoGrupo)
    E eu digito o nome do novo grupo "Concrete" (featureNovoGrupo)
    E eu pressiono Ok (featureNovoGrupo)
    Então eu aguardo ser exibida a mensagem de verificacao "Você criou o grupo" (featureNovoGrupo)