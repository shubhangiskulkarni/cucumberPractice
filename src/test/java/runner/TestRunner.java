package runner;


import org.junit.runner.RunWith;
import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;


@RunWith(Cucumber.class) //Junit execution

@CucumberOptions(
		plugin = {"pretty", "html:target/ShoppingCart_Cucumber.html"}, //reporting purpose
		monochrome=true,  //console output
		tags = "@tag", //tags from feature file
		features = {"src/test/resources/features"}, //location of feature files
		glue= "stepDefinition") //location of step definition files


public class TestRunner {
	
}


