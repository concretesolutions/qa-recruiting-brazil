#language: pt

Funcionalidade: Gerenciar Grupos via interface web
A fim de envolver várias pessoas com foco em um mesmo assunto
Como um usuário
Eu quero criar grupos com estas pessoas

Contexto: Informações para criar um grupo
   Dado um usuário chamado "Jacqueline"
   E que esteja logado no whatsapp
   E clique no menu
   E em "Novo Grupo"
      
   Cenário: Configurações para criar um grupo
   Dado a tela de "Adicionar Participantes"
   Quando for selecionado um contato
   E clicar em "Próximo"
   Então deverá ser apresentado o ícone para adicionar uma imagem
   E qual o nome do grupo
   
   Cenário: Criar grupo
   Dado a tela de "Adicionar Participantes"
   Quando for selecionado mais de contato
   E clicar em "Próximo"
   E selecionar uma imagem
   E informar um nome do grupo
   Então o grupo deverá ser criado
   E clicar em finalizar
   E deve conter os contatos selecionados

Contexto: Alterar informações de um grupo
   Dado que o usuário seja administrador do grupo
   E tenha selecionado o grupo
   E clique no nome do grupo
   
   Cenário: Alterar descrição do grupo
   Quando clicar no ícone de alteração para o "campo"
   Então deve ser possível editar essa informação
   
   |campo|
   |Nome do Grupo|
   |Descrição do grupo|