package org.step;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import io.github.bonigarcia.wdm.WebDriverManager;

public class StepDefinition {
	WebDriver driver;
	@Given("user is on facebook login page")
	public void user_is_on_facebook_login_page() {
WebDriverManager.chromedriver().setup();
driver = new ChromeDriver();
driver.get("https://www.facebook.com/");
driver.manage().window().maximize();

	}

	@When("user enters valid username and invalid password")
	public void user_enters_valid_username_and_invalid_password() {
WebElement findElement = driver.findElement(By.id("email"));
	}

	@When("user clicks the login button")
	public void user_clicks_the_login_button() {

	}

	@Then("error is displayed")
	public void error_is_displayed() {

	}

	
}
