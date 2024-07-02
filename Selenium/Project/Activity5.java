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

public class Activity5 {
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
		//Find the navigation bar.Select the menu item that says “Jobs” and click it.
		  WebElement menuItem = driver.findElement(By.linkText("Jobs"));
		  menuItem.click();
		 //Read the page title and verify that you are on the correct page
		  String Title = driver.getTitle();
		  System.out.println("Page Title is: "+ Title);
		//Assertion for page title
	      Assert.assertEquals("Jobs – Alchemy Jobs", Title);
	      
	  }

	  @AfterClass
	  public void afterClass() {
	  //Close
	  driver.quit();
	  }
}
