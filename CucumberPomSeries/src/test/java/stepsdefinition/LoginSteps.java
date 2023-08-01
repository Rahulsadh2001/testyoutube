package stepsdefinition;

import io.cucumber.java.en.*;

public class LoginSteps {

	@Given("User is on login page")
	public void user_is_on_login_page() {
	    // Write code here that turns the phrase above into concrete actions
	    System.out.println("User is on login page");
	}

	@When("Enter valid username and password")
	public void enter_valid_username_and_password() {
	    // Write code here that turns the phrase above into concrete actions
		  System.out.println("User is on login page");
	}

	@When("Click on login button")
	public void click_on_login_button() {
	    // Write code here that turns the phrase above into concrete actions
		  System.out.println("Click on login button");
	}

	@Then("User is navigate over HomePage")
	public void user_is_navigate_over_HomePage() {
	    // Write code here that turns the phrase above into concrete actions
		  System.out.println("User is navigate over HomePage");
	}
}
