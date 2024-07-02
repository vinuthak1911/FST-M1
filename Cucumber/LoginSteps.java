package stepDefinitions;

import java.time.Duration;

import org.junit.jupiter.api.Assertions;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.support.ui.WebDriverWait;


import io.cucumber.java.AfterAll;
import io.cucumber.java.BeforeAll;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import io.github.bonigarcia.wdm.WebDriverManager;

public class LoginSteps extends BaseClass{
	@BeforeAll
	public static void setup() {
		//Set up GeckoDriver
		WebDriverManager.firefoxdriver().setup();
		//Initialize the Driver
		driver = new FirefoxDriver();
		WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(10));
	}
	
	@Given("the user is on the login page")
	public void openHomePage() {
		//Open TS Home Page
		driver.get("https://v1.training-support.net/selenium/login-form");
		//Assertions
		Assertions.assertEquals("Login Form", driver.getTitle());
		}

	@When("the user enters username and password")
	public void entercreds() {
		//Find username and password field
		driver.findElement(By.id("username")).sendKeys("admin");
		driver.findElement(By.id("password")).sendKeys("password");
	}
	
	@When("the user enters {string} and {string}")
	public void enterCredsfromInputs(String username, String password) {
		//Find the input fields
		WebElement usernameField=driver.findElement(By.id("username"));
		WebElement passwordField=driver.findElement(By.id("password"));
		//Clear fields
		usernameField.clear();
		passwordField.clear();
		//Send data
		usernameField.sendKeys(username);
		passwordField.sendKeys(password);
	}
	@And("clicks on Submit button")
	public void clickSubmit() {
		//Find Element and Click
		driver.findElement(By.xpath("//button[@type='submit']")).click();
	}
	
	@Then("get the confirmation text and verify message")
	public void confirmMessage() {
		//Find Element and Click
		String message = driver.findElement(By.id("action-confirmation")).getText();
		Assertions.assertEquals("Welcome Back, admin", message);
	}
	@Then("get the confirmation text and verify message as {string}")
	public void confirmMessageAsInput(String expectedMessage) {
		//Find Element and Click
		String message = driver.findElement(By.id("action-confirmation")).getText();
		Assertions.assertEquals(expectedMessage, message);
	}
	@AfterAll
	public static void teardown() {
		//Close Browser
		driver.quit();
	}
}
