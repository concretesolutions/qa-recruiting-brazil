package pageObject;

import elements.Elementos;

public class EnvioDeMidea_PO extends Elementos {

	public void selecionaUsuario() {
		
		System.out.println(remetente.getText());
		remetente.click();
	}

	public void selecionaArquivo() {

		btAnexo.click();
	}
	
	public void enviaMidea() {
		btEnviarImg.click();
		String confirmaEnvio = status.getText();
		System.out.println(confirmaEnvio);
		
	}
}
