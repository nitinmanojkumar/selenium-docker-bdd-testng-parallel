package com.runner;

import org.testng.annotations.DataProvider;

import io.cucumber.testng.AbstractTestNGCucumberTests;
import io.cucumber.testng.CucumberOptions;

@CucumberOptions(features = "src/test/resources/features", glue = { "com.test.stepdefs","AppHooks"  }, 
		monochrome = true,
		tags="@DataTables",
 		plugin = {"pretty",
        "com.aventstack.extentreports.cucumber.adapter.ExtentCucumberAdapter:",
        "timeline:test-output/test-output-thread-normal/",
        "html:test-output/cucumber-reports/cucumber-report.html",
        "json:test-output/cucumber-reports/Cucumber.json",
        "junit:test-output/cucumber-reports/Cucumber.xml",
        "rerun:test-output/rerunfailed.txt"})

public class TestNGRunner extends AbstractTestNGCucumberTests{
	
	@Override
	@DataProvider(parallel=true)
	public Object[][] scenarios(){
		return super.scenarios();
		
	}
	     
}
