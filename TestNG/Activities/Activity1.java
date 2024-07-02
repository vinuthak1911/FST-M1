package activities;

import org.testng.annotations.Test;

import io.github.bonigarcia.wdm.WebDriverManager;

import org.testng.annotations.BeforeClass;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
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
		driver.get("https://v1.training-support.net/");
  }
  
  @Test(priority=1)
  public void HomePageTest() {
	  String Title = driver.getTitle();
	  System.out.println("Page Title:"+Title);
	  //Assertion for page title
      Assert.assertEquals("Training Support", Title);
	  
  }
  @Test(priority=2)
  public void AboutTestPage() {
	  WebElement button = driver.findElement(By.id("about-link"));
	  button.click();
	  String Title1 = driver.getTitle();
	  System.out.println("Page Title:"+Title1);
	  //Assertion for page title
      Assert.assertEquals("About Training Support", Title1);
  }
  @AfterClass
  public void afterClass() {
	  //Close Browser
	  driver.quit();
  }

}
