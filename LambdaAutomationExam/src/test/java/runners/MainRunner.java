package runners;

import io.cucumber.testng.AbstractTestNGCucumberTests;
import io.cucumber.testng.CucumberOptions;
import org.testng.annotations.DataProvider;

@CucumberOptions(features =
        {"src/test/java/resources/features"},
        glue = {"stepDefinitions"},
        tags = "",
        monochrome = true,
        dryRun = false,
        plugin = {"pretty", "html:target/report.html", "json:target/report.json"}
)

public class MainRunner extends AbstractTestNGCucumberTests {

    @Override
    @DataProvider(parallel = false)
    public Object[][] scenarios() {
        return super.scenarios();
    }

}
