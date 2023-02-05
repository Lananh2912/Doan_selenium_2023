package Runner;

import org.junit.AfterClass;
import org.junit.runner.RunWith;
import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;

@RunWith(Cucumber.class)
@CucumberOptions(
		features = "src/test/resources/Feature"
		,glue = {"hooks", "stepDefinitions"}   
		,plugin = {"com.aventstack.extentreports.cucumber.adapter.ExtentCucumberAdapter:"}
		,monochrome = true
		//,publish = true
		
		)

public class Mainrunner {
	@AfterClass
    public static void  closeBrowser(){
       
    }
}

