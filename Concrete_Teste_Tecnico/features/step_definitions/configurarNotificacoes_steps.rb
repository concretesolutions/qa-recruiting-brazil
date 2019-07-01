

Dado("estou logado no WhatsApp Web") do
  steps %{
    Dado que acesso o whatsapp web
    E realizo a leitura do QRCode com um smartphone
  }
end

Dado("clico no menu de opções e seleciono a opção Configurações") do
  @whatsappPage.menu.wait_until(&:present?).click
  @whatsappPage.optConfiguracoes.wait_until(&:present?).click
end

Dado("clico em Notificações") do
  @whatsappPage.configureNotificacoes.wait_until(&:present?).click
end

Quando("desmarco a opção Notificações na área de trabalho") do
  @whatsappPage.boxNotificaDesktop.wait_until(&:present?).click
end

Então("vejo que a opção está desmarcada") do
  expect(@whatsappPage.boxNotificaDesktopDisable.exists?).to eql true
end