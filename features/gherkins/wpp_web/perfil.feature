# language:pt

Funcionalidade: Whatsapp Web - Validar alterações no perfil
  Eu como um usuário final do whatsapp web
  Quero poder acessar o meu perfil
  Para que seja possível realizar alterações no meu nome e na foto

  Contexto:
    Dado que estou logado no whatsapp web
    E seleciono "Perfil" em "Mais opções"

  @alterar_foto_perfil
  Esquema do Cenário: Validar alteração da foto de perfil
    E clico em "Carregar foto" em "MUDAR FOTO DE PERFIL"
    Quando seleciono a minha foto de perfil
    Então valido que a minha foto de perfil foi alterada

  @alterar_nome_perfil
  Esquema do Cenário: Validar alteração do nome no perfil
    Quando altero meu nome apóis clicar em "Editar"
    Então valido que o meu nome de perfil foi alterado
