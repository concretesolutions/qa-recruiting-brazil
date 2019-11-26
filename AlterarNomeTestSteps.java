package Tests;

import static org.junit.Assert.assertTrue;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

import cucumber.api.java.After;
import cucumber.api.java.Before;
import cucumber.api.java.es.Dado;
import cucumber.api.java.it.Quando;
import cucumber.api.java.pt.Então;

public class AlterarNomeTestSteps {
	
	WebDriver driver;
	@Before
	public void setUp() {
	driver = LoginWhatsapp.getChromeDriver();
	}
	
	@Dado("^Acessar profile$")
	public void acessar_profile() throws Throwable {

	WebElement perfil = driver.findElement(By.cssSelector("#side > header > div._2rZZg > div > img"));
	perfil.click();		
	}
	@Quando("^Clicar na edição do nome$")
	public void clicar_na_edição_do_nome() throws Throwable {
		WebElement edicao = driver.findElement(By.cssSelector("#app > div > div > div._37f_5 > div._3HZor._3kF8H > span > div > div > div > div:nth-child(2) > div._7w-84._-3Ijj > div._3hnO5._3K9Sw > span._2xHOS > div > span"));
		edicao.click();
	}

	@Então("^Redefinir o nome de usuário$")
	public void redefinir_o_nome_de_usuário() throws Throwable {
		WebElement campo = driver.findElement(By.cssSelector("#app > div > div > div._37f_5 > div._3HZor._3kF8H > span > div > div > div > div:nth-child(2) > div._7w-84._-3Ijj._5UNoc > div._3hnO5 > div > div._3u328.copyable-text.selectable-text"));
		campo.clear();
		campo.sendKeys("Victor Moraes");
		WebElement check = driver.findElement(By.cssSelector("#app > div > div > div._37f_5 > div._3HZor._3kF8H > span > div > div > div > div:nth-child(2) > div._7w-84._-3Ijj._5UNoc > div._3hnO5 > span._2xHOS > div > span"));
		check.click();
	}

	@Então("^checar se foi alterado$")
	public void checar_se_foi_alterado() throws Throwable {
		WebElement campo = driver.findElement(By.cssSelector("#app > div > div > div._37f_5 > div._3HZor._3kF8H > span > div > div > div > div:nth-child(2) > div._7w-84._-3Ijj > div._3hnO5._3K9Sw > div > div._3u328.copyable-text.selectable-text"));
		assertTrue(campo.getText().contentEquals("Victor Moraes"));
	}

	@After
	public void tearDown() {
		driver.close();
		driver.quit();
	}
}
