#language: pt-br

Teste em aplicação Mobile: WhatsApp
Critérios: Necessário que aplicação possua contatos para realização do teste
Ambiente: Teste deve ser realizado em um aparelho com acesso a rede de internet, versão do Android 8.0 ou superior e versão atualizada da aplicação

Funcionalidade: Enviar mensagem a um contato 
    Cenario de Teste: Enviar mensagem com sucesso contendo caracteres especiais
        Dado que:
            Estou acessando o WhatsApp e preciso enviar uma mensagem 
        Quando:
            Eu clico no ícone verde no canto inferior direito
            E clico em um contato
            E digito uma mensagem com caracteres especiais
            E clico no ícone de enviar mensagem
        Então:
            A mensagem deve ser enviada com sucesso apresentando símbolo de check na mesma 
 
    Cenario de Teste: Enviar mensagem com sucesso contendo 700 caracteres
        Dado que:
            Estou acessando o WhatsApp e preciso enviar uma mensagem 
        Quando:
            Eu clico no ícone verde no canto inferior direito
            E clico em um contato
            E digito uma mensagem com 700 caracteres 
            E clico no ícone de enviar mensagem
        Então:
            A mensagem deve ser enviada com sucesso apresentando símbolo de check na mesma 

Funcionalidade: Realizar uma chamada de voz para um contato
    Cenario de Teste: Iniciar uma chamada de voz com sucesso
        Dado que:
            Estou acessando o WhatsApp e preciso realizar uma chamada de voz 
        Quando:
            Eu clico no ícone verde no canto inferior direito
            E clico em um contato
            E clico no ícone de telefone no canto superior direito
        Então:
            A chamada de voz deve ser iniciada com sucesso
