package testRunner;
import cucumber.api.CucumberOptions;
import cucumber.api.testng.AbstractTestNGCucumberTests;

//@RunWith(Cucumber.class)
@CucumberOptions(features ="src/test/features/catalog.feature",
        glue ="stepDefinition",
        dryRun = false,
        monochrome = true,
        plugin = {"pretty","html:test-output"})
public class runner extends AbstractTestNGCucumberTests {

}
