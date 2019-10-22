package pageObject;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class ListaBtn {

	WebDriver driver;

	public void elementoLista(WebDriver driver) throws Throwable {

		List<WebElement> linhas = driver.findElements(By.tagName("li"));

		Thread.sleep(2000);

		WebElement validar = linhas.get(0);
		validar.click();

		Thread.sleep(2000);

	}
}
