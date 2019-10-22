package pageObject;

import elements.Elementos;

public class EnvioDeMensagem_PO extends Elementos {

	public void enviaMsg(String msg) {

		System.out.println(remetente.getText());

		remetente.click();
		campoMsg.sendKeys(msg);
		btEnviar.click();
	}

	public void confirmaEnvio() {
		String statusRecebido = status.getText();
		System.out.println("Enviada as: " + statusRecebido);
		
	}
}
