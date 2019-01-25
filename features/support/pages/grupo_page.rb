class Grupo
    include Capybara::DSL

    def novoGrupo
        find('._3auIg div[title="Menu"]').click
        page.has_selector?('._3auIg div[title="Novo grupo"]')
        find('._3auIg div[title="Novo grupo"]').click
        
        # buscar usuário
        find('input._16RnB').set "Edgar"
        page.find('._1vDUw._1lIXT .RLfQR').click

        find('div[class="_3hV1n"]').click
        # setar nome do grupo
        find('._2S1VP.copyable-text.selectable-text').set "Grupo teste" 
        page.has_selector?('div[class="_3hV1n"]')
        find('div[class="_3hV1n"]').click
        return page.find('.f1UZe', text: 'Grupo criado')
    end

    def conversaGrupo
        page.has_selector?('._2S1VP.copyable-text.selectable-text')
        find('._2S1VP.copyable-text.selectable-text').set "mensagem para grupo...."
        page.has_selector?('._35EW6')
        find('._35EW6').click
    end

    def selecionarGrupo
        find('._3j7s9 span[title="Grupo teste"]').hover
        find('div[class=ZR5SB]').click
        page.has_selector?('div[title="Sair do grupo"]')

        find('div[title="Sair do grupo"]').click
        find('._1WZqU.PNlAR').click
        sleep 0.1
        return page.find('.f1UZe', text: 'Saiu do grupo') 
    end
    def excluirGrupo
        find('._3j7s9 span[title="Grupo teste"]').hover
        find('div[class=ZR5SB]').click
        page.has_selector?('div[title="Apagar grupo"]')
        find('div[title="Apagar grupo"]').click
        find('._1WZqU.PNlAR').click
    end
end