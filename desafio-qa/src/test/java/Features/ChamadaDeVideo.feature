#language:pt

    Funcionalidade: Criar cadastro
            Como um usuário
            Eu quero efetuar chamadas de video com meus contatos utilizando a camera do celular
            Para que eu possa efetuar chamadas em tempo real com meus contatos.

    Contexto:
            Dado que eu possua uma conta no Whatsapp
            E eu possua contatos que utilizam o aplicativo
            E eu esteja com o aplicativo aberto

    Cenário: Eu executo uma chamda de video com um contato e a pessoal aceita a chamada
            Dado que eu clique no icone da lista de contatos
            E na tela da lista de contatos, eu selecione um contato
            Quando eu clicar no icone da camera na tela do contato
            E a chamada de video for enviada
            Quando a outra pessoa aceitar a chamada
            Então a chamada de video deverá iniciar
            E deverá ser possivel visualizar a exibição de video do meu contato na minha tela
            E deverá ser possivel conversar com o contato utilizando o microfone e viva voz do celular.