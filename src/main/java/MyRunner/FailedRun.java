package MyRunner;

import org.junit.runner.RunWith;

import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;

@RunWith(Cucumber.class)
@CucumberOptions(features="@target/failedRerun.txt",
glue= "stepDefinitions",tags= "@EnteringDataByUsingDataTables", plugin= {"pretty","rerun:target/failedRerun.txt"})
public class FailedRun {

}
