package StepsDefinition;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class LoginDemoinNaukri {
	WebDriver driver=null;
	LoginPagewithPageFactory loginPagewithPageFactory;
	@Given("User is navigate over Login page")
	public void user_is_navigate_over_Login_page() {
	    // Write code here that turns the phrase above into concrete actions
		System.setProperty("Webdriver.chorme.driver", "C:\\Users\\DELL\\eclipse-workspace\\Cucumber"
				+ "\\src\\test\\resources\\Drivers\\chromedriver.exe");
		driver=new ChromeDriver();
		driver.get("https://practicetestautomation.com/practice-test-login/");
	}

	@When("Enter correct (.*) and (.*)$")
	public void enter_correct_and_rahul111(String username ,String password) throws InterruptedException {
	    // Write code here that turns the phrase above into concrete actions
		driver.manage().window().maximize();
		loginPagewithPageFactory= new LoginPagewithPageFactory(driver);
		Thread.sleep(4000);
		loginPagewithPageFactory.username.sendKeys(username);
		 //  driver.findElement(By.xpath("//input[@id='username']")).sendKeys(username);
					// Write code here that turns the phrase above into concrete actions
				//    driver.findElement(By.xpath("//input[@id='password']")).sendKeys(password);
		loginPagewithPageFactory.password.sendKeys(password);  
	}

	@When("Enter correct passowrd")
	public void enter_correct_passowrd() {
	    // Write code here that turns the phrase above into concrete actions
System.out.println("enter passowrd");
	}

	@Then("Navigate to homepage")
	public void navigate_to_homepage() {
	    // Write code here that turns the phrase above into concrete actions
	   System.out.println("done passowrd");
	}



	}


