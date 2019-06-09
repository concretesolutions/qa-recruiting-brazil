package br.com.teste.objetcs;

import static org.junit.Assert.assertTrue;

import java.util.concurrent.TimeUnit;

import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.Select;

public class PaginaWebWpp {

	private static final String URL = "https://web.whatsapp.com/";

	private WebDriver driver;

	public PaginaWebWpp(WebDriver driver) {
		this.driver = driver;
	}

	public void acessaPaginaInicial() {
		driver.get(URL);
	}

	
	public void clicandoMenu()  {
		driver.manage().timeouts().implicitlyWait(40, TimeUnit.SECONDS);
	//	driver.manage().timeouts().implicitlyWait(10000, TimeUnit.SECONDS);
		//driver.findElement(By.id("//*[@id='Layer_1']")).isSelected();
		driver.findElement(By.xpath("//*[@id='side']/header/div[2]/div/span/div[3]")).click();
	
		//*[@id='side']/div[1]/div/label
		
		
	}

	@Test
	public void clicaSubMenuPerfil() {
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		driver.findElement(By.xpath("//*[@id='side']/header/div[2]/div/span/div[3]/span/div/ul/li[2]/div")).click();
	}

	@Test
	public void dadosApresentados() {
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		WebElement perfil = driver.findElement(By.xpath("//*[@id='app']/div/div/div[2]/div[1]/span/div/div/header/div/div[2]"));
		assertTrue(perfil.getText().equals("Perfil"));
	}

	@Test
	public void clicoEmCimaStatus() {
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		driver.findElement(By.xpath("//*[@id='app']/div/div/div[2]/div[1]/span/div/div/div/div[4]/div[2]/div[1]/span[2]/div/span")).click();
		
	}

	@Test
	public void digitoMensagem() {
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		driver.findElement(By.xpath("//*[@id='app']/div/div/div[2]/div[1]/span/div/div/div/div[4]/div[2]/div[1]/div/div[2]")).click();
		driver.findElement(By.xpath("//*[@id='app']/div/div/div[2]/div[1]/span/div/div/div/div[4]/div[2]/div[1]/div/div[2]")).sendKeys("Nova Fase Concluida");
		driver.findElement(By.xpath("//*[@id='app']/div/div/div[2]/div[1]/span/div/div/div/div[4]/div[2]/div[1]/div/div[2]")).click();
	}

	@Test
	public void clicoSalvar() {
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		driver.findElement(By.xpath("//*[@id='app']/div/div/div[2]/div[1]/span/div/div/div/div[4]/div[2]/div[1]/span[2]/div/span")).click();
	}

	@Test
	public void retornoParaConversas() {
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		driver.findElement(By.xpath("//*[@id='app']/div/div/div[2]/div[1]/span/div/div/header/div/div[1]/button/span")).click();
		
	}
	
	
}
