# Created by rfranca at 30/08/2018
# language: pt

Funcionalidade: Envio de foto e video

  Contexto: Abre a janela de seleção de arquivo
    Dado que o usuário está logado no WhatsAppWeb
    E inicia uma conversa com o Morty
    Quando abre a janela de envio de arquivos

  @enviar_imagem
  Cenário: Deve enviar uma foto para o Morty
    E seleciona a imagem "pickle_rick.jpeg"
    Então a imagem é enviada

  @enviar_video
  Cenário: Deve enviar um video para o Morty
    E seleciona o video "GOT_s08_teaser.avi"
    Então o video é enviado
