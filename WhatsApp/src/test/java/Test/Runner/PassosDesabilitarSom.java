package Test.Runner;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import Test.WhatsApp.WhatsAppWeb;
import cucumber.api.java.Before;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;

public class PassosDesabilitarSom {

	public WebDriver driver;
	public WhatsAppWeb pagina;
	
	@Before
	public void inicializar () {
		driver = new ChromeDriver();
		pagina = new WhatsAppWeb(driver);
		
	}
	
	@Given("^entrei no site do WhatsApp$")
	public void entrei_no_site_do_WhatsApp() throws Throwable {
	pagina.paginaInicial();

	}

	@When("^eu faço login$")
	public void eu_faço_login() throws Throwable {
	

	}

	@When("^clico na opcao menu$")
	public void clico_na_opcao_menu() throws Throwable {
    pagina.clicaMenu();

	}

	@When("^clico na opcao configuracao$")
	public void clico_na_opcao_configuracao() throws Throwable {
	Thread.sleep(1000);
	pagina.clicaConfig();

	}

	@When("^clico na  opcao notificacao$")
	public void clico_na_opcao_notificacao() throws Throwable {
	pagina.clicaNotifica();

	}

	@Then("^clico em som$")
	public void clico_em_som() throws Throwable {
	Thread.sleep(1000);
	pagina.clicaSom();
	}

	@Then("^volto para configuracaos$")
	public void volto_para_configuracaos() throws Throwable {
	pagina.voltaConfig();
	pagina.fechaJanela();

	}
	
	@When("^clico na  opcao papel de parede$")
	public void clico_na_opcao_papel_de_parede() throws Throwable {
	pagina.clicaPapelDeParede();
	Thread.sleep(1000);
	}

	@Then("^clico no papel de parede azul$")
	public void clico_no_papel_de_parede_azul() throws Throwable {
	pagina.clicaPapelDeParedeAzul();
	Thread.sleep(1000);

	}
	
	
}
