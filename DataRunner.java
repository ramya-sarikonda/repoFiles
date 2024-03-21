package DataRun;

import io.cucumber.junit.CucumberOptions;
import io.cucumber.testng.AbstractTestNGCucumberTests;


@CucumberOptions(features = "features",glue="stepDefinitions")

public class DataRunner extends AbstractTestNGCucumberTests{
	

}
