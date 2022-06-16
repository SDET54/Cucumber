package runners;

import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;
import org.junit.runner.RunWith;

@RunWith(Cucumber.class)
@CucumberOptions(
        plugin = {"html:target/cucumber-reports2.html",
                "json:target/json-reports/cucumber2.json",
                "junit:target/xml-reports/cucumber2.xml"},
        features = "src/test/resources/features",
        glue = "stepDefinitions",
        tags = "@tekrar2",
        dryRun = false
)

public class TestRunner2 {
}
