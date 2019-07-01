

class WhatsAppPage

  def mensagemTela
    $browser.h1(text: "Mantenha seu celular conectado")
  end

  def menu
    $browser.div(title: "Menu")
  end

  def optPerfil
    $browser.div(title: "Perfil")
  end

  def optConfiguracoes
    $browser.div(title: "Configurações")
  end

  def iconeEditar
    $browser.divs(title: "Editar")[1]
  end

  def escreverRecado (recado)
    $browser.divs(dir: "ltr")[2].clear
    $browser.divs(dir: "ltr")[2].wait_until(&:present?).set recado
  end

  def confirmarEdicao
    $browser.div(title: "Clique para salvar, Esc para cancelar")
  end

  def confirmarRecado
    $browser.divs(dir: "ltr")[2]
  end

  def configureNotificacoes
    $browser.span(text: "Notificações")
  end

  def boxNotificaDesktop
    $browser.div(xpath: "//div[@class='_2vOyW'][2]")
  end

  def boxNotificaDesktopDisable
    $browser.div(xpath: "//div[@class='_2vOyW'][2]/div/div/div[@class='_1Zo-R']")
  end

end