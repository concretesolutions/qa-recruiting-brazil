#language: pt
#autor: laedy.cecilia-QA
Funcionalidade: Valida envio de mensagem via whatsapp

  Esquema do Cenário: Validação de envio de mensagem via Whatsapp
    Dado que o usuário esteja logado na conta Web Whatsapp
    Então será possível enviar mensagem <Mensagem> para um contato da sua lista
    E verificar se a  mensagem foi enviada com sucesso

    Exemplos: 
      | Mensagem                   |
      | Olá                        |
  
#Observação: Pode haver mais mensagens a serem enviadas, basta seguir o padrão da formatação acima ex. Olá