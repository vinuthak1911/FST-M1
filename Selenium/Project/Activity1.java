package project;

import org.testng.annotations.Test;

import io.github.bonigarcia.wdm.WebDriverManager;

import org.testng.annotations.BeforeClass;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.Assert;
import org.testng.annotations.AfterClass;

public class Activity1 {
	WebDriver driver;
  
  @BeforeClass
  public void beforeClass() {
	//Set up GeckoDriver
			WebDriverManager.firefoxdriver().setup();
			//Initialize the Driver
			driver = new FirefoxDriver();
			//Open Browser
			driver.get("https://alchemy.hguy.co/jobs/");
  }
  
  @Test
  public void TestMethod() {
	  //Title
	  String Title = driver.getTitle();
	  System.out.println("Page Title is: "+ Title);
	//Assertion for page title
      Assert.assertEquals("Alchemy Jobs – Job Board Application", Title);
  }

  @AfterClass
  public void afterClass() {
	  driver.quit();
  }

}
