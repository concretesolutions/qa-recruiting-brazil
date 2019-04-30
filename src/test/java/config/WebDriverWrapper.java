package config;

import org.openqa.selenium.*;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.HasInputDevices;
import org.openqa.selenium.interactions.Keyboard;
import org.openqa.selenium.interactions.Mouse;
import org.openqa.selenium.internal.*;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.springframework.context.annotation.Bean;
import org.springframework.stereotype.Component;

import java.util.List;
import java.util.Set;

@Component
public class WebDriverWrapper implements WebDriver, JavascriptExecutor,
        FindsById, FindsByClassName, FindsByLinkText, FindsByName,
        FindsByCssSelector, FindsByTagName, FindsByXPath,
        HasInputDevices, HasCapabilities, TakesScreenshot {

    @Bean
    public WebDriverWait webDriverWait() {
        return new WebDriverWait(getWebDriver(), 60);
    }

    private static WebDriver webDriver;

    public static WebDriver getWebDriver() {
        if(webDriver == null)
            webDriver = new ChromeDriver();

        return webDriver;
    }

    @Override
    public void get(final String url) {
        try {
            getWebDriver().get(url);
        }catch (Exception e) {
            webDriver = null;
            getWebDriver().get(url);
        }
    }

    @Override
    public String getCurrentUrl() {
        try {
            return getWebDriver().getCurrentUrl();
        }catch (Exception e) {
            webDriver = null;
            return getWebDriver().getCurrentUrl();
        }
    }

    @Override
    public String getTitle() {
        try {
            return getWebDriver().getTitle();
        }catch (Exception e) {
            webDriver = null;
            return getWebDriver().getTitle();
        }
    }

    @Override
    public List<WebElement> findElements(By by) {
        return getWebDriver().findElements(by);
    }

    @Override
    public WebElement findElement(By by) {
        return getWebDriver().findElement(by);
    }

    @Override
    public String getPageSource() {
        return getWebDriver().getPageSource();
    }

    @Override
    public void close() {
        try {
            getWebDriver().close();
        }catch (Exception e) {
            webDriver = null;
            getWebDriver().close();
        }
    }

    @Override
    public void quit() {
        try {
            getWebDriver().quit();
        }catch (Exception e) {
            webDriver = null;
            getWebDriver().quit();
        }
    }

    @Override
    public Set<String> getWindowHandles() {
        return getWebDriver().getWindowHandles();
    }

    @Override
    public String getWindowHandle() {
        return getWebDriver().getWindowHandle();
    }

    @Override
    public TargetLocator switchTo() {
        return getWebDriver().switchTo();
    }

    @Override
    public Navigation navigate() {
        return getWebDriver().navigate();
    }

    @Override
    public Options manage() {
        return getWebDriver().manage();
    }

    @Override
    public Capabilities getCapabilities() {
        return ((HasCapabilities)getWebDriver()).getCapabilities();
    }

    @Override
    public Object executeScript(String script, Object... args) {
        return ((JavascriptExecutor)getWebDriver()).executeScript(script, args);
    }

    @Override
    public Object executeAsyncScript(String script, Object... args) {
        return ((JavascriptExecutor)getWebDriver()).executeAsyncScript(script, args);
    }

    @Override
    public <X> X getScreenshotAs(OutputType<X> target) throws WebDriverException {
        return ((TakesScreenshot)getWebDriver()).getScreenshotAs(target);
    }

    @Override
    public Keyboard getKeyboard() {
        return ((HasInputDevices)getWebDriver()).getKeyboard();
    }

    @Override
    public Mouse getMouse() {
        return ((HasInputDevices)getWebDriver()).getMouse();
    }

    @Override
    public WebElement findElementByClassName(String using) {
        return ((FindsByClassName)getWebDriver()).findElementByClassName(using);
    }

    @Override
    public List<WebElement> findElementsByClassName(String using) {
        return ((FindsByClassName)getWebDriver()).findElementsByClassName(using);
    }

    @Override
    public WebElement findElementByCssSelector(String using) {
        return ((FindsByCssSelector)getWebDriver()).findElementByCssSelector(using);
    }

    @Override
    public List<WebElement> findElementsByCssSelector(String using) {
        return ((FindsByCssSelector)getWebDriver()).findElementsByCssSelector(using);
    }

    @Override
    public WebElement findElementById(String using) {
        return ((FindsById)getWebDriver()).findElementById(using);
    }

    @Override
    public List<WebElement> findElementsById(String using) {
        return ((FindsById)getWebDriver()).findElementsById(using);
    }

    @Override
    public WebElement findElementByLinkText(String using) {
        return ((FindsByLinkText)getWebDriver()).findElementByLinkText(using);
    }

    @Override
    public List<WebElement> findElementsByLinkText(String using) {
        return ((FindsByLinkText)getWebDriver()).findElementsByLinkText(using);
    }

    @Override
    public WebElement findElementByPartialLinkText(String using) {
        return ((FindsByLinkText)getWebDriver()).findElementByPartialLinkText(using);
    }

    @Override
    public List<WebElement> findElementsByPartialLinkText(String using) {
        return ((FindsByLinkText)getWebDriver()).findElementsByPartialLinkText(using);
    }

    @Override
    public WebElement findElementByName(String using) {
        return ((FindsByName)getWebDriver()).findElementByName(using);
    }

    @Override
    public List<WebElement> findElementsByName(String using) {
        return ((FindsByName)getWebDriver()).findElementsByName(using);
    }

    @Override
    public WebElement findElementByTagName(String using) {
        return ((FindsByTagName)getWebDriver()).findElementByTagName(using);
    }

    @Override
    public List<WebElement> findElementsByTagName(String using) {
        return ((FindsByTagName)getWebDriver()).findElementsByTagName(using);
    }

    @Override
    public WebElement findElementByXPath(String using) {
        return ((FindsByXPath)getWebDriver()).findElementByXPath(using);
    }

    @Override
    public List<WebElement> findElementsByXPath(String using) {
        return ((FindsByXPath)getWebDriver()).findElementsByXPath(using);
    }
}
