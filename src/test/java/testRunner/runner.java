package testRunner;

import org.junit.runner.RunWith;

import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;

@RunWith(Cucumber.class)
@CucumberOptions( features = "src/test/resources/Features"
		
		,glue = "stepDefinations"

		,monochrome = false
		,dryRun = false
		,tags = "@assingmentByTathagatPanda"
		
		,plugin  = {"com.aventstack.extentreports.cucumber.adapter.ExtentCucumberAdapter:" ,"html:target/HtmlReports.html" }
		
	
		
		
		)



public class runner {

	
		
		
	}
	
	
	
	

