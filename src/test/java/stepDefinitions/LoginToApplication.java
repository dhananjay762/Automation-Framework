package stepDefinitions;

import cucumber.api.java.en.Given;
import cucumber.api.java.en.When;
import pages.LoginPage;

public class LoginToApplication{
	
	LoginPage loginPage = new LoginPage();
	
	@Given("^User navigates to the application$")
	public void user_navigates_to_the_application(){
		loginPage.openApplication();
	}
	
	@When("^I enter the username \"([^\"]*)\" and password \"([^\"]*)\"$")
	public void i_enter_the_username_and_password(String userName, String password){
		loginPage.enterEmail(userName);
		loginPage.enterPassword(password);
	}
	
	@When("^I click on login$")
	public void i_click_on_login(){
		loginPage.loginToApplication();
	}

	
}
