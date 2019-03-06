#language: pt

Funcionalidade: Criar Contato

-Eu enquanto usuário
-Quero cadastrar um novo contato

    Cenário: Cadastrar novo contato
      Dado que eu estou na tela de contatos do whatsapp
      Quando eu seleciono Novo contato
      E eu informo Nome
      E eu informo Telefone
      E eu seleciono em Salvar
      Então eu verifico que se o contato foi cadastrado

Funcionalidade: Criar Mensagem

-Eu enquanto usuário
-Quero enviar uma mensagem para um contato

    Cenário: Enviar mensagem para um contato
      Dado que eu estou na tela inicial do whatsapp
      Quando eu seleciono um contato
      E digito um texto
      E seleciono Enviar
      Então eu verifico que a mensagem foi enviada
