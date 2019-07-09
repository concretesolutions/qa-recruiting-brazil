package Test.WhatsApp;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class WhatsAppWeb {

	private static final String URL = "https://web.whatsapp.com/";
	private WebDriver driver;	
	
	public WhatsAppWeb(WebDriver driver) {
		this.driver = driver;
		
	}
	
	
	public void paginaInicial ()
	{
		
		driver.get(URL);
		driver.manage().window().maximize();
		
	}
	
	
	

	public void clicaMenu () {
		
		
		driver.manage().timeouts().implicitlyWait(15, TimeUnit.SECONDS);
		
		driver.findElement(By.xpath("/html/body/div[1]/div/div/div[3]/div/header/div[2]/div/span/div[3]/div/span")).click();
		
	}
	
	public void clicaConfig () {
		

		driver.findElement(By.xpath("/html/body/div[1]/div/div/div[3]/div/header/div[2]/div/span/div[3]/span/div/ul/li[5]/div")).click();
		
	}
	
	public void clicaNotifica () {
		

		driver.findElement(By.xpath("/html/body/div[1]/div/div/div[2]/div[1]/span/div/span/div/div/div[2]/div[2]")).click();
		
	}
	
	public void clicaSom () {
		

		driver.findElement(By.xpath("/html/body/div[1]/div/div/div[2]/div[1]/span/div/span/div/div/div/div[1]/div[2]")).click();
		
	}
	
	public void voltaConfig () {
		

		driver.findElement(By.xpath("/html/body/div[1]/div/div/div[2]/div[1]/span/div/span/div/header/div/div[1]/button/span")).click();
		
	}
	

	public void clicaPapelDeParede () {
		

		driver.findElement(By.xpath("/html/body/div[1]/div/div/div[2]/div[1]/span/div/span/div/div/div[3]/div[2]/div/span")).click();
		
	}
	
	
	public void clicaPapelDeParedeAzul () {
		

		driver.findElement(By.xpath("/html/body/div[1]/div/div/div[2]/div[1]/span/div/span/div/div/div/span[8]")).click();
		
	}
	
	public void fechaJanela () {
		
		driver.close();
	
	}
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
}
