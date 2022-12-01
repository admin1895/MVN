package RunnerPage;

import io.cucumber.testng.AbstractTestNGCucumberTests;
import io.cucumber.testng.CucumberOptions;

@CucumberOptions(features="src/test/resources/Features", glue= {"Steps"})
public class TestRunner extends AbstractTestNGCucumberTests
{
	
}
