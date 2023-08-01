package StepsDefinition;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class Backgroundtest {
	
	@When("user enters username and password")
	public void user_enters_username_and_password() {
	    // Write code here that turns the phrase above into concrete actions
	    System.out.println("enter unand pw");	}

	@When("clicks on login button")
	public void clicks_on_login_button() {
	    // Write code here that turns the phrase above into concrete actions
	    System.out.println("clikc on login button");
	}

	@Then("user is navigated")
	public void user_is_navigated() {
	    // Write code here that turns the phrase above into concrete actions
	   System.out.println("user is navigated");	}
	
	
	@Given("user in login page")
	public void user_in_login_page() {
	    // Write code here that turns the phrase above into concrete actions
		 System.out.println("user in login page");
	}
	@When("user enters valid username and password")
	public void user_enters_valid_username_and_password() {
	    // Write code here that turns the phrase above into concrete actions
	    System.out.println("user enters valid username and password");
  
	}

	@Then("user is logged in and navigate on Home page")
	public void user_is_logged_in_and_navigate_on_Home_page() {
	    // Write code here that turns the phrase above into concrete actions
	    System.out.println("user is logged in and navigate on Home page");
	}

}
