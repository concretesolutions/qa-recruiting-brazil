package stepDefinitions;
import java.net.MalformedURLException;
import java.net.URL;
import org.openqa.selenium.By;
import org.openqa.selenium.remote.DesiredCapabilities;
import io.appium.java_client.AppiumDriver;
import io.appium.java_client.MobileElement;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;


public class StepDef_CadastroDeNumero {
	static AppiumDriver<MobileElement> driver;
	
		
		
	@Given ("^Que eu tenha o WhatsApp instalado$")
	public void Que_eu_tenha_o_WhatsApp_instalado() throws MalformedURLException  {
		DesiredCapabilities cap = new DesiredCapabilities();
		cap.setCapability("deviceName", "ONE PLUS 5");
		cap.setCapability("udid", "emulator-5554");
		cap.setCapability("platformName", "Android");
		cap.setCapability("platformVersion", "7.1.1");
		
		
		cap.setCapability("appPackage", "com.whatsapp");
		cap.setCapability("appActivity", "com.whatsapp.Main");
		cap.setCapability("ro.build.version.sdk", 25);
		
		URL url = new URL("http://127.0.0.1:4723/wd/hub");
		driver = new AppiumDriver<MobileElement>(url, cap);
		
	 
	}



    @When ("^Eu concordo com os termos$")
    public void Eu_concordo_com_os_termos()  {
    	driver.findElement(By.xpath("/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.FrameLayout/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.Button")).click();
		
   	 
   	}

   
    @When("^clico na caixa para digitar o numero$")
    public void clico_na_caixa_para_digitar_o_numero()  {
    	driver.findElement(By.id("com.whatsapp:id/registration_phone")).click();
      
    }

    @When("^digito o numero$")
    public void digito_o_numero()  {
    	driver.findElement(By.id("com.whatsapp:id/registration_phone")).sendKeys("11960639074");
       
    }

    @When("^aperto na opcao proximo$")
    public void aperto_na_opcao_proximo()  {
    	 driver.findElement(By.id("com.whatsapp:id/registration_submit")).click();
        
    }

    @When("^confirmo o numero$")
    public void confirmo_o_numero()  {
    	driver.findElement(By.id("android:id/message")).click();
	    driver.findElement(By.id("android:id/button1")).click();
       
    }

    @Then("^eu valido que estou aguardando o SMS para finalizar o cadastro$")
    public void eu_valido_que_estou_aguardando_o_SMS_para_finalizar_o_cadastro()  {
    	String texto = driver.findElement(By.id("com.whatsapp:id/description_2_bottom")).getText();
        System.out.println(texto);
    }
    
    @When("^escolho um pais diferente do Brasil$")
    public void escolho_um_pais_diferente_do_Brasil() {
    	driver.findElement(By.id("com.whatsapp:id/registration_country")).click();
    	driver.findElement(By.xpath("/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.FrameLayout/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.ListView/android.widget.LinearLayout[3]/android.widget.LinearLayout/android.widget.LinearLayout")).click();
       
    }

    @Then("^eu valido que o aviso de erro do pais$")
    public void eu_valido_que_o_aviso_de_erro_do_pais() {
        System.out.println("Pais Invalido");
        
    }
    
    @When("^digito um numero invalido$")
    public void digito_um_numero_invalido() {
    	driver.findElement(By.id("com.whatsapp:id/registration_phone")).sendKeys("9999999999");
    }

    @Then("^eu valido que o numero e errado$")
    public void eu_valido_que_o_numero_e_errado() {
        System.out.println("numero errado");
        
    }
}
