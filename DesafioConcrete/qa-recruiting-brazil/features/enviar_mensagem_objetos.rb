class Enviar_Mensagem
    def initialize 
        @endereco_nova_conversa ="com.whatsapp:id/fab"
        @txt_nova_conversa = "Nova conversa"
        @endereco_chat = "com.whatsapp:id/conversations_row_contact_name"
        @endereco_tela_chat = "com.whatsapp:id/voice_note_btn"
        @txt_mensagem_de_voz = "Mensagem de voz"
        @txt_digita_mensagem = "com.whatsapp:id/entry"
        @txt_envia_mensagem = "com.whatsapp:id/send"
        @envio_confirmado = "com.whatsapp:id/status"
        @txt_desc_envio = "Enviada"
        @leitura_confirmada = "com.whatsapp:id/status"
        @txt_desc_lida = "Lida"
        @envio_recebido = "com.whatsapp:id/status"
        @txt_desc_recebida = "Entregue"

        @endereco_mais_opcoes = "android.widget.ImageView"
        @txt_mais_opcoes = "Mais opções"
        @valida_menu_opcoes = "com.whatsapp:id/title"
        @txt_menu_opcoes = "Configurações"
        @ve_opcoes_config = "com.whatsapp:id/title"
        @valida_menu_config = "com.whatsapp:id/settings_row_subtext"
        @txt_valida_menu_config = "Privacidade, segurança, mudar número"
        
        
 
    end

    def valida_Tela_Inicial
        @txtNovaConversa == find_element(id:@endereco_nova_conversa).attribute("content-desc")
    end
    
    def tocar_Na_Conversa
        find_element(id:@endereco_chat).click
    end
    
    def valida_Tela_Chat
        @txt_mensagem_de_voz == find_element(id:@endereco_tela_chat).attribute("content-desc")
    end
    
    def digita_Texto_Chat
        find_element(id:@txt_digita_mensagem).send_keys("Teste")
    end
    
    def toca_Envia_Chat
        find_element(id:@txt_envia_mensagem).click
    end
    
    def confirma_Envio
        @txt_desc_envio == find_element(id:@envio_confirmado).attribute("content-desc")
    end
    
    def confirma_Recebe
        @txt_desc_recebida == find_element(id:@envio_recebido).attribute("content-desc")
    end
    
    def confirma_Leitura
        @txt_desc_lida == find_element(id:@leitura_confirmada).attribute("content-desc")
    end
    
    def valida_Mais_Opcoes
        @txt_mais_opcoes == find_elements(class:@endereco_mais_opcoes)[13].attribute("content-desc")
    end

    def clica_Mais_Opcoes
        find_elements(class:@endereco_mais_opcoes)[13].click
    end
    
    def valida_Tela_Opcoes
        @txt_menu_opcoes == find_elements(id:@ve_opcoes_config)[4]
    end
    
    def clica_Btn_Config
        find_elements(id:@ve_opcoes_config)[4].click
    end
    
    def valida_Config
        @txt_menu_config == find_element(id:@valida_menu_config).attribute("content-desc")
    end

    def envia_Audio
        Appium::TouchAction.new.long_press(x: 939, y: 2105, count:1, duration:2000).release.perform
    end
    
end