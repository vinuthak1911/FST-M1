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

public class Activity2 {
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
	//heading
	  WebElement header = driver.findElement(By.xpath("/html/body/div/div/div/div/main/article/header/h1"));
	//Assertion for page header
      Assert.assertEquals("Welcome to Alchemy Jobs", header.getText());
  }

  @AfterClass
  public void afterClass() {
	  //Close
	  driver.quit();
  }

}
