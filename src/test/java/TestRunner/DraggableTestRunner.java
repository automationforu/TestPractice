package TestRunner;

import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;
import org.junit.runner.RunWith;

@RunWith(Cucumber.class)
@CucumberOptions(
        features = "Features/Draggable.feature",
        glue = "Draggable",
        monochrome = true,
        dryRun = false,
        plugin = {"pretty","html:Draggable-test-output","json:json-output/Draggable.json","junit:junit-xml-output/Draggable.xml"}

)
public class DraggableTestRunner {
}
