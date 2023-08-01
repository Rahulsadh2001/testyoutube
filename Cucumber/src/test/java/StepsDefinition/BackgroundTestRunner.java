package StepsDefinition;
import org.junit.runner.RunWith;

import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;

@RunWith(Cucumber.class)

@CucumberOptions(
		
features="src/test/resources/FeatureWithBackground/Background.feature",
glue= {"abc"},
//tags= {"@SmokeTest"},
monochrome=true,
plugin= {"pretty","html:target/HtmlReports"}
)

public class BackgroundTestRunner {

}
