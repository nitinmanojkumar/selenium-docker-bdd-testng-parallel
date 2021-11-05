package AppHooks;

import java.net.MalformedURLException;
import java.net.URL;

import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.remote.DesiredCapabilities;
import org.openqa.selenium.remote.RemoteWebDriver;

import baseAndHooks.BaseClass;
import io.cucumber.java.After;
import io.cucumber.java.AfterStep;
import io.cucumber.java.Before;
import io.cucumber.java.Scenario;

public class Hook extends BaseClass {

	private BaseClass base;

	public Hook(BaseClass base) {
		System.out.println("Hooks args constructor");
		this.base = base;
	}
	
	@AfterStep
	public void addScreenshot(Scenario scenario){

	      final byte[] screenshot = ((TakesScreenshot) base.driver).getScreenshotAs(OutputType.BYTES);
	      scenario.attach(screenshot, "image/png", "image"); 
		
	}
	
	 @Before
	    public void setupDriver() throws MalformedURLException {
	        // BROWSER => chrome / firefox
	        // HUB_HOST => localhost / 10.0.1.3 / hostname
		 
		  System.out.println("---------------@Before---------");
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
	        System.setProperty("webdriver.chrome.driver", System.getProperty("user.dir")+"//drivers//chromedriver.exe");
	        base.driver =new ChromeDriver();
	        //base.driver = new RemoteWebDriver(new URL(completeUrl), dc);
	    }

	   @After
	    public void quitDriver(){
		   System.out.println("---------------@After---------");
		   base.driver.quit();
	    }

}
