package runner;

import io.cucumber.testng.AbstractTestNGCucumberTests;
import io.cucumber.testng.CucumberOptions;
import io.cucumber.java.Before;
import io.cucumber.junit.Cucumber;
import org.junit.runner.RunWith;
import org.testng.annotations.DataProvider;

@RunWith(Cucumber.class) //Junit execution

@CucumberOptions(
		plugin = {"pretty", "html:target/shubhangi123.html"}, //reporting purpose
		monochrome=true,  //console output
		tags = "@tag or TS001", //tags from feature file
		features = {"src/test/resources/features"}, //location of feature files
		glue= "stepDefinition") //location of step definition files


public class TestRunner extends AbstractTestNGCucumberTests{
	
	@Override
    @DataProvider(parallel = false)
    public Object[][] scenarios() {
				
		
		return super.scenarios();
    }

	@Before
	public void setupDriver() {
		
		System.setProperty("webdriver.edge.driver", "C:\\Users\\shubh\\Downloads\\edgedriver_win64\\msedgedriver.exe");

	}

}