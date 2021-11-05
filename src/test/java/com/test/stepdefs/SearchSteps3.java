package com.test.stepdefs;
import java.net.MalformedURLException;
import java.net.URL;

import org.openqa.selenium.remote.DesiredCapabilities;
import org.openqa.selenium.remote.RemoteWebDriver;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;



public class SearchSteps3 {

	@Given("^user navigates to the website javatpoint\\.com$")
	public void user_navigates_to_the_website_javatpoint_com() throws Throwable {
		System.out.println("Its search3 given 1 ");
	}

	@When("^User Navigate to Login Page$")
	public void user_Navigate_to_Login_Page() throws Throwable {
		System.out.println("Its search3 when 1 ");
	}

	@When("^user logs in through Login Window by using <Username> as \"([^\"]*)\" by using$")
	public void user_logs_in_through_Login_Window_by_using_Username_as_by_using(String arg1) throws Throwable {
		System.out.println("Its search3 when 1 "+arg1);
	}

	@When("^<Password> as \"([^\"]*)\" by using$")
	public void password_as_by_using(String arg1) throws Throwable {
		System.out.println("Its search3 when 2 "+arg1);
	}

	@Then("^login must be successful$")
	public void login_must_be_successful() throws Throwable {
		System.out.println("Its search3 then 1 ");
	}

	
	
}
