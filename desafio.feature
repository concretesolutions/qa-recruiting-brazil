Funcionalidade: Conversa
Contexto: Dado que esteja logado no Whatsapp

Cenário: Iniciar uma nova conversa
Quando enviar uma mensagem a um novo contato
Então a mensagem aparecerá no chat

Cenário: Excluir conversa
Dado que exista uma conversa
Quando excluir a conversa após ter selecionado uma
Então a conversa não deve mais aparecer

Funcionalidade: Ajuste
Contexto: Dado que esteja logado no Whatsapp

Cenário: Trocar foto do perfil
Dado que esteja em edição de perfil dentro de ajustes
Quando alterar minha foto de perfil
Então a nova foto estará disponível para os contatos

