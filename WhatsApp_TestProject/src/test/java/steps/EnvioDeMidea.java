package steps;

import org.openqa.selenium.support.PageFactory;

import cucumber.api.java.pt.Então;
import pageObject.AnexoDeArquivo;
import pageObject.EnvioDeMidea_PO;
import pageObject.ListaBtn;
import utils.GeradorDriver;

public class EnvioDeMidea extends GeradorDriver {

	EnvioDeMidea_PO usuario = PageFactory.initElements(getDriver(), EnvioDeMidea_PO.class);
	AnexoDeArquivo seleciona = PageFactory.initElements(getDriver(), AnexoDeArquivo.class);
	ListaBtn midea = PageFactory.initElements(getDriver(), ListaBtn.class);

	@Então("^o usuario seleciona um remetente$")
	public void oUsuarioSelecionaUmRemetente() throws Throwable {
		
		usuario.selecionaUsuario();
	}

	@Então("^envia o arquivo com sucesso$")
	public void enviaOArquivoComSucesso() throws Throwable {
		
		Thread.sleep(3000);
		usuario.selecionaArquivo();
		midea.elementoLista(getDriver());
		seleciona.anexarArquivo(getDriver());
		usuario.enviaMidea();
		
	}

}
