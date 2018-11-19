#language: pt

Funcionalidade: Publicações de Status
A fim de publicar imagens e vídeos no whatsapp para iOS
Como um usuário
Eu quero gerenciar quais dos meus contatos podem ter acesso a publicação
E quais as visualizaram.

Contexto: Publicação de imagem no status
   Dado um usuário chamado "Jacqueline"
   E que esteja logado no whatsapp
      
   Cenário: "Jacqueline" publica uma postagem
   Quando clicar no ícone "Status"
   E clicar no ícone de adição (+) 
   Ou clicar no ícone de uma câmera
   E selecionar uma imagem
   Ou selecionar um vídeo
   Ou fotografar uma nova imagem
   Ou realizar uma filmagem
   E clicar no ícone de seta (>)
   Então a publicação deve existir no whatsapp do usuário
   E também deve ser apresentada para os contatos
   
Contexto: Operações após a publicação do status
   Dado um usuário chamado "Jacqueline" que possua nos ajustes de privacidade o "Recibo de leitura" ativado
   E que exista um status do whatsapp da "Jacqueline"
   Quando clicar na publicação
   E for apresentada uma nova tela
 
   Cenário: "Jacqueline" verifica contatos que visualizaram a publicação
   Dado ícone de visualização (um olho)
   Quando clicar no ícone
   Então serão apresentados todos os contatos da "Jacqueline" que visualizaram a publicação
   E que possuem permissão.
   
   Cenário: "Jacqueline" remove publicação
   Dado a opção de "Editar"
   Quando selecionar a publicação
   E clicar em "Excluir"
   Então a publicação será removida
   E não será mais apresentada para outros contatos
   