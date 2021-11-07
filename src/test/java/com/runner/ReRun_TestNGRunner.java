package com.runner;

import org.testng.annotations.DataProvider;

import io.cucumber.testng.AbstractTestNGCucumberTests;
import io.cucumber.testng.CucumberOptions;

@CucumberOptions(features = "@test-output/rerunfailed.txt", 
		glue = { "com.test.stepdefs","AppHooks" }, 
		monochrome = true, 
		plugin = {"pretty",
		        "com.aventstack.extentreports.cucumber.adapter.ExtentCucumberAdapter:",
		        "timeline:test-output/test-output-thread-rerun/",
		        "html:test-output/cucumber-reports/rerun-cucumber-report.html",
		        "json:test-output/cucumber-reports/rerun-Cucumber.json",
		        "junit:test-output/cucumber-reports/rerun-Cucumber.xml",
		        "rerun:test-output/re-rerunfailed.txt"})


public class ReRun_TestNGRunner extends AbstractTestNGCucumberTests {

	@Override
	@DataProvider(parallel = true)
	public Object[][] scenarios() {
		return super.scenarios();

	}

}
