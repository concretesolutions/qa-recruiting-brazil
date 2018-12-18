
language: pt
Funcionalidade: Funcionalidade: Enviar mensagem para contato no Whatsapp. Usuário ativo do whatsapp pode enviar mensagem de texto para qualquer contato adicionado e com conta no whatsapp.

Contexto:
Dado o usuário esteja logado no whatsapp web

Cenário: Enviar uma mensagem para o contato Manoel na lista de conversas recentes
Dado que Manoel está na lista de mensagens recente
Quando clicar em Manoel na lista
Então posso enviar uma mensagem de texto para Manoel

Cenário: Enviar mensagem para o contato Ana que não é um conversa recente
Dado que Ana está na lista de mensagens 
Quando ao digitar Ana no Procurar ou começar nova conversa
E clicar em Ana na lista apresentada com o contato presente
Então posso enviar uma mensagem para Ana

Cenário: Enviar uma mensagem para um contato não adicionado no whastapp, mas cadastrado como contato na agenda do telefone
Dado que Adriano é um contato cadastrado na agenda do telefone
Quando ao digitar Adriano no Procurar ou começar nova conversa
E clicar em Adriano na lista apresentada com o contato presente
Então posso enviar uma mensagem para Adriano

Cenário: Enviar uma mensagem para um contato não adicionado na lista de contatos, mas cadastrado como contato na agenda do telefone e não possua contato whatsapp
Dado que Maria é um contato cadastrado na agenda do telefone
E não tenha whastapp
Quando digitar Maria no Procurar ou começar nova conversa
Então não posso enviar uma mensagem para Maria

Cenário: Enviar mensagem para usuario bloqueado na lista de contatos
Dado que Cris é um contato bloqueado
Quando digitar Cris no Procurar ou começar nova conversa
Então exibe mensagem "Não é possível enviar uma mensagem ao contato bloqueado Cris"

Cenário:Enviar mensagem para usuário apagado da lista de contatos do whatsapp  
Dado que a conversa com Mauricio esteja apagada
Quando digitar Mauricio no Procurar ou começar nova conversa 
Então posso enviar uma mensagem para Mauricio

Cenário: Enviar mensagem para contato no qual tenha bloqueado o usuario que envia a mensagem
Dado que contato Kelly bloqueou o usuario que esta tentando enviar uma mensagem
Quando digitar Kelly no Procurar ou começar nova conversa
Então posso enviar uma mensagem para Kelly mas o contato não recebe mensagem


