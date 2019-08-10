================================================================================================
### Automação de funcionalidades do WhatsApp mobile Android e resolução do exercício Kata09 para o desafio da Concrete Solutions ###
================================================================================================





Nome: Tiago Augusto Ferreira Martins 




E-mail: tiago.augusto.f.martins@gmail.com


### Rotina de criação ###

bundle init - cria e inicia o gemfile

no gemfile deixar assim:





            *gem "appium_console"  - biblioteca do appium
            *gem "appium_lib"      - biblioteca do appium
            *gem "pry"             - modo debug
            *gem "cucumber"


bundle install - cria o gemlock





cucumber --init  -cria feature suport e step definitions





colar dentro do env.rb:





            *require 'appium_lib'
            *caps = Appium.load_appium_txt file: File.join('./appium.txt')
            *Appium::Driver.new(caps, true)
            *Appium.promote_appium_methods Object





dentro da pasta suport criar um arquivo hooks.rb e colar os metodos before e after





            *Before do
            *driver.start_driver
            *end

            *After do 
            *driver.driver_quit
            *end
para criar o caps de Android, digite no terminal da linha de comando:





            *arc setup android





inserir no arquivo appium.txt suas informações do dispositivo:





            *platformName = "ANDROID"
            *deviceName = "NOME DO DISPOSITIVO"
            *appPackage = 'com.whatsapp'
            *appActivity = 'com.whatsapp.HomeActivity'
            *noReset= true
            *automationName = "UiAutomator2"





verificar se o dispositivo está conectado, digitar no terminal:





            *adb devices





na aba features criar uma nova feature





em seguida criar um novo arquivo na pasta step_definitions do tipo





            *nome_da_feature.rb





criar um novo arquivo de classe dentro da pasta features para os objetos






### Comandos ###





iniciar o servidor do Appium digitando no terminal: 





            *appium





abrir mais um terminal do tipo bash





para iniciar o modo console, digitar no terminal:





            *arc 





digitar no terminal para mapeamento dos elementos da tela:





            *page





pesquisar elemento pelo ID:





            *find_element(id:"id_do_elemento").attribute("content-desc")





pesquisar elemento indexado pelo ID na posição:





            *find_elements(id:"id_do_elemento")[PosiçãoVetorial].attribute("content-desc")





para iniciar o teste no cucumber, digite no terminal: 





            *cucumber





para rodar uma feature específica, digite no terminal: 





            *cucumber features/nomeDaFeature.feature:numeroDaLinhaDoCenario





buscar posição do botao por coordenada cartesiana:





            *find_element(id:"id_do_elemento").location
            *resposta do terminal:=> #<struct Selenium::WebDriver::Point x=posicaoX, y=posicaoY>
            *exemplo:Appium::TouchAction.new.long_press( x: posicaoX, y:posicaoY, count: 1, duration: tempoEmMiliSegundos).release.perform





### Links Úteis ###





https://cucumber.io/docs/gherkin/step-organization/                                        - Como o cucumber encontra a feature e o step definition






https://docbehat.readthedocs.io/pt/v3.1/guides/1.gherkin.html                              - Sintaxe Gherkin






https://www.concrete.com.br/2018/08/24/cucumber-truques-e-dicas/                           - Dicas cucumber






https://www.rubyguides.com/2019/01/ruby-initialize-method/                                 - Instanciar objeto no ruby






https://medium.com/@danilopolicarpo14/aprenda-appium-com-cucumber-ruby-ce18872f2cb3        - Configurar Appium






http://appium.io/docs/en/commands/session/create/                                          - Iniciar sessao appium






https://www.rubydoc.info/github/appium/ruby_lib/Appium/TouchAction                         - Ação de "apertar e segurar" no appium







