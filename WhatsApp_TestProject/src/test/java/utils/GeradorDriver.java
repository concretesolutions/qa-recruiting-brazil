package utils;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.WebDriverWait;

import io.github.bonigarcia.wdm.WebDriverManager;

public class GeradorDriver {

	private static WebDriver driver;
	private static WebDriverWait wait;

	public static WebDriver getChromeDriver() {
		if (driver == null) {
			WebDriverManager.chromedriver().setup();
			driver = new ChromeDriver();
			driver.manage().window().maximize();
			driver.manage().timeouts().pageLoadTimeout(600, TimeUnit.SECONDS);
			driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
		}
		return driver;
	}
	public static WebDriver getDriver() {
		if (driver == null) {
			WebDriverManager.chromedriver().setup();
			driver = new ChromeDriver();
			driver.manage().window().maximize();
			driver.manage().timeouts().pageLoadTimeout(30, TimeUnit.SECONDS);
			driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
		}

		return driver;
	}

	public static WebDriverWait getWait() {
		wait = new WebDriverWait(getDriver(), 600);
		return wait;
	}

	public static WebDriverWait getWait(int tempo) {
		return new WebDriverWait(getDriver(), tempo);
	}

	public static void setDriver(WebDriver newDriver) {
		driver = newDriver;
	}
}
