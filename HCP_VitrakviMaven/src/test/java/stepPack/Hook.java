package stepPack;

import org.openqa.selenium.chrome.ChromeDriver;

import cucumber.api.java.After;
import cucumber.api.java.Before;

public class Hook extends AbstractClass{

	@Before
	public void setUP() {
		
		System.setProperty("webdriver.chrome.driver", "/Users/tarek.rahman/Documents/AutomationTestingTraining/Drivers/chromedriver"); 
		driver = new ChromeDriver(); 
		
		
		driver.manage().window().maximize();
	}
	
	@After 
	public void tearDown() {
		driver.quit();
		
	}
	
}
