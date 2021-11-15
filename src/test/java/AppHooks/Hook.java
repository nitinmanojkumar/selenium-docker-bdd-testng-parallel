package AppHooks;

import java.net.MalformedURLException;
import java.net.URL;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.NoSuchElementException;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.remote.DesiredCapabilities;
import org.openqa.selenium.remote.RemoteWebDriver;
import org.openqa.selenium.support.ui.ExpectedCondition;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.FluentWait;
import org.openqa.selenium.support.ui.WebDriverWait;

import com.google.common.base.Function;

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

	@AfterStep("not @ParameterType")
	public void addScreenshot(Scenario scenario) {

		final byte[] screenshot = ((TakesScreenshot) base.driver).getScreenshotAs(OutputType.BYTES);
		scenario.attach(screenshot, "image/png", "image");

	}

	@Before("@Regression and not @ParameterType")
	public void conditionalHooks(Scenario scenario) {
		System.out.println("Hey the scenario is : " + scenario.getName());
	}

	/*public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver", System.getProperty("user.dir") + "//drivers//chromedriver.exe");
		WebDriver driver = new ChromeDriver();

		driver.get("https://www.google.com");
		driver.manage().timeouts().implicitlyWait(0, TimeUnit.SECONDS);
		
		FluentWait<WebDriver> wait = new FluentWait<WebDriver>(driver);
		wait.pollingEvery(250, TimeUnit.MILLISECONDS);
		wait.withTimeout(20, TimeUnit.SECONDS);
		wait.ignoring(NoSuchElementException.class); // make sure that this exception is ignored
		Function<WebDriver, WebElement> function = new Function<WebDriver, WebElement>() {
			public WebElement apply(WebDriver arg0) {
				System.out.println("Checking for the element!!");
				WebElement element = arg0.findElement(By.id("target"));
				if (element != null) {
					System.out.println("Target element found");
				}
				return element;
			}
		};

		wait.until(function);

	}*/

	@Before("not @ParameterType")
	public void setupDriver() throws MalformedURLException {
		// BROWSER => chrome / firefox
		// HUB_HOST => localhost / 10.0.1.3 / hostname

		System.out.println("---------------@Before---------");
		String host = "localhost";
		DesiredCapabilities dc;

		if (System.getProperty("BROWSER") != null && System.getProperty("BROWSER").equalsIgnoreCase("firefox")) {
			dc = DesiredCapabilities.firefox();
		} else {
			dc = DesiredCapabilities.chrome();
		}

		if (System.getProperty("SE_EVENT_BUS_HOST") != null) {
			host = System.getProperty("SE_EVENT_BUS_HOST");
		}

		String completeUrl = "http://" + host + ":4444/wd/hub";
		System.setProperty("webdriver.chrome.driver", System.getProperty("user.dir") + "//drivers//chromedriver.exe");
		base.driver = new ChromeDriver();
		//base.driver = new RemoteWebDriver(new URL(completeUrl), dc);
	}

	@After("not @ParameterType")
	public void quitDriver() {
		System.out.println("---------------@After---------");
		base.driver.quit();
	}

}
