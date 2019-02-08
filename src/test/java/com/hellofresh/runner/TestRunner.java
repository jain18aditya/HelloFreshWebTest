package com.hellofresh.runner;

import org.junit.runner.RunWith;
import cucumber.api.CucumberOptions;
import cucumber.api.junit.Cucumber;

@RunWith(Cucumber.class)
@CucumberOptions(plugin = { "pretty", "html:target/html/cucumber.html", "json:target/html/cucumber.json",},
		features = {"src/test/resources/features/HelloFresh.feature" }, 
		glue = {"com.hellofresh.stepdefinition", "com.hellofresh.hooks" },
		monochrome = true)

public class TestRunner {

}
