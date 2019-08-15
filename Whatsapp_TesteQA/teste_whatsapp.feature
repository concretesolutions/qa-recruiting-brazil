# language: pt
Funcionalidade: Ajustes whatsapp

Contexto: Usuario deve estar logado no whatsapp com sua conta pessoal
 
  Cenário: Usuario desativa o modo "confirmacao de leitura"
    Dado que estou na area de conversas
    Quando acesso a opcao de ajustes 
    E acesso a opcao de conta
    E acesso a opcao de privacidade 
    Então desativo a opcao de com firmacao de leitura 

Cenário: Usuario altera transferencia automatica de Midias de fotos
    Dado que estou na area de ajustes
    Quando acesso a opcao de uso de dados e armazenamento
    E acesso a opcao fotos
    Então seleciona a opcao NUNCA


