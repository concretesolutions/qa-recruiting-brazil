#language: pt

Funcionalidade: Criar cenários para teste
  Como usuário do whatsapp
  Eu quero criar cenários de testes para o aplicativo
  
  Cenário: Deve anexar foto
    Dado que selecionei uma convesa
    Quando a conversa com esse contato ficar disponível
    Então eu vou selecionar a opção Anexar
    E o whatsapp vai abrir a galeria de imagens do meu celular
    E irei selecionar uma foto
    Dado que a foto foi selecionada
    Quando eu clicar na opção Enviar
    Então a foto será enviada para a conversa
    
  Cenário: Deve excluir mensagens de uma conversa
    Dado que selecionei uma conversa
    Quando a conversa com esse contato ficar disponível
    Então eu vou selecionar a opção Mais Opções
    Quando a lista de opções for exibida
    Então eu selecionarei a opção Mais
    Quando a lista de opções for exibida novamente
    Então eu selecionarei a opção Limpar conversa
    E confirmarei a mensagem de exclusão de conversas
    
  