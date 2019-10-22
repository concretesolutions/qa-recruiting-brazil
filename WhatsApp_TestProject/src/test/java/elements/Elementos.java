package elements;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class Elementos {
	
	@FindBy (css="#pane-side > div:nth-child(1) > div > div > div:nth-child(1) > div > div > div._2WP9Q > div.KgevS > div._3H4MS > span > span")
	protected WebElement remetente;
	
	@FindBy(css="#main > footer > div._2i7Ej.copyable-area > div._13mgZ > div > div._3u328.copyable-text.selectable-text")
	protected WebElement campoMsg;
	
	@FindBy(css="#main > footer > div._2i7Ej.copyable-area > div:nth-child(3) > button")
	protected WebElement btEnviar;
	
	@FindBy(css="._3fnHB")
	protected WebElement status;
	
	
	@FindBy(css="#main > header > div._2kYeZ > div > div:nth-child(2) > div")
	protected WebElement btAnexo;
	
	@FindBy(css="#app > div > div > div._37f_5 > div._3HZor._2rI9W > span > div > span > div > div > div.rK2ei.USE1O > span:nth-child(3) > div > div > span")
	protected WebElement btEnviarImg;

	
}
