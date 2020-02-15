#language:pt

Funcionalidade: Excluir conversa a partir da tela principal do Whatsapp
Nesta funcionalidade o usuário poderá excluir as conversas de determinado contato
ou de vários ao mesmo tempo a partir do seu iphone!

Contexto:
Dado que eu acesse a página principal do whatsapp

@Excluir_Individualmente
Cenário: Excluindo individualmente uma conversa
Neste cenário o usuário excluirá uma conversa por vez!

Quando deslizar para a esquerda a conversa de um contato
E clicar na opção 'Mais'
E clicar na opção 'Apagar conversa'
E clicar na opção 'Apagar conversa' que aparecerá no pop-up de confirmação
Então excluirá a conversa e o contato não aparecerá mais na página principal

@Excluir_Maisdeum
Cenário: Excluindo mais de uma conversa ao mesmo tempo
Neste cenário o usuário excluirá mais de uma conversa por vez!

Quando clicar na opção 'editar'
E marcar as conversas que deseja excluir
E clicar na opção 'Apagar'
E clicar na opção 'Apagar x conversas' que aparecerá no pop-up de confirmação
Então excluirá as conversas e os contatos não aparecerão mais na página principal
 