# language: pt
@grupo
Funcionalidade: Conversar em Grupo no Whatsapp

    Cenário: Criar um novo grupo
        Dado que estou logado no Whatsapp
        Quando crio um novo grupo
        Então posso conversar com as pessoas incluídas nesse grupo

    Cenário: Excluir um grupo
        Dado que estou logado no Whatsapp
        Quando seleciono o grupo 
        E clico em excluir grupo
        Então o grupo é excluido com sucesso