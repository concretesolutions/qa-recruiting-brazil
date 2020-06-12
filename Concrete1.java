/**
 * Script Name : <b> ScriptConcrete1</b> Generated : <b>11/06/2020 21:06</b>
 * Description : Functional Test Script Original Host : Win10 version xx Build
 * xxx (s)
 * 
 * Percorrer Funcoes do app whatsapp clicando no campo search, seguida clicar em settings, 
 * clicar New chat e Entao o sistema sai do whatsapp web.
 * 
 * @since 2020/06/11
 * @author wellington Pontes Medeiros
 * 
 * 
 */
package br.teste.Qa.Com.Desafio1;

import static org.junit.Assert.fail;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import cucumber.api.java.After;
import cucumber.api.java.pt.Dado;
import cucumber.api.java.pt.Entao;

public class Concrete1 extends Utils {
	WebDriver driver;
	String result;
	private StringBuffer verificationErrors = new StringBuffer();

	@Dado("^Acessar o app whatsapp$")
	public void acessar_o_app_whatsapp() throws Exception {
		// Write code here that turns the phrase above into concrete actions
		// Chrome Driver
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\wellp\\Documents\\chrome driver\\chromedriver83.exe");

		// abrir o navegador.
		driver = new ChromeDriver();
		driver.manage().window().maximize();

		// acessar a página
		driver.get("https://web.whatsapp.com/");

		pausar(30000);

	}

	@Dado("^clicar no campo search$")
	public void clicar_no_campo_search() throws Exception {

		driver.findElement(By.xpath("//div[@id='side']/div/div/label/div/div[2]")).click();
		pausar(3000);

		driver.findElement(By.xpath("//div[@id='side']/div/div/button/div[2]/span")).click();
		pausar(3000);

	}

	@Dado("^clicar em settings$")
	public void clicar_em_settings() throws Exception {
		// Write code here that turns the phrase above into concrete actions
		driver.findElement(By.xpath("//div[@id='side']/header/div[2]/div/span/div[3]/div/span")).click();
		pausar(3000);

		driver.findElement(By.xpath("//div[@id='side']/header/div[2]/div/span/div[3]/span/div/ul/li[6]/div")).click();
		pausar(3000);

	}

	@Dado("^clicar New chat$")
	public void clicar_New_chat() throws Exception {
		driver.findElement(By.xpath("//div[@id='app']/div/div/div[2]/div/span/div/span/div/header/div/div/button/span"))
				.click();
		pausar(3000);

		driver.findElement(By.xpath("//div[@id='side']/header/div[2]/div/span/div[2]/div/span")).click();
		pausar(3000);

	}

	@Entao("^o sistema sai do whatsapp web$")
	public void o_sistema_sai_do_whatsapp_web() throws Exception {
		// Write code here that turns the phrase above into concrete actions

		driver.findElement(By.xpath("//div[@id='app']/div/div/div[2]/div/span/div/span/div/header/div/div/button/span"))
				.click();
	}

	@After
	public void tearDown() throws Exception {
		// driver.quit();
		String verificationErrorString = verificationErrors.toString();
		if (!"".equals(verificationErrorString)) {
			fail(verificationErrorString);
		}
	}

}
