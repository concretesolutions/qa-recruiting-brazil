 ############## DADO ##############

Dado('que estou na area de conversas')do 
	whats = TesteWhatsappScreen.new
	whats.txt_titulo_conversas_displayed?
end

Dado('que estou na area de ajustes')do
	whats = TesteWhatsappScreen.new
	whats.touch_btn_dados_armazenamento_displayed?
	whats.touch_btn_dados_armazenamento

end

  ############## QUANDO ##############

Quando('acesso a opcao de ajustes')do 
	whats = TesteWhatsappScreen.new
	whats.btn_ajustes_displayed?
	whats.touch_btn_ajustes
end

Quando('acesso a opcao de conta')do
	whats = TesteWhatsappScreen.new
	whats.btn_conta_displayed?
	whats.touch_btn_conta
end

Quando('acesso a opcao de privacidade')do
	whats = TesteWhatsappScreen.new
	whats.btn_privacidade_displayed?
	whats.touch_btn_privacidade
end

Quando('acesso a opcao de uso de dados e armazenamento')do
	whats = TesteWhatsappScreen.new
	whats.btn_fotos_displayed?
	whats.touch_btn_fotos
end

   ############## ENTAO  ##############

Então('desativar a opcao de com firmacao de leitura ')do
	whats = TesteWhatsappScreen.new
	whats.check_toggle_displayed?
	whats.touch_check_toggle
end

Entao('seleciona a opcao NUNCA')do
	whats = TesteWhatsappScreen.new
	whats.btn_nunca_displayed?
	whats.touch_btn_nunca
end