package com.test.stepdefs;

import java.util.List;
import java.util.Map;

import baseAndHooks.BaseClass;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class DataTables extends BaseClass{

	
	private BaseClass base;

	public DataTables(BaseClass base) {
		System.out.println("SearchSteps args constructor");
		this.base = base;
	}

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
	
	@Then("verify if the userNM, PWD is correct")
	public void verify_if_the_user_nm_pwd_is_correct() {
		System.out.println(base.map.get("UserName"));
		System.out.println(base.map.get("Password"));
		System.out.println(base.map.get("VerifyText"));
		System.out.println(base.map.get("Integer"));
	}
	
}
