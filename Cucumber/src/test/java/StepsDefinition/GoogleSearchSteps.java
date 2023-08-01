package StepsDefinition;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import io.cucumber.java.en.*;

public class GoogleSearchSteps {
	WebDriver driver=null;
	 
	@Given("Browser is open")
	public void browser_is_open() {
	
		System.setProperty("Webdriver.chorme.driver", "C:\\Users\\DELL\\eclipse-workspace\\Cucumber"
				+ "\\src\\test\\resources\\Drivers\\chromedriver.exe");
		driver=new ChromeDriver();
		//driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
	}

	@Given("user is on google search page")
	public void user_is_on_google_search_page() {
		driver.get("https://www.google.com/");
		
	}

	@When("user enters text in search box")
	public void user_enters_text_in_search_box() throws InterruptedException {
		//Thread.sleep(10000);
		driver.close();
	}

	@When("Hit enter")
	public void hit_enter() {
		
		
	}

	@Then("user is navigate to search results")
	public void user_is_navigate_to_search_results() {
		
		
	}



}

