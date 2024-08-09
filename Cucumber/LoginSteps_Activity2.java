package stepDefinitions;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class LoginSteps_Activity2 {
	    WebDriver driver;
	    WebDriverWait wait;
	    
	    @Given("User is on Login page")
	    public void loginPage() {
	        //Setup instances
	        driver = new FirefoxDriver();
	        WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(10));
	        
	        //Open browser
	        driver.get("https://v1.training-support.net/selenium/login-form");
	    }
	    
	    @When("User enters username and password")
	    public void enterCredentials() {
	        //Enter username
	        driver.findElement(By.id("username")).sendKeys("admin");
	        //Enter password
	        driver.findElement(By.id("password")).sendKeys("password");
	        //Click Login
	        driver.findElement(By.xpath("//button[@type='submit']")).click();
	    }
	    
	    @Then("Read the page title and confirmation message")
	    public void readTitleAndHeading() {
	        //wait.until(ExpectedConditions.visibilityOfAllElementsLocatedBy(By.id("action-confirmation")));
	        
	        //Read the page title and heading
	        String pageTitle = driver.getTitle();
	        String message = driver.findElement(By.id("action-confirmation")).getText();
	        
	        //Print the page title and heading
	        System.out.println("Page title is: " + pageTitle);
	        System.out.println("Login message is: " + message);
	    }
	    
	    @And("Close the Browser")
	    public void closeBrowser() {
	        //Close browser
	        driver.close();
	    }
	}


