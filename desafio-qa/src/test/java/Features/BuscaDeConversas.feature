#language: pt

	Funcionalidade: Criar cadastro
        Como um usuário
        Eu quero buscar uma conversa especifica em uma lista de conversas
        Para que eu possa acessar uma conversa específica com um contato


    Contexto:
        Dado que eu possua uma conta no whatsapp
        E eu possua conversas com meus contatos
        E o aplicativo esteja aberto no meu celular

    Cenário: Busca conversa pelo nome do contato para um contato existente e que possua uma conversa.
        Dado que eu acesse a minha lista de conversas
        E que eu clique no icone da lupa
        Quando eu digitar o nome "Vanessa" no campo de texto
        Então o aplivativo deverá exibir minha conversa com o contato digitado
        E o box da conversa deverá exibir o nome do contato
        E a foto do contato deverá ser exibida

    Cenário: Busca conversa com contato não existente
        Dado que eu acesse a minha lista de conversas
        E que eu clique no icone da lupa
        Quando eu digitar o nome "Contato falso" no campo de texto
        Então o aplivativo deverá exibir a mensagem "Nenhum resultado encontrato para 'Contato falso'"
