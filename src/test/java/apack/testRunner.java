package apack;

import org.junit.runner.RunWith;

import cucumber.api.CucumberOptions;
import cucumber.api.junit.Cucumber;


	@RunWith(Cucumber.class)
	//CucumberOptions(format={"html:output"})
	@CucumberOptions(features = {"src/test/java/apack/myfirsttest.feature"},
	format={"pretty"})

	
	
	public class testRunner {
		

}
