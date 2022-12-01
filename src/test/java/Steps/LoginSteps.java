package Steps;

import io.cucumber.java.en.*;

public class LoginSteps {
	
	@Given("User navigates to the facebook website")
	public void user_navigates_to_the_facebook_website() {
		System.out.println("@Given---User navigates to the facebook website");
	    
	}

	@When("User validates the homepage title")
	public void user_validates_the_homepage_title() {
		System.out.println("@When---User validates the homepage title");
		
	}

	@Then("User enters Username")
	public void user_enters_username() {
		
		System.out.println("@Then---User enters Username");
	
	}

	@And("User enters password")
	public void user_enters_password() {
		System.out.println("@And---User enters password");
		
	}

	@And("user clicks on the signin button")
	public void user_clicks_on_the_signin_button() {
		
		System.out.println("@And---user clicks on the signin button");
	  
	}
	@And("user open to Mainpage")
	public void user_open_to_mainpage() {
	   System.out.println("@And-----Directly open Mainpage");
	}



}
