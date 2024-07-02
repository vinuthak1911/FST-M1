package activities;

import org.testng.annotations.Test;

import io.github.bonigarcia.wdm.WebDriverManager;

import org.testng.annotations.BeforeClass;
import org.testng.annotations.DataProvider;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.Assert;
import org.testng.annotations.AfterClass;

public class Activity7 {
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
  @DataProvider(name = "Authentication")
  public static Object[][] credentials() {
      return new Object[][] { 
          { "admin", "password", "Welcome Back, admin" }, 
          { "testuser_2", "Test@456", "Invalid Credentials" }
      };
  }
  
  @Test(dataProvider = "Authentication")
  public void TestMethod(String username, String password, String expectedResult) {
	  //Find elements
	  WebElement UserName = driver.findElement(By.id("username"));
	  WebElement Password = driver.findElement(By.id("password"));
	  WebElement login = driver.findElement(By.xpath("/html/body/div[2]/div/div[2]/div[2]/div/div/button"));
	  
	  
	  UserName.clear();
	  Password.clear();
	  UserName.sendKeys(username);
	  Password.sendKeys(password);
	  login.click();
	  String message= driver.findElement(By.id("action-confirmation")).getText();
	  
	  
	  Assert.assertEquals(expectedResult, message);
	  Assert.assertEquals(expectedResult, message);
	  
  }

  @AfterClass
  public void tearDown() {
	  driver.quit();
  }

}
