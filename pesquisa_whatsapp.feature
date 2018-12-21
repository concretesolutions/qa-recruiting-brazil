    #language: pt
    # encoding: utf-8
    @pesquisa
    Funcionalidade: Pesquisar contatos e grupos no WhatsApp Android
      Como usuário do aplicativo WhatsApp
      Posso pesquisar contatos e grupos
      Para que eu possa me comunicar ou compartilhar informações

      Contexto: Acesso aplicativo WhatsApp
        Dado que eu esteja no aplicativo do WhatsApp

      Esquema do Cenário: pesquisar contatos ou grupos
        Quando preencho as informações de pesquisa de um grupo ou contato <dados_pesquisa>
        Então o aplicativo apresenta a pesquisa realizada com sucesso

        Exemplos:
          | dados_pesquisa   |
          | "jorge"          |
          | "Teste Concrete" |
