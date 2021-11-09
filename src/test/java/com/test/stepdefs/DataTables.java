package com.test.stepdefs;

import java.util.List;
import java.util.Map;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class DataTables {

	@Given("User is on Home Page")
	public void user_is_on_home_page() {
		System.out.println("User is on Home Page");
	}

	@When("User Navigate to LogIn Page")
	public void user_navigate_to_log_in_page() {
		System.out.println("User Navigate to LogIn Page");
	}

	@When("User enters Credentials to LogIn")
	public void user_enters_credentials_to_log_in(io.cucumber.datatable.DataTable dataTable) {
		List<Map<String, String>> data = dataTable.asMaps(String.class,String.class);
		for(Map<String, String> map:data) {
			System.out.println("UserName is :"+map.get("Username"));
			System.out.println("Password is :"+map.get("Password"));
		}
	}

	@Then("Message displayed Login Successfully")
	public void message_displayed_login_successfully() {
		System.out.println("Message displayed Login Successfully");
	}
	
	@Then("I should be logged in {string} as dummyUser")
	public void i_should_be_logged_in_as_dummy_user(String string) {
	    System.out.println("Inline argument from feature file is : "+string);
	}
	
}
