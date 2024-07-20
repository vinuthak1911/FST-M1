package activities;

import org.testng.annotations.Test;

import io.github.bonigarcia.wdm.WebDriverManager;

import org.testng.annotations.BeforeClass;
import org.testng.annotations.Parameters;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.Assert;
import org.testng.annotations.AfterClass;

public class Activity6 {
	
	WebDriver driver;
	 
	  @BeforeClass
	  public void setUp() {
		  
		  		//Set up GeckoDriver
				WebDriverManager.firefoxdriver().setup();
				//Initialize the Driver
				driver = new FirefoxDriver();
				//Open Browser
				driver.get("https://v1.training-support.net/selenium/login-form");
	  }
	  @Test
	    @Parameters({"username", "password"})
	    public void loginTestCase(String username, String password) {
	        //Find username and pasword fields
	        WebElement usernameField = driver.findElement(By.id("username"));
	        WebElement passwordField = driver.findElement(By.id("password"));
	        
	        //Enter values
	        usernameField.sendKeys(username);
	        passwordField.sendKeys(password);
	        
	        //Click Log in
	        driver.findElement(By.cssSelector("button[type='submit']")).click();
	        
	        //Assert Message
	        String message = driver.findElement(By.id("action-confirmation")).getText();
	        Assert.assertEquals(message, "Welcome Back, admin");
	  }
	  @AfterClass
	  public void tearDown() {
		  driver.quit();
}
}