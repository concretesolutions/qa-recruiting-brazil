package config;

import cucumber.api.CucumberOptions;
import cucumber.api.SnippetType;
import cucumber.api.junit.Cucumber;
import org.junit.runner.RunWith;

/**
 * Created by assis on 24/02/17.
 */
@RunWith(Cucumber.class)
@CucumberOptions(
        plugin = {"pretty", "html:target/cucumber"},
        glue = {"steps", "config"},
        features = "src/test/features",
        snippets = SnippetType.CAMELCASE,
        strict = true)
public class RunCukesTest {}
