package com.test.stepdefs;


import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

import org.junit.Assert;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.remote.DesiredCapabilities;
import org.openqa.selenium.remote.RemoteWebDriver;

import com.searchmodule.pages.SearchPage;

import baseAndHooks.BaseClass;

//import org.testng.Assert;
import java.net.MalformedURLException;
import java.net.URL;

public class SearchSteps extends BaseClass{

	private BaseClass base;

	public SearchSteps(BaseClass base) {
		System.out.println("SearchSteps args constructor");
		this.base = base;
	}
	
    private SearchPage searchPage;

    @Given("^I am on the website duck-duck-go$")
    public void launchSite() {
    	System.out.format("Thread ID - %2d -  feature file.\n",
    	        Thread.currentThread().getId());
        searchPage = new SearchPage(base.driver);
        searchPage.goTo();
    }

    @And("^I enter the \"([^\"]*)\" to search$")
    public void enterKeyword(String keyword) {
        searchPage.doSearch(keyword);
    }

    @And("^I navigate to videos search$")
    public void navigateTovideos()  {
        searchPage.goToVideos();
    }

    @Then("^I should get minimum (\\d+) search results$")
    public void verifySearchResults(int min) {
        int size = searchPage.getResult();
        //Assert.assertTrue(size > min);
    }

    /*@Before
    public void setupDriver() throws MalformedURLException {
        // BROWSER => chrome / firefox
        // HUB_HOST => localhost / 10.0.1.3 / hostname
        String host = "localhost";
        DesiredCapabilities dc;

        if(System.getProperty("BROWSER") != null &&
                System.getProperty("BROWSER").equalsIgnoreCase("firefox")){
            dc = DesiredCapabilities.firefox();
        }else{
            dc = DesiredCapabilities.chrome();
        }

        if(System.getProperty("SE_EVENT_BUS_HOST") != null){
            host = System.getProperty("SE_EVENT_BUS_HOST");
        }

        String completeUrl = "http://" + host + ":4444/wd/hub";
        this.driver = new RemoteWebDriver(new URL(completeUrl), dc);
    }

   @After
    public void quitDriver(){
        this.driver.quit();
    }*/

}