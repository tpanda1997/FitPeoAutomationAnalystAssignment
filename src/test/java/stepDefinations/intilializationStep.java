package stepDefinations;

import java.time.Duration;

import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;

import io.cucumber.java.After;
import io.cucumber.java.AfterStep;
import io.cucumber.java.Before;
import io.cucumber.java.Scenario;
import utilties.readProperties;

public class intilializationStep {

	
	

	public static WebDriver driver;
	
	readProperties read = new readProperties();
	
   @Before
	public void setUp() {
		
		
		lunchBrowser(read.getProperty("config").getString("browser"));
		lunchUrl(read.getProperty("config").getString("url"));
		
	}
	
	public void lunchBrowser(String browser) {
		
	
		switch (browser.toLowerCase()) {
		
		case "chrome":
			
			driver= new ChromeDriver();
			driver.manage().window().maximize();
			driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));
			
			break;
			
        case "edge":
        	
        	driver = new EdgeDriver();
        	driver.manage().window().maximize();
        	driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));
			break;

		default:
			System.out.println("Given browser name is invalid");
			break;
		}
	
	
}
	
	
	public void lunchUrl(String url) {
	
		driver.get(url);
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));
	}
	
	@After
	public void closeBrowser() {
		
		driver.quit();
	}
	
	@AfterStep
	public void addScreensortAfterSteps(Scenario scenario) {
		
	   
		byte[] scrennsort=((TakesScreenshot)driver).getScreenshotAs(OutputType.BYTES);
		
		scenario.attach(scrennsort,"image/png", scrennsort.toString());
		
	}

	
	
	
}
