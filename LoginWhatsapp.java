package Tests;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.By;
import static org.junit.Assert.assertTrue;

public class LoginWhatsapp {
	public static WebDriver getChromeDriver() {
		
		System.setProperty("webdriver.chrome.driver", 
				"C:\\Users\\Adm\\eclipse-workspace\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();  //inicializar Google Chrome
		driver.manage().window().maximize();    //setar o taanho do navegador
		driver.get("https://web.whatsapp.com/"); //acessar a página do Whatsapp Web
		try {
			Thread.sleep(15000);   //tempo para logar no Whatsapp
			WebElement login = driver.findElement(By.cssSelector("#app > div > div > div._3HZor._2rI9W > div > div > div._35BbM > h1"));			
			assertTrue(login.getText().contentEquals("Keep your phone connected"));  //Check para provar que esta logado no Whatsapp
		}
		catch(Exception e){
			e.printStackTrace();			
		}		
		return driver;
	}

}
