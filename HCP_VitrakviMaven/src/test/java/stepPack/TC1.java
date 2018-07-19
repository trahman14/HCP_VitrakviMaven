package stepPack;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;

public class TC1 extends AbstractClass{

	
	@Given("^I am on Vitrakvi Home page$")
	public void i_am_on_Vitrakvi_Home_page() {
		
		driver.get("http://vitrakvihcp.pixacore.com/");
	  
	}

	@When("^I click on every lnk on the main menu$")
	public void i_click_on_every_lnk_on_the_main_menu() throws InterruptedException {
	 
		List<WebElement> links = driver.findElements(By.xpath("html/body/div[1]/div[1]/div[3]/ul/li")); 
		
		for(int i=1; i<links.size(); i++) {
		
			System.out.println("These are the links in the footer" + links.get(i).getText());
			
		
			
		
		}
	}
	

	@Then("^I should be directed to the correct page$")
	public void i_should_be_directed_to_the_correct_page() {
	 
	}
}
