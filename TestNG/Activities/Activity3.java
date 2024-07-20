package activities;

import org.testng.annotations.Test;

import io.github.bonigarcia.wdm.WebDriverManager;

import org.testng.annotations.BeforeClass;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.AfterClass;
import org.testng.Assert;

public class Activity3 {
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
  public void testMethod() {
	  WebElement userName = driver.findElement(By.id("username"));
	  userName.sendKeys("admin");
	  WebElement password = driver.findElement(By.id("password"));
	  password.sendKeys("password");
	  WebElement login = driver.findElement(By.xpath("//button[text()='Log in']"));
	  login.click();
	  String message = driver.findElement(By.id("action-confirmation")).getText();
	  Assert.assertEquals("Welcome Back, admin", message);
  }
  

  @AfterClass
  public void tearDown() {
	  driver.quit();
  }

}
