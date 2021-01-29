package TestRunner;

import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;
import org.junit.runner.RunWith;

@RunWith(Cucumber.class)
@CucumberOptions(
        features = "Features/Demo2.feature",
        glue = "Dropable",
        dryRun = false,
        monochrome = true,
        plugin = {"pretty","html:dropable-test-output","json:json-output/dropable.json","junit:junit-xml-output/dropable.xml"}
)

public class DropableTestRunner {
}
