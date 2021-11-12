package com.searchmodule.pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.util.List;

public class SearchPage extends CommonFunctions{

    //private WebDriver driver;
    private WebDriverWait wait;
    private CommonFunctions common;

    @FindBy(name="q")
    private WebElement searchTxt;

    @FindBy(id = "search_button_homepage")
    private WebElement searchBtn;

    @FindBy(linkText = "Videos")
    private WebElement videosLink;

    @FindBy(className = "tile--vid")
    private List<WebElement> allVideos;

    
    
    public SearchPage(WebDriver driver){
    	super(driver);
        this.driver = driver;
        this.wait = new WebDriverWait(driver, 30);
        PageFactory.initElements(driver, this);
    	common=new CommonFunctions(this.driver);
    }

    public void goTo(){
        this.driver.get("https://duckduckgo.com/");
    }

    public void doSearch(String keyword){
        //this.wait.until(ExpectedConditions.visibilityOf(this.searchTxt));
    	common.Explicitwait_Element(this.searchTxt);
        this.searchTxt.sendKeys(keyword);
        this.searchBtn.click();
    }

    public void goToVideos(){
        //this.wait.until(ExpectedConditions.visibilityOf(this.videosLink));
    	common.Explicitwait_Element(this.videosLink);
        this.videosLink.click();
    }

    public int getResult(){
        By by = By.className("tile--vid");
        this.wait.until(ExpectedConditions.numberOfElementsToBeMoreThan(by, 0));
        System.out.println("Search Result : " + this.allVideos.size());
        return this.allVideos.size();
    }

}