class TesteWhatsappScree < BaseScreen
  
  identificator(:txt_titulo_conversas) { 'Conversas' }
  identificator(:btn_ajustes) { 'Ajustes' }
  identificator(:btn_privacidade) { 'Privacidade' }
  identificator(:btn_conta) { 'Conta' }
  identificator(:check_toggle) { [:id, 'btn_checked'] }

  identificator(:btn_dados_armazenamento) { 'Uso de dados e armazenamento' } 
  identificator(:btn_fotos) { 'Fotos' }
  dentificator(:btn_nunca) { 'Nunca' }

end
