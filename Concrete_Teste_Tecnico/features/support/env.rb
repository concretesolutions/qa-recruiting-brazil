require 'Watir'
require 'rspec'

require Dir.pwd + '/features/support/pages/homePage.rb'

Before do
  @homePage = HomePage.new
  @connectPage = ConnectPage.new
  @whatsappPage = WhatsAppPage.new

  $browser = Watir::Browser.new :chrome
  $browser.window.maximize
  Watir.default_timeout = 60
  $browser.goto 'https://www.whatsapp.com'
end

After do
  $browser.close
end