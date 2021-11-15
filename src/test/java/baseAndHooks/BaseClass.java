package baseAndHooks;

import java.util.Map;

import org.openqa.selenium.WebDriver;

import io.cucumber.messages.internal.com.fasterxml.jackson.databind.ObjectMapper;

public class BaseClass {

	public BaseClass() {
		System.out.println("Its BaseClass constructor");
	}
	
	public WebDriver driver;
	public Map<String, Integer> map;
	public ObjectMapper mapper;
	
}
