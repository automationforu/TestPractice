package TestRunner;

import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;
import org.junit.runner.RunWith;

@RunWith(Cucumber.class)
@CucumberOptions(
        features = "Features/Demo1.feature",
        glue = "StepDefinations",
        dryRun = false,
        monochrome = true,
        plugin = {"pretty","html:facebook-test-output","json:json-output/facebook.json","junit:junit-xml-output/facebook.xml"}
)
public class TestRunner1 {
} 
