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

public class Activity4 {
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
		  WebElement header = driver.findElement(By.xpath("//h2[text()='Quia quis non']"));
		//Assertion for page header
	      Assert.assertEquals("Quia quis non", header.getText());
	      
	  }

	  @AfterClass
	  public void afterClass() {
	  //Close
	  driver.quit();
	  }

}
