package whatsapp;

import org.junit.runner.RunWith;

import cucumber.api.CucumberOptions;
import cucumber.api.SnippetType;
import cucumber.api.junit.Cucumber;

@RunWith(Cucumber.class)
@CucumberOptions(
		features = "src/test/resources/features/",
		glue= "",
		plugin = {"pretty", "html:target/report-html", "json:target/report.json"}, 
		monochrome=true,
		snippets= SnippetType.CAMELCASE,
		dryRun=false,
		strict= false 
		)

public class RunnerProject {
}
