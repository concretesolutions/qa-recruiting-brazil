status.feature

language: pt
Funcionalidade: Enviar anexo no Whatsapp
Contexto:
Dado que esteja logado no whatsapp web
E tenha conversa aberta no contato Manoel
E clicar no ícone Anexo

Cenário: Anexar fotos e vídeos na conversa com Manoel
Dado que o usuario possua fotos ou vídeos em seu repositorio
Quando selecionar fotos e vídeos
E escolher a foto X.jpeg
E pré-visualizar a imagem
E digitar NomeFoto
E enviar foto
Então a mensagem com anexo e descrição do anexo é enviada.

Cenário: Anexar arquivo da camera na conversa com Manoel
Dado que o usuario possua câmera em seu dispositivo
Quando selecionar câmera
E permitir uso da câmera
E clicar em tirar foto
E digitar Fotonova em Adicionar uma legenda
E enviar foto
Então mensagem com anexo e descrição do anexo é enviada.

Cenário: Anexar Documentos na conversa com Manoel
Dado que o usuario possua documento em seu repositorio
Quando selecionar Documentos
E escolher o documento Documento.doc
E pré-visualizar a imagem
E digitar "Nome do documento"
E enviar documento
Então a mensagem com anexo e descrição do anexo é enviada.

Cenário: Anexar arquivo contato na conversa com Manoel 
Dado que o contato Kelly exista cadastrado como contatos
Quando selecionar contato
E buscar contato Kelly
E selecionar o contato Kelly
E clicar em enviar contato
E enviar contato
Então mensagem com anexo com dados do contato são enviados
