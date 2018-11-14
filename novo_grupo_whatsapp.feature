#language:pt
Funcionalidade: Criar Novo Grupo

  Contexto: 
    Dado que eu estou no aplicativo Whatsapp e queira criar um novo grupo 


  Cenario: Criar Novo Grupo 
    Dado que eu selecione a opção "Novo Grupo" 
    E adicione pelo menos um participante ao grupo
    E adicione um nome ao grupo
    Quando clicar no ícone "check"
    Então o grupo deve ser criado com sucesso

  
  Cenario: Removendo um contato do Novo Grupo 
	  Dado que eu tenha selecionado a opção "Novo Grupo"
    E adicionado um contato
    Quando eu clicar no ícone "x" do contato
    Então o contato deve ser removido da lista de contatos do Novo Grupo
    
   
  Cenario: Localizando um contato para adicionar no Novo Grupo
	  Dado que eu tenha selecionado a opção "Novo Grupo"
    Quando clicar no campo "Pesquisar"
    E adicionar um nome de contato existente na agenda
    Então o contato deve ser encontrado


  Cenario: Criar Novo Grupo sem adicionar um contato
    Dado que eu tenha selecionado a opção "Novo Grupo"
    Quando clicar em avançar
    Então a mensagem "Pelo menos 1 contato deve ser selecionado"


  Cenario: Criar Novo Grupo sem adicionar um nome
    Dado que eu tenha selecionado a opção "Novo Grupo"
    E adicione pelo menos um participante ao grupo
    Quando clicar no ícone "check"
    Então a mensagem "Dê um nome ao grupo e uma imagem opcional"