package steps;

import cucumber.api.java.pt.Dado;
import utils.GeradorDriver;

public class PreCondicao extends GeradorDriver{
	
	@Dado("^que o usuário esteja logado na conta Web Whatsapp$")
	public void queOUsuárioEstejaLogadoNaContaWebWhatsapp() throws Throwable {
		
		getDriver().get("https://web.whatsapp.com/");
		
		Thread.sleep(10000); // inseri o tempo apenas pq meu pc não estava salvando minha conta
		
	}

}
