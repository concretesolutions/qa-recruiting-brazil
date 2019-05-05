

Dado("A página do wahtsapp") do
  
    visit 'https://web.whatsapp.com/'
    sleep 20 # utilizado para que o usuário realize o login via smartphone no WhatsApp Web
    
    
    end
    
    Quando("seleciono o menu de mensagens arquivadas") do
      
     page.find(:xpath, "//*[@id='side']/header/div[2]/div/span/div[3]/div").click
     page.find(:xpath, "//*[@id='side']/header/div[2]/div/span/div[3]/span/div/ul/li[3]").click
    
    
    end
    
    Entao("é exibida a listagem com a imagem informativa") do 
      page.find(:xpath, "//*[@id='app']/div/div/div[2]/div[1]/span/div/div/div/div/div[1]").click
    
    end
    

    
    
    
    