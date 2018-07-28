package TestCase.Glue;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

import cucumber.api.PendingException;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;

public class extenReport_Stepdeff 
{
	WebDriver driver; 
	public void LoginSetup()
	{
		System.setProperty("webdriver.gecko.driver","Testcase_one\\Resources\\geckodriver.exe");
		driver = new FirefoxDriver();
		driver.get("https://www.google.com");
	}
	@When("^user able to see facebook login page$")
	public void user_able_to_see_facebook_login_page() throws Throwable
	{
	    
	}

	@Then("^Enter username and password$")
	public void enter_username_and_password() throws Throwable {
	    // Write code here that turns the phrase above into concrete actions
	    throw new PendingException();
	}

	@Then("^click on login button$")
	public void click_on_login_button() throws Throwable {
	    // Write code here that turns the phrase above into concrete actions
	    throw new PendingException();
	}

	@Then("^user able to see profile$")
	public void user_able_to_see_profile() throws Throwable {
	    // Write code here that turns the phrase above into concrete actions
	    throw new PendingException();
	}
	
	@Then("^close browser$")
	public void close_browser() throws Throwable {
	    // Write code here that turns the phrase above into concrete actions
	    throw new PendingException();
	}
}
