package runner;

import cucumber.api.CucumberOptions;
import cucumber.api.junit.Cucumber;
import cucumber.api.testng.TestNGCucumberRunner;
import org.junit.runner.RunWith;

@RunWith(Cucumber.class)

@CucumberOptions(features="src/test/resources",glue={"stepdefs"})
public class Runner {
}