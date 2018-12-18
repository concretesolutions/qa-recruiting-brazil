Feature: Envio de Fotos

    Scenario: Verificar o envio de fotos para contatos e grupos
    Given Usuário está com internet
    and existe app instalado
    When Usuário acessa lista de contatos do App  e seleciona o contato ou grupo de envio
    and seleciona a foto
    and clica no botão enviar
    Then Foto eniviada com sucesso


    Scenario: Verificar chamada de vídeo
    Given Usuário conectado à internet
    and existe o app instalado
    When acessando a lista de contatos do App e selecionando um contato
    and clica no botão para iniciar chamada
    Then Chamada de vídeo iniciada
    
    Scenario: bloquear contato
    Given usuário está com app aberto
    When acessando a lista de contato
    and clicando no contato que deseja bloquar
    and acessando o menu do contato
    and clicando em bloquar contato e confirmando
    Then contato será bolqueado
    
    Scenario: Compartilhar status
    Give usuário está com app aberto e com internet
    When acessa o status
    and clica no botão para selecionar a foto a ser compartilhada
    and clica no botão compartilhar
    Then foto é compartilhada

