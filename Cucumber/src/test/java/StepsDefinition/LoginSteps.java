package StepsDefinition;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class LoginSteps {
	@Given("User is on login page")
	public void user_is_on_login_page() {
		System.out.println("User enter inside login button");
		
	}

	@When("Enter valid username and password")
	public void enter_valid_username_and_password() {
		System.out.println("user inside valid username and password ");
		
	}

	@When("Click on login button")
	public void click_on_login_button() {
		// Write code here that turns the phrase above into concrete actions
		System.out.println("click on login button");
	}

	@Then("User is navigate over HomePage")
	public void user_is_navigate_over_home_page() {
		// Write code here that turns the phrase above into concrete actions
	System.out.println("user is navigate over Homepage");
	}

}
