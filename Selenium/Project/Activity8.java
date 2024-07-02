package project;

import org.testng.annotations.Test;
import io.github.bonigarcia.wdm.WebDriverManager;
import org.testng.annotations.BeforeClass;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.Assert;
import org.testng.annotations.AfterClass;

public class Activity8 {
	WebDriver driver;
	  
	  @BeforeClass
	  public void beforeClass() {
		//Set up GeckoDriver
				WebDriverManager.firefoxdriver().setup();
				//Initialize the Driver
				driver = new FirefoxDriver();
				//Open Browser
				driver.get("https://alchemy.hguy.co/jobs/wp-admin");
	  }

	  @Test
	  public void TestMethod() {
		  // Find the username field of the login form and enter the username into that field.
		  // Find the password field of the login form and enter the password into that field.
		  // Find the login button and click it.

		  WebElement userID = driver.findElement(By.xpath("//*[@id=\"user_login\"]"));
		  userID.sendKeys("root");
		  WebElement password = driver.findElement(By.xpath("//*[@id=\"user_pass\"]"));
		  password.sendKeys("pa$$w0rd");
		  WebElement login = driver.findElement(By.xpath("//*[@id=\"wp-submit\"]"));
		  login.click();
		  //Verify that you have logged in.
		  String Title = driver.getTitle();
		  System.out.println("Page Title:"+Title);
		  //Assertion for page title
	      Assert.assertEquals("Dashboard ‹ Alchemy Jobs — WordPress", Title);
	  }

	  @AfterClass
	  public void afterClass() {
	  //Close
	  driver.quit();
	  }

}
