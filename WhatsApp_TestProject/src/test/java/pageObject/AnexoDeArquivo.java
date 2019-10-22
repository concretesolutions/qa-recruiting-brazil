package pageObject;

import java.awt.Robot;
import java.awt.Toolkit;
import java.awt.datatransfer.StringSelection;
import java.awt.event.KeyEvent;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.ui.WebDriverWait;

public class AnexoDeArquivo {

	WebDriver driver;
	WebDriverWait wait;

	
	public void anexarArquivo(WebDriver driver) {
		
		String filePath = System.getProperty("user.dir");
		StringSelection ss = new StringSelection(filePath + "\\src\\main\\resources\\concrete.png");
		Toolkit.getDefaultToolkit().getSystemClipboard().setContents(ss, null);

		try {
			Robot robot = new Robot();
			robot.delay(1000);

			robot.keyPress(KeyEvent.VK_CONTROL);
			robot.keyPress(KeyEvent.VK_V);
			robot.keyRelease(KeyEvent.VK_V);
			robot.keyRelease(KeyEvent.VK_CONTROL);
			robot.keyPress(KeyEvent.VK_ENTER);
			robot.keyRelease(KeyEvent.VK_ENTER);
			robot.delay(2000);
		} catch (Exception e) {

		}
	}
}
