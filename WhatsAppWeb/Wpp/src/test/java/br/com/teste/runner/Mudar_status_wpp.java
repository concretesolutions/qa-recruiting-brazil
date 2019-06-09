package br.com.teste.runner;


import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import br.com.teste.objetcs.PaginaWebWpp;
import cucumber.api.java.Before;
import cucumber.api.java.pt.Dado;
import cucumber.api.java.pt.Entao;
import cucumber.api.java.pt.Quando;

public class Mudar_status_wpp {

	private WebDriver driver;
	private PaginaWebWpp pagina;

	@Before
	public void inicializa() {
	//	firefoxDriver = new FirefoxDriver();
		driver = new ChromeDriver();
		pagina = new PaginaWebWpp(driver);
	}
	
	@Dado("^entrei no site e espero o sistema para entrar no sistema manualmente$")
	public void entrei_no_site_e_espero_o_sistema_para_entrar_no_sistema_manualmente() throws Throwable {
		pagina.acessaPaginaInicial();
	}

	@Quando("^entro no sistema clico no menu$")
	public void entro_no_sistema_clico_no_menu() throws Throwable {
		pagina.clicandoMenu();
	}

	@Quando("^clico no subMenu Perfil$")
	public void clico_no_subMenu_Perfil() throws Throwable {
		pagina.clicaSubMenuPerfil();
	}

	@Quando("^na tela Dados apresenta informações$")
	public void na_tela_Dados_apresenta_informações() throws Throwable {
		pagina.dadosApresentados();
	}

	@Quando("^clico em cima do status$")
	public void clico_em_cima_do_status() throws Throwable {
	    pagina.clicoEmCimaStatus();
	}

	@Quando("^digito a mensagem$")
	public void digito_a_mensagem() throws Throwable {
	    pagina.digitoMensagem();
	}

	@Quando("^clico em salvar$")
	public void clico_em_salvar() throws Throwable {
	    pagina.clicoSalvar();
	}

	@Entao("^retorno as conversas principais$")
	public void retorno_as_conversas_principais() throws Throwable {
	    pagina.retornoParaConversas();
	}

	
	
	
}
