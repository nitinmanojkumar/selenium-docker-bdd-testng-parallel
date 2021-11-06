package com.test.stepdefs;

import java.net.MalformedURLException;
import java.net.URL;

import org.junit.Assert;
import org.openqa.selenium.remote.DesiredCapabilities;
import org.openqa.selenium.remote.RemoteWebDriver;

import com.searchmodule.pages.SearchPage;

import baseAndHooks.BaseClass;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class SearchSteps2 extends BaseClass{

	private BaseClass base;

	public SearchSteps2(BaseClass base) {
		System.out.println("SearchSteps2 args constructor");
		this.base = base;
	}
	
    private SearchPage searchPage;

    @Given("^I ama on the website duck-duck-go$")
    public void launchSite() {
    	System.out.format("Thread ID - %2d -  feature file.\n",
    	        Thread.currentThread().getId());
        searchPage = new SearchPage(base.driver);
        searchPage.goTo();
        	
    }
    
    
    public static void main(String[]args) {
    	int random_int=(int)Math.floor(Math.random()*(2-1+1)+1);
    	System.out.println(random_int);
    }

    @And("^I entera the \"([^\"]*)\" to search$")
    public void enterKeyword(String keyword) {
        searchPage.doSearch(keyword);
        int random_int=(int)Math.floor(Math.random()*(2-1+1)+1);
        Assert.assertEquals(keyword, "docker"+random_int);
    }

    @And("^I navigatea to videos search$")
    public void navigateTovideos()  {
        searchPage.goToVideos();
    }

    @Then("^I shoulda get minimum (\\d+) search results$")
    public void verifySearchResults(int min) {
        int size = searchPage.getResult();
        //Assert.assertTrue(size > min);
    }


}