package com.runner;

import org.testng.annotations.DataProvider;

import io.cucumber.testng.AbstractTestNGCucumberTests;
import io.cucumber.testng.CucumberOptions;

@CucumberOptions(features = "@target/rerunfailed.txt", 
		glue = { "com.test.stepdefs","AppHooks" }, 
		monochrome = true, 
		plugin = { "pretty",
				"com.aventstack.extentreports.cucumber.adapter.ExtentCucumberAdapter:", 
				"timeline:test-output-thread/",
				"html:target/cucumber-reports/failed-rerun-cucumber-report.html", 
				"json:target/cucumber-reports/failed-rerun-Cucumber.json",
				"junit:target/cucumber-reports/failed-rerun-Cucumber.xml", 
				"rerun:target/rerunfailed.txt" })


public class ReRun_TestNGRunner extends AbstractTestNGCucumberTests {

	@Override
	@DataProvider(parallel = true)
	public Object[][] scenarios() {
		return super.scenarios();

	}

}
