# language: pt

Funcionalidade: Arquivar conversa do Whatsapp
  Como um usuario posso arquivar uma conversa
  Também posso arquivar mais de uma conversa

Cenário: Arquivar uma conversa
  Dado que eu esteja no app do Whatsapp
  E seleciono uma conversa
  Quando aparece a opção "arquivar conversa"
  Então posso arquivar a conversa

Cenário: Arquivar várias conversas
  Dado que eu esteja no app do Whatsapp
  E seleciono várias conversa
  Quando aparece a opção "arquivar conversa"
  Então posso arquivar várias conversas

