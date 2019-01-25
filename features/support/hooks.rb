Before do
    @whatsapp = Whatsapp.new
    @grupo = Grupo.new
end

After do |scenario| 
    nome_cenario = scenario.name.gsub(/[^A-Za-z0-9 ]/, '')
    nome_cenario = nome_cenario.tr(' ','_').downcase!
    screenshot = "Log/Screenshots/#{nome_cenario}.png"

    page.save_screenshot(screenshot) # capybara tira o screenshot
    embed(screenshot, 'image/png', 'Evidência') # cucumber atacha a evidência no relatóio
end