package whastapp.util;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import whastapp.elementos.*;

public class Login {

    public static WebDriver driver;
    public static WebDriverWait wait;

    public static WebDriver getDriver() {
        if(driver == null) {
            System.setProperty("webdriver.chrome.driver", "src/test/resources/chromedriver.exe");
            driver = new ChromeDriver();
            driver.manage().window().maximize();
            driver.get("https://web.whatsapp.com/");
            WebDriverWait wait = new WebDriverWait(driver, 60);
            wait.until(ExpectedConditions.visibilityOfElementLocated(By.cssSelector(Elementos.cssMsgTelaInicial)));
        }
        return driver;
    }

    public static WebDriverWait getWait() {
        wait = new WebDriverWait(getDriver(), 30);
        return wait;
    }

    public static void quitDriver(){
        driver.close();
        driver.quit();
        driver = null;
    }

}
