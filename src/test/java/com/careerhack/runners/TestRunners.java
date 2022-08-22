package com.careerhack.runners;

import io.cucumber.testng.AbstractTestNGCucumberTests;
import io.cucumber.testng.CucumberOptions;
@CucumberOptions(
		features = "Features",
		glue= "com.careerhack.stepdef",
		tags= "@googlesearch"
		
	)


public class TestRunners  extends AbstractTestNGCucumberTests {
	
	

}
