#language:pt

Funcionalidade: Excluir conversa a partir da tela principal do Whatsapp
Nesta funcionalidade o usuário poderá excluir as conversas de determinado contato
ou de vários ao mesmo tempo a partir do seu iphone!

Contexto:
Dado que eu acesse a página principal do whatsapp

@Excluir_Individualmente
Cenário: Excluindo individualmente uma conversa
Neste cenário o usuário excluirá uma conversa por vez!

Quando apagar a conversa individualmente
Então excluirá a conversa e o contato não aparecerá mais na página principal

@Excluir_Maisdeum
Cenário: Excluindo mais de uma conversa ao mesmo tempo
Neste cenário o usuário excluirá mais de uma conversa por vez!

Quando marcar mais de uma conversa
Então as conversas dos contatos não aparecerão mais na página principal
 