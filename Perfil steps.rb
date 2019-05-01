

Dado("A página do wahtsapp") do
  
visit 'https://web.whatsapp.com/'
sleep 20 # utilizado para que o usuário realize o login via smartphone no WhatsApp Web


end

Quando("seleciono o Perfil") do
  
 page.find(:xpath, "//*[@id='side']/header/div[2]/div/span/div[3]/div").click
 page.find(:xpath, "//*[@id='side']/header/div[2]/div/span/div[3]/span/div/ul/li[2]").click


end

Entao("é exibido a página de perfil de usuário com o campo nome e recado") do 
  page.find(:xpath, "//*[@id='app']/div/div/div[2]/div[1]/span/div/div/div/div[2]").click
  page.find(:xpath, "//*[@id='app']/div/div/div[2]/div[1]/span/div/div/div/div[4]").click

end

E("volto para a listagem de conversas") do 
  page.find(:xpath,"//*[@id='app']/div/div/div[2]/div[1]/span/div/div/header/div/div[1]/button").click
  sleep 5 # utilizado para que o automatizador possa visualizar a listagem
  
end



