package Definition;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class Values {

	
	@Given("users is already in the login page1")
	public void users_is_already_in_the_login_page1() {
	    // Write code here that turns the phrase above into concrete actions
	    System.out.println("abc");
	}

	@When("titles of the login page is free CRmm1")
	public void titles_of_the_login_page_is_free_CRmm1() {
	    // Write code here that turns the phrase above into concrete actions
	    System.out.println("abc");
	}

	@Then("users enter {int} and {string}")
	public void users(int string1, String string2) {
	    // Write code here that turns the phrase above into concrete actions
		System.out.println(string1);
		System.out.println(string2);
	}
	
}
