#language: pt
Funcionalidade: Cadastro do usuário

  Narrativa:
  Um usuário é uma pessoa que usa o sistema como cliente ou funcionário
  da empresa.

  Apenas um administrador do sistema pode cadastrar um usuário.

  Contexto:
    Dado que já existe um usuário cadastrado
    Quando o "administrador" realiza uma ação

  @DatabaseSetup("@InserçãoDeUsuarios.xml")
  Cenário: Um administrador insere um usuário
    Dado que o nome do usuário é "Assis Júnior" e o email "assisjrs@gmail.com"
    Quando o usuário é inserido
    Então Devem existir 2 usuários
