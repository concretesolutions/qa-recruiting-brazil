

Dado("que acesso o whatsapp web") do
  @homePage.linkWhatsappWeb.click
end

Dado("realizo a leitura do QRCode com um smartphone") do
  @connectPage.criarAlertaQrCode
  sleep 0.5 while @connectPage.existAlert
  while(@connectPage.qrCodeImg.present?)
    sleep 1.5
  end
  @connectPage.okAlerta if @connectPage.existAlert
end

Dado("clico no menu de opções e seleciono a opção Perfil") do
  @whatsappPage.menu.wait_until(&:present?).click
  @whatsappPage.optPerfil.wait_until(&:present?).click
end

Quando("troco a mensagem para {string}") do |recado|
  @whatsappPage.iconeEditar.wait_until(&:present?).click
  @whatsappPage.escreverRecado(recado)
  @whatsappPage.confirmarEdicao.wait_until(&:present?).click
end

Entao("vejo como recado a mensagem {string}") do |recado|
  #utilizado o rstrip, pois estava sendo adicionado um espaço em branco ao final do recado
  expect(@whatsappPage.confirmarRecado.text.rstrip).to eql recado
end