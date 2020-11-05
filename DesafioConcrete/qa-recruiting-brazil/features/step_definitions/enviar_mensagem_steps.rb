

Dado("que estou na tela inicial") do
    @tela = Enviar_Mensagem.new
    @tela.valida_Tela_Inicial
    end
  
  
    Quando("toco em uma conversa") do
    @tela.tocar_Na_Conversa
    
    end
  
    Entao("entro na tela de chat") do
    @tela.valida_Tela_Chat
    
    end



Dado("que estou na tela de chat") do
    @tela = Enviar_Mensagem.new
    step"toco em uma conversa"
    end
      
      
    Quando("envio uma mensagem de texto") do
    @tela.digita_Texto_Chat
    @tela.toca_Envia_Chat
    end
      
    Entao("recebo a confirmacao de envio") do
      @tela.confirma_Envio || @tela.confirma_Recebe || @tela.confirma_Leitura
    
    end


    Quando ("toco no botao mais opcoes")do

    @tela.clica_Mais_Opcoes
end

    Entao ("vejo o menu de opcoes")do
    @tela.valida_Tela_Opcoes
end
    
    
    
    
    Dado ("que estou no menu mais opcoes")do
    @tela = Enviar_Mensagem.new
    step("toco no botao mais opcoes")
    step("vejo o menu de opcoes")
end
    Quando ("toco em configuracoes")do 
    @tela.clica_Btn_Config
end
    Entao ("entro na tela de configuracao")do
    @tela.valida_Config
end


Quando("envio uma mensagem de audio")do
@tela.envia_Audio
end
     


