package steps;


import org.openqa.selenium.support.PageFactory;

import cucumber.api.java.pt.Então;
import pageObject.EnvioDeMensagem_PO;
import utils.GeradorDriver;


public class EnvioDeMensagem extends GeradorDriver{
	
	EnvioDeMensagem_PO usuario = PageFactory.initElements(getDriver(), EnvioDeMensagem_PO.class);

	@Então("^será possível enviar mensagem (.*) para um contato da sua lista$")
	public void seráPossívelEnviarMensagemParaUmContatoDaSuaLista(String msg) throws Throwable {
	   usuario.enviaMsg(msg);
	}
	
	@Então("^verificar se a  mensagem foi enviada com sucesso$")
	public void verificarSeAMensagemFoiEnviadaComSucesso() throws Throwable {
	    usuario.confirmaEnvio();
	    
	}



}
