#language:pt
Funcionalidade: Alterar foto do perfil

Contexto: 
    Dado que eu estou no aplicativo Whatsapp e queira alterar a foto do perfil


Cenario: Alterar foto do perfil utilizando a opção Galeria
    Dado que eu selecione o menu no canto superior direito
    E selecione a opção "Configurações"
    E clique na foto do perfil
    E clique no ícone da câmera
    Quando selecionar a opção "Galeria" para a foto do perfil
    E selecionar uma galeria
    E selcionar uma foto
    E clicar em "concluído"
    Então a foto deve ser alterada


Cenario: Alterar foto do perfil utilizando a opção Câmera
    Dado que eu selecione o menu no canto superior direito
    E selecione a opção "Configurações"
    E clique na foto do perfil
    E clique no ícone da câmera
    Quando selecionar a opção "Câmera" para a foto do perfil
    E bater a foto
    E clicar OK
    E clicar em "concluído"
    Então a foto deve ser alterada


Cenario: Remover foto do perfil
    Dado que eu possua uma foto para o perfil
    E selecione o menu no canto superior direito
    E selecione a opção "Configurações"
    E clique na foto do perfil
    E clique no ícone da câmera
    Quando selecionar a opção "Remover foto"
    E clicar em "Remover"
    Então a foto deve ser removida


Cenario: Cancelar remover foto do perfil
    Dado que eu possua uma foto para o perfil
    E selecione o menu no canto superior direito
    E selecione a opção "Configurações"
    E clique na foto do perfil
    E clique no ícone da câmera
    Quando selecionar a opção "Remover foto"
    E clicar em "Cancelar"
    Então a foto não deve ser removida


Cenario: Cancelar alterar foto do perfil utilizando a opção Galeria
    Dado que eu selecione o menu no canto superior direito
    E selecione a opção "Configurações"
    E clique na foto do perfil
    E clique no ícone da câmera
    Quando selecionar a opção "Galeria" para a foto do perfil
    E selecionar uma galeria
    E selecionar uma foto
    E clicar em "cancelar"
    Então a foto não deve ser alterada


Cenario: Cancelar alterar foto do perfil utilizando a opção Câmera
    Dado que eu selecione o menu no canto superior direito
    E selecione a opção "Configurações"
    E clique na foto do perfil
    E clique no ícone da câmera
    Quando selecionar a opção "Câmera" para a foto do perfil
    E bater a foto
    E clicar OK
    E clicar em "cancelar"
    Então a foto não deve ser alterada


