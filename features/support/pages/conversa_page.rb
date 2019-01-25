class Whatsapp
    include Capybara::DSL
    
    def acessarPagina
        visit 'http://web.whatsapp.com'
        return find('.iHhHL')
    end

    def novaConversa
        find('div[title="Nova conversa"]').click
        find('.jN-F5[title="Buscar contatos"]').set "Edgar"
        find('._1vDUw._2sNbV ._3j7s9').click
        # find('span[class="matched-text"]').click
    end

    def enviaMensagem
        find('._2S1VP.copyable-text.selectable-text').set "teste...."
        find('._35EW6').click
    end

    def selecionaConversa
        find('._3j7s9 span[title="Edgar"]').click
        
    end

    def enviaMensagemPessoa(texto)
        find('._3j7s9 span[title="Edgar"]').click
        find('._2S1VP.copyable-text.selectable-text').set texto
        find('._35EW6').click
        
    end

    def apagaMensagem(mensagem)
        page.find('div[class=_9tCEa] span[dir=ltr]', text: mensagem).hover
        sleep 0.5
        find('div[class=_3kN0h]').click
        find('div[title="Apagar mensagem"]').click
        titles = page.all('div[class=_1S3yi]')
        titles[2].click
        find('._1WZqU.PNlAR').click
        sleep 0.5
        
    end

    def confirmaMensagemApagada
        page.find('.f1UZe', text: '1 mensagem apagada')
    end

end