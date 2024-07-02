package stepDefinitions;

import org.junit.jupiter.api.Assertions;
import org.openqa.selenium.By;
import org.openqa.selenium.firefox.FirefoxDriver;
import io.cucumber.java.AfterAll;
import io.cucumber.java.BeforeAll;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import io.github.bonigarcia.wdm.WebDriverManager;

public class FirstExample extends BaseClass {

		// TODO Auto-generated method stub
		@BeforeAll
		public static void setup() {
			//Set up GeckoDriver
			WebDriverManager.firefoxdriver().setup();
			//Initialize the Driver
			driver = new FirefoxDriver();
		}
		@AfterAll
		public static void teardown() {
			//Close Browser
			driver.quit();
		}
		@Given("the user is on the TS homepage")
		public void openTSHomePage() {
			//Open TS Home Page
			driver.get("https://v1.training-support.net");
			//Assertions
			Assertions.assertEquals("Training Support", driver.getTitle());
		}
		@When("the user clicks on the About Us link")
		public void clickAboutLink() {
			//Find and Click About Us Link
			driver.findElement(By.id("about-link")).click();
		}
		@Then("the user is redirected to the About Page")
		public void verifyAboutPage() {
			//Assertion
			Assertions.assertEquals("About Training Support", driver.getTitle());
		}


	}


