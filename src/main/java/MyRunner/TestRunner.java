package MyRunner;

import org.junit.runner.RunWith;

import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;

@RunWith(Cucumber.class)
@CucumberOptions(features="E:\\vm\\TEST_02\\src\\main\\java\\Features\\HandlingForms.feature",
glue= "stepDefinitions",tags= "@EnteringDataByUsingDataTables", plugin= {"pretty","rerun:target/failedRerun.txt"})

public class TestRunner {
	
	
	}
  