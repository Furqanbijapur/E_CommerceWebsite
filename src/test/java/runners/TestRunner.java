package runners;

import io.cucumber.testng.AbstractTestNGCucumberTests;
import io.cucumber.testng.CucumberOptions;
import org.testng.annotations.DataProvider;

/**
 * The TestRunner class is used to configure and execute Cucumber tests with TestNG.
 * It specifies the feature files, step definitions, plugins, and other options for the test execution.
 */
@CucumberOptions(
        features = "src/test/resources/features", // Path to the feature files
        glue = "stepDefinitions", // Package containing step definition classes
        plugin = {
                "pretty", // Prints the Gherkin steps in the console in a readable format
                "com.aventstack.extentreports.cucumber.adapter.ExtentCucumberAdapter:" // Generates ExtentReports
        },
        tags = "@Search", // Filters scenarios to run based on the specified tag
        monochrome = true // Ensures the console output is readable by disabling ANSI colors
)
public class TestRunner extends AbstractTestNGCucumberTests {

    /**
     * Provides the scenarios to be executed in parallel.
     * Overrides the default implementation in AbstractTestNGCucumberTests.
     *
     * @return A two-dimensional array of scenarios to be executed.
     */
    @Override
    @DataProvider(parallel = true)
    public Object[][] scenarios() {
        return super.scenarios();
    }
}