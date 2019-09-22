#language: pt

  Funcionalidade: Inserir satus no whatsapp
    A fim de inserir conteudo no status
    Como um usuário ativo
    Eu quero inserir um status no perfil do whatsapp


    Cenário: Inserir foto no status
      Dado um perfil ativo no whatsapp
      Quando inserir foto no whatsapp
      Então foto deve ser inserida no status


    Cenário: Inserir mensagem de texto no comentario
      Dado um perfil ativo no whatsapp
      Quando inserir texto no status do whatsapp
      Então texto deve ser inserido no status