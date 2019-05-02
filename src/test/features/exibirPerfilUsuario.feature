#language: pt
Funcionalidade: Exibir Perfil do usuário

  Narrativa:
    Afim de reter dados de contato
    Os usuário podem visualizar seu próprios dados no perfil.

  Cenário: Um usuário visualiza o perfil a partir do início
    Dado que o usuário "Assis" está na tela inicial
    Quando ele acessa o menu
        E escolhe a opção perfil
    Então ele visualiza seu nome "Assis" no perfil


