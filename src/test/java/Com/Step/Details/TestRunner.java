package Com.Step.Details;

import org.junit.runner.RunWith;

import cucumber.api.CucumberOptions;
import cucumber.api.junit.Cucumber;

@RunWith(Cucumber.class)
@CucumberOptions(features = "src/test/resources/Feature",dryRun = true ,glue = "Com.Step.Details" ,plugin = "html:target")
public class TestRunner {
}
