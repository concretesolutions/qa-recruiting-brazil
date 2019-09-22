#language: pt

  Funcionalidade: Editar dados do perfil no whatsapp
    A fim de alterar dados referente ao perfil
    Como um usuário ativo
    Eu quero modificar os dados pessoais

    @editarperfil
    Cenário: Alterar nome do usuário
      Dado um perfil ativo no whatsapp
      Quando inserir um nome de usuário
      Então o nome do perfil deve ser alterado

    @editarperfil
    Cenário: Alterar Descrição de recado
      Dado Dado um perfil ativo no whatsapp
      Quando inserir a descrição de recado do usuário
      Então a descrição do perfil deve ser alterada