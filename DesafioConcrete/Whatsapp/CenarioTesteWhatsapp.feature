#language: pt

Funcionalidade: Criar cen�rios para teste
  Como usu�rio do whatsapp
  Eu quero criar cen�rios de testes para o aplicativo
  
  Cen�rio: Deve anexar foto
    Dado que selecionei uma convesa
    Quando a conversa com esse contato ficar dispon�vel
    Ent�o eu vou selecionar a op��o Anexar
    E o whatsapp vai abrir a galeria de imagens do meu celular
    E irei selecionar uma foto
    Dado que a foto foi selecionada
    Quando eu clicar na op��o Enviar
    Ent�o a foto ser� enviada para a conversa
    
  Cen�rio: Deve excluir mensagens de uma conversa
    Dado que selecionei uma conversa
    Quando a conversa com esse contato ficar dispon�vel
    Ent�o eu vou selecionar a op��o Mais Op��es
    Quando a lista de op��es for exibida
    Ent�o eu selecionarei a op��o Mais
    Quando a lista de op��es for exibida novamente
    Ent�o eu selecionarei a op��o Limpar conversa
    E confirmarei a mensagem de exclus�o de conversas
    
  