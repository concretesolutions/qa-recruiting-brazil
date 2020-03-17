#language: pt

#Especificação de duas funcionalidades do Whatsapp (não importa se o app é Android, iOS,
#Windows Phone ou versão Web) em Gherkin ou Gauge
#Cada especificação deve conter ao menos um cenário de teste

  #Especificação da primeira funcionalidade considerando o app para dispositivos android
  @Bloqueio @BloquearUsuario @Smoke
  Funcionalidade: Bloqueio de contatos
                  A fim de realizar o bloqueio de um contato
                  Como um usuario do whatsapp
                  Desejo bloquear um outro contato
                  Para não interagir com o mesmo

    Cenario de Fundo: Abrir aplicativo
      Dado que eu tenha um usuário válido
      Então na tela devo abrir o aplicativo whatsapp

    #declaracao de cenario na forma imperativa
    @BloqueioTelaConversas
    Cenário: Bloquear um contato por tela de conversas
      Dado  que na tela de conversas
        Quando eu clicar na conversa do contato a ser bloqueado
        E a conversa for exibida
        E seleciono o botão do menu da conversa
        Quando clicar na opção mais
        E seleciono a opção bloquear
        E confirmo clicando em "bloquear"
        Então eu devo receber uma mensagem de confirmação

      #declaracao de cenario na forma declarativa
      @BloqueioTelaContatos
       Cenário: Bloquear um contato por tela de contatos
          Dado que na tela de contatos
          Quando seleciono o contato desejado
          E bloqueio o mesmo
          Entao recebo a mensagem de confirmacao

  @Desbloqueio @DesbloquearContato @Smoke
  Funcionalidade: Desbloqueio de contatos
      Afim de desbloquear um contato bloqueado
      Como usuário do whatsapp
      Desejo remover o bloqueio de um contato
      Para voltar a interagir menssagem deste contato

        @DesbloquearContato
        Cenário: Desbloquear um contato na tela de contatos
          Dado que com a tela de contatos aberta
          Quando eu pressionar o contato bloqueado
          E visualizar a opção de "Desbloquear Contato"
          Então devo visualizar o contato desbloquado

        @DesbloquerContatosLista
        Cenário: Desbloquear um contato na lista de contatos bloqueados
          Dado que na tela de conversas
          Quando clicar do menu do whatsapp
          E selecionar a opção "Configurações"
          Então a tela de configurações deve ser exibida
          E devo selecionar a opção "Privacidade"
          Então seleciono a opção "Contatos bloqueados"
          E devo visualizar a lista de contatos bloquados
          Então pressiono o contato por alguns segundos
          E devo visualizar e selecionar a opção "Desbloquear contato"
          Então eu não devo ver mais o contato na minha lista de contatos bloquados

          @MudarPrivacidadeFotoPerfil
          Funcionalidade: Altera Privacidade da foto do perfil

            Esquema do Cenário:  Mudar o estado de visualização da foto do perfil
              Dado que na tela de Privacidade
              Quando clicar na opção Foto do Perfil
              E selecionar o radiobutton "<opcao>"
              Então a foto do perfil será "<estado>"
              Exemplos:
                | opcao         | estado                     |
                | Todos         | Qualquer usuario visualiza |
                | Meus contatos | Apenas contatos salvos     |
                | Ninguem       | Nenhum outro usuario       |



