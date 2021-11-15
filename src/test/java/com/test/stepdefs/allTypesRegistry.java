package com.test.stepdefs;

import java.util.Arrays;
import java.util.List;
import java.util.Map;

import com.google.gson.JsonArray;

import baseAndHooks.BaseClass;
import io.cucumber.java.DataTableType;
import io.cucumber.java.DocStringType;
import io.cucumber.java.ParameterType;
import io.cucumber.java.en.Given;
import io.cucumber.messages.internal.com.fasterxml.jackson.core.JsonProcessingException;
import io.cucumber.messages.internal.com.fasterxml.jackson.databind.JsonMappingException;
import io.cucumber.messages.internal.com.fasterxml.jackson.databind.JsonNode;
import io.cucumber.messages.internal.com.fasterxml.jackson.databind.ObjectMapper;

public class allTypesRegistry extends BaseClass{

	private BaseClass base;

	public allTypesRegistry(BaseClass base) {
		System.out.println("SearchSteps args constructor");
		this.base = base;
	}
	
	@DocStringType
	public JsonNode json(String json) throws JsonMappingException, JsonProcessingException {
		base.mapper=new ObjectMapper();
		return base.mapper.readTree(json);
	}
	
	@Given("I want to write a step with precondition")
	public void i_want_to_write_a_step_with_precondition(JsonNode json1) {
	    System.out.println("Success parsed using DocStringType : "+json1.get("success"));
	    System.out.println("Success parsed using DocStringType : "+json1.path("success").asText());
	    System.out.println("Success parsed using DocStringType : "+json1.path("counters").get(0).path("counter_name").asText());
	    System.out.println("Success parsed using DocStringType : "+json1.path("counters").get(0).path("hey").get(0).asText());
	    System.out.println("Success parsed using DocStringType : "+json1.path("counters").get(0).path("hey").get(1).asText());
	}
	
	@ParameterType(value = "[^\"]*")
	public List<String> things(String materials){
		return Arrays.asList(materials.split(","));
	}
	
	@Given("I love my country will all my {things}")
	public void i_love_my_country_will_all_my_heart_soul_body(List<String> string) {
	    int i=1;
		for(String s:string) {
	    	System.out.println("ParameterType "+i+" : "+s);
	    	i=+1;
	    }
	}
	//ListOfMaps
	@Given("I login as Admin")
	public void i_login_as_admin(io.cucumber.datatable.DataTable dataTable) {
	    List<Map<String, String>> data=dataTable.asMaps();
	    for(Map<String, String> map:data) {
	    	System.out.println("List Of Maps Admin username : "+map.get("username"));
	    	System.out.println("List Of Maps Admin password  : "+map.get("password"));
	    }
	}
	//ListOfLists
	@Given("I login as Admin2")
	public void i_login_as_admin2(io.cucumber.datatable.DataTable dataTable) {
	    List<List< String>> data=dataTable.asLists();
	    for(List<String> list:data) {
	    	System.out.println("List Of Lists Admin2 username : "+list.get(0));
	    	System.out.println("List Of Lists Admin2 password  : "+list.get(1));
	    }
	}
	
	@DataTableType
	public userInfo convert(Map<String, String> map){
		return new userInfo(map.get("username"),map.get("password"));
	}
	//ListOfObjects
	@Given("I login as Admin1")
	public void i_login_as_admin1(List<userInfo> userinfo) {
	    for(userInfo s:userinfo) {
	    	System.out.println("Datatable as Object Admin1 username : "+s.username);
	    	System.out.println("Datatable as Object Admin1 password : "+s.password);
	    }
	}
	
	private class userInfo {
		public String username;
		public String password;

		public userInfo(String username, String password) {
			this.username = username;
			this.password = password;
		}

	}
		
	

	
	
}
