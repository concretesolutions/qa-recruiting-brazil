package br.com.teste.runner;

import cucumber.api.junit.Cucumber;
import org.junit.runner.RunWith;

@RunWith(Cucumber.class)
@Cucumber.Options(format = { "pretty", "html:target/cucumber-html-report",
		"json-pretty:target/cucumber-report.json" })

public class Runner {

}
