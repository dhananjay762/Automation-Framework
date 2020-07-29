package test;

import org.junit.runner.RunWith;

import cucumber.api.CucumberOptions;
import cucumber.api.junit.Cucumber;

@RunWith(Cucumber.class)
@CucumberOptions(
		features = {"src/test/java/test/testCases"},
		glue = {"stepDefinitions", "support"},
		format = {"pretty", "html:target/cucumber"}
	)
public class Runner{

}
