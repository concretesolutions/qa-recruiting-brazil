package config;

import cucumber.api.CucumberOptions;
import cucumber.api.SnippetType;
import cucumber.api.junit.Cucumber;
import org.junit.AfterClass;
import org.junit.runner.RunWith;

import static config.WebDriverWrapper.getWebDriver;

/**
 * Created by assis on 24/02/17.
 */
@RunWith(Cucumber.class)
@CucumberOptions(
        plugin = "pretty",
        glue = {"stepDefinitions", "config"},
        features = "src/test/java/features",
        snippets = SnippetType.CAMELCASE,
        strict = true)
public class RunCukesTest {
    @AfterClass
    public static void destruirWebDriver() {
        getWebDriver().close();
        getWebDriver().quit();
    }
}
