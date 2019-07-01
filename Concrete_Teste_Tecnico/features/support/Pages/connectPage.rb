
class ConnectPage

  def criarAlertaQrCode
    $browser.execute_script ("alert('Realize a leitura do QRCode com seu smartphone.');")
  end

  def qrCodeImg
    $browser.image(alt: "Scan me!")
  end

  def okAlerta
    $browser.alert.ok
  end

  def existAlert
    $browser.alert.exists?
  end

end