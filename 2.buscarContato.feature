# language: pt
# encoding: utf-8

Funcionalidade: Buscando um contato
  A fim de buscar um contato
  Como um usuário já registrado
  Eu quero buscar e localizar um contato

  Contexto:
  	Dado eu estou na tela Conversas (featureNovoGrupo)
  	Quando eu pressiono o botao Busca (featureBusca)

  Cenário: Falha ao tentar buscar um contato
  	E eu digito o nome do contato "ABC" (featureBusca)
  	Então eu aguardo ser exibida a mensagem de verificacao "Sem resultados" (featureBusca)

  Cenário: Busca de um contato efetuada com sucesso
  	E eu digito o nome do contato "Teste" (featureBusca)
  	E eu aguardo ser exibido o contato "Teste Concrete" (featureBusca)
    Então eu seleciono o contato "Teste Concrete" (featureBusca)