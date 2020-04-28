
package definitionsssss;

import io.cucumber.java.After;
import io.cucumber.java.AfterStep;
import io.cucumber.java.Before;
import io.cucumber.java.BeforeStep;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class Hooks_definition {
	
	//Before order
		@Before(order=0)
		public void intialiazOrder()
		{
			System.out.println("before scenarios order");
		}
		
		//After order
		@After(order=0)
		public void tearDownOrder()
		{
			System.out.println("After scenarios order");
		}
		
	
	//Before
	@Before
	public void intialiazeations()
	{
		System.out.println("before scenarios");
	}
	
	//After
	@After
	public void tearDown()
	{
		System.out.println("After scenarios");
	}
	
	
//	tagged hooks before
	@Before("@krishna")
	public void intialtaggedhooksB()
	{
		System.out.println(" before krishna tagged hooks ");
	}
	
//	tagged hooks after
	@After("@krishna")
	public void tearDowntaggedhooksA()
	{
		System.out.println("After krishna tagged hooks");
	}
	
	// Before Step  
	@BeforeStep()
	public void intialBS()
	{
		System.out.println("beforeStep scenarios");
	}
	
	// AfterStep
	@AfterStep()
	public void tearDownAS()
	{
		System.out.println("AfterStep scenarios");
	}
	
//	tagged hooks beforeStep
	@BeforeStep("@krishna")
	public void intialBStaggedhooksBS()
	{
		System.out.println("beforeStep krishna tagged hooks");
	}
	
//	tagged hooks afterStep
	@AfterStep("@krishna")
	public void tearDownAStaggedhooksAS()
	{
		System.out.println("AfterStep krishna tagged hooks");
	}
	
	

	@Given("^testing the hooks$")
	public void testing_the_hooks() throws Throwable {
	   System.out.println("testing the hooks");
	}

	@When("Hooks login page title")
	public void hooks_login_page_title() throws Throwable {
	    System.out.println("Hooks login page title");
	}

	@Given("users is already in the hooks")
	public void users_is_already_in_the_hooks() throws Throwable {
	    System.out.println("users is already in the hooks");
	}

	@When("titles of the login page is free hooks")
	public void titles_of_the_login_page_is_free_hooks() throws Throwable {
	    System.out.println("titles of the login page is free hooks");
	}

	@Then("users enter username and password hooks")
	public void users_enter_username_and_password_hooks() throws Throwable {
	    System.out.println("users enter username and password hooks");
	}

	@Then("users click on login button hooks")
	public void users_click_on_login_button_hooks() throws Throwable {
	    System.out.println("users click on login button hooks");
	}

	@Then("Users is home page hooks")
	public void users_is_home_page_hooks() throws Throwable {
		System.out.println("Users is home page hooks");
	}

	@Given("users is lookin up hooks")
	public void users_is_lookin_up_hooks() throws Throwable {
	    System.out.println("users is lookin up hooks");
	}

	@When("users is taken up hooks")
	public void users_is_taken_up_hooks() throws Throwable {
		System.out.println("user is taken up hooks");
	}

	@Given("users is already in the loginnnnnnnnnnnnnnnnnnnnnnn page hooks")
	public void users_is_already_in_the_loginnnnnnnnnnnnnnnnnnnnnnn_page_hooks() throws Throwable {
		System.out.println("loginnnnnnnnnnnnnnnnnnnnnnn page hooks");
	}

	@When("titles of the loginnnnnnnnnnnnnnnnnnnnnnnnnnnnnnn page is free CRmm hooks")
	public void titles_of_the_loginnnnnnnnnnnnnnnnnnnnnnnnnnnnnnn_page_is_free_CRmm_hooks() throws Throwable {
		System.out.println("loginnnnnnnnnnnnnnnnnnnnnnnnnnnnnnn page is free CRmm hooks");
	}

	@Then("users enter usernamennnnnnnnnnn and passwordnnnnnnnnnnnnnnnnnnnnnnn hooks")
	public void users_enter_usernamennnnnnnnnnn_and_passwordnnnnnnnnnnnnnnnnnnnnnnn_hooks() throws Throwable {
		System.out.println("usernamennnnnnnnnnn and passwordnnnnnnnnnnnnnnnnnnnnnnn hooks");
	}

	@Then("users click on login buttonnnnnnnnnnnnnnnnnnnnnnnnnnnnnnnnnnnn hooks")
	public void users_click_on_login_buttonnnnnnnnnnnnnnnnnnnnnnnnnnnnnnnnnnnn_hooks() throws Throwable {
		System.out.println("login buttonnnnnnnnnnnnnnnnnnnnnnnnnnnnnnnnnnnn hooks");
	}

	@Then("Users is home pagennnnnnnnnnnnnnnnnnnnnnnnnnnnnnnnnnnnnnn hooks")
	public void users_is_home_pagennnnnnnnnnnnnnnnnnnnnnnnnnnnnnnnnnnnnnn_hooks() throws Throwable {
		System.out.println("home pagennnnnnnnnnnnnnnnnnnnnnnnnnnnnnnnnnnnnnn hooks");
	}

	@Given("users is looking up face hooks")
	public void users_is_looking_up_face_hooks() throws Throwable {
		System.out.println("user is lookin up face hooks");
	}

	@When("users is taken up face hooks")
	public void users_is_taken_up_face_hooks() throws Throwable {
		System.out.println("user is taken up face hooks");
	}

}