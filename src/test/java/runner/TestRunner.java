package runner;
import cucumber.api.CucumberOptions;
import cucumber.api.testng.AbstractTestNGCucumberTests;

//@RunWith(Cucumber.class)
@CucumberOptions(features ="src/test/features/DashBoardCommonStatistics.feature",
        glue = "steps",
        dryRun = false,
        monochrome = true,
        plugin = {"pretty","html:test-output"})
public class TestRunner extends AbstractTestNGCucumberTests {

}
