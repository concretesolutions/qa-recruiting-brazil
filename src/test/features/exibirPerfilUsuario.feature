#language: pt
Funcionalidade: Exibir Perfil do usuário

  Narrativa:
    Afim de reter dados de contato
    O usuário pode visualizar seu dados no perfil.

  @Producao
  Cenário: Um usuário visualiza o perfil
    Dado que o usuário "Assis" está na tela inicial
    Quando acessar o menu
        E escolher a opção perfil
    Então visualiza o nome no perfil
