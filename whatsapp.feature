#language: pt

#Especificação de duas funcionalidades do Whatsapp (não importa se o app é Android, iOS,
#Windows Phone ou versão Web) em Gherkin ou Gauge
#Cada especificação deve conter ao menos um cenário de teste

  Funcionalidade: Bloqueio de contatos
    A fim de realizar o bloqueio de um contato
    Como um usuario do whatsapp
    Desejo bloquear um outro contato
    Para não interagir com o mesmo

      Cenário: Bloquear um contato por tela de conversas
        Dado  que na tela de conversas
        Quando eu clicar na conversa do contato a ser bloqeuado
        E a conversa for exibida
        Então eu devo selecionar o botão do menu da conversa
        E clicar na opção mais
        Quando selecionar a opção bloquear
        E confirmar clicando em bloquear
        Então eu devo receber uma mensagem de confirmação

       Cenário: Bloquear um contato por tela de contatos
          Dado que na tela de contatos
          Quando eu clicar no contato
          Então eu devo selecionar o botão do menu da conversa
          E clicar na opção "Mais"
          Quando selecionar a opção bloquear
          E confirmar clicando em bloquear
          Então eu devo receber uma mensagem de confirmação

  Funcionalidade: Desbloqueio de contatos
      Afim de desbloquear um contato bloqueado
      Como um usuário do whatsapp
      Desejo remover o bloqueio de um contato
      Para voltar a interagir menssagem deste contato

        Cenário: Desbloquear um contato na tela de contatos
          Dado que com a tela de contatos aberta
          Quando eu pressionar o contato bloqueado por alguns segundos
          E visualizar a opção de "Desbloquear Contato"
          Então devo visualizar o contato sem o efeito de esmeacer e apto para interação

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

  Funcionalidade: Mudar privacidade da foto do perfil
        Afim de mudar quem visualiza a foto do perfil de usuário
        Como um usuário do whatsapp
        Desejo mudar quem pode visualizar minha foto do perfil
        Para

      Cenário: Mudar o estado de visualização da foto do perfil do
      Dado que na tela de Privacidade
      Quando clicar na opção Foto do Perfil
      E selecionar o radiobutton <opcao>
      Então a foto do perfil será <estado>
      Exemplos:
        | opcao         | estado                     |
        | Todos         | Qualquer usuario visualiza |
        | Meus contatos | Apenas contatos salvos     |
        | Ninguem       | Nenhum outro usuario       |



