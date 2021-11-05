package com.test.stepdefs;

import java.net.MalformedURLException;
import java.net.URL;

import org.openqa.selenium.remote.DesiredCapabilities;
import org.openqa.selenium.remote.RemoteWebDriver;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class SearchSteps2 {

	@Given("^I want to write a step with name(\\d+)$")
	public void i_want_to_write_a_step_with_name(int arg1) throws Throwable {
		System.out.println("Its given 1 "+arg1);
	}

	@When("^I check for the (\\d+) in step$")
	public void i_check_for_the_in_step(int arg1) throws Throwable {
		System.out.println("Its when 1 "+arg1);
	}

	@Then("^I verify the success in step$")
	public void i_verify_the_success_in_step() throws Throwable {
		System.out.println("Its then 1");
	}

	@Then("^I verify the Fail in step$")
	public void i_verify_the_Fail_in_step() throws Throwable {
		System.out.println("Its then 2");
	}


}
