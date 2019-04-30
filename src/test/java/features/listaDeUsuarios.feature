#language: pt
Funcionalidade: Listar os usuários

  Narrativa: Os usuarios do sistema podem visualizar a lista de usuários.

  Cenário: Um usuário pode visualizar todos os outros usuários
    Dado exista o usuário "Francisco" cadastrado
    Quando é exibida a lista de usuários
    Então a lista deve conter o usuário "Francisco"

  Cenário: Um operador do sistema pode encontrar o email do administrador
    Dado que deve-se sempre ter o administrador cadastrado
    Quando pesquisa-se pelo email "administrador@concrete.com.br"
    Então o email deve estar associado ao usuário "Administrador"
