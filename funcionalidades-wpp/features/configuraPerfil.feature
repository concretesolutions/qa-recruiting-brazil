# language: pt

Funcionalidade: Configurar Perfil

Contexto:
    Dado que iniciei a aplicação
    E naveguei para a tela de configurações
    E que eu tenha escolhido a opção com meu "Nome"

Cenário: Buscando na na galeria, opções de imagem para o perfil 
    """
    Sendo um usuário, eu desejo visualizar as imagens disponíveis
    na minha galeria para utilizar como foto de perfil
    """
    Quando pressiono o ícone da câmera
    E escolho a opção "Galeria"
    Então devo visualizar as "Imagens" disponíveis na minha "Galeria"

Cenário: Removendo imagem de perfil
    """
    Sendo um usuário, eu desejo remover minha foto do perfil
    """
    Quando pressiono o ícone da câmera
    E escolho a opção "Remover foto"
    Então devo visualizar a "Imagem padrão" do whatsapp

Cenário: Definindo nome de usuário
    """
    Sendo um usuário, eu desejo definir um nome de usuário para o meu perfil
    """
    Quando pressiono a "opção Nome"
    E digito o meu "Nome de Usuário"
    E salvo
    Então devo ver meu "Nome de usuário" na "opção Nome"
