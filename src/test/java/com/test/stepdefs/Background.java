package com.test.stepdefs;
import java.net.MalformedURLException;
import java.net.URL;

import org.openqa.selenium.remote.DesiredCapabilities;
import org.openqa.selenium.remote.RemoteWebDriver;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class Background {

	public static int x;
	public static int y;
	public static int z;
	
	@Given("^I navigate to the login page$")
	public void i_navigate_to_the_login_page() throws Throwable {
	    System.out.println("Its background 1step "+x);
	    x=x+1;
	}

	@When("^I submit username and password$")
	public void i_submit_username_and_password() throws Throwable {
		System.out.println("Its background 2step "+y);
	    y=y+1;
	}

	@Then("^I should be logged in$")
	public void i_should_be_logged_in() throws Throwable {
		System.out.println("Its background 3step "+z);
	    z=z+1;
	}
	
}
