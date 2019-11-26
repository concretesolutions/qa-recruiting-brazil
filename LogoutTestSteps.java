package Tests;

import static org.junit.Assert.assertTrue;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

import cucumber.api.java.After;
import cucumber.api.java.Before;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;

public class LogoutTestSteps {
	
	WebDriver driver;
	@Before
	public void setUp() {
	driver = LoginWhatsapp.getChromeDriver();
	}
	
	@Given("^Acessar o menu$")
	public void acessar_o_menu() throws Throwable {
		WebElement menu = driver.findElement(By.cssSelector("#side > header > div.sbcXq > div > span > div:nth-child(3) > div > span"));
		menu.click();
	}

	@When("^clicar para fazer logoff$")
	public void clicar_para_fazer_logoff() throws Throwable {
		WebElement logout = driver.findElement(By.cssSelector("#side > header > div.sbcXq > div > span > div._3j8Pd.GPmgf > span > div > ul > li:nth-child(6)"));
		logout.click();
	}

	@Then("^Checar se foi deslogado da conta$")
	public void checar_se_foi_deslogado_da_conta() throws Throwable {
		WebElement body = driver.findElement(By.cssSelector("#app > div > div > div.landing-window > div.landing-main > div > div._3FB_S > ol > li:nth-child(1)"));
		assertTrue(body.getText().contentEquals("Open WhatsApp on your phone"));
	}
	@After
	public void tearDown() {
		driver.close();
		driver.quit();
	}
	

}
