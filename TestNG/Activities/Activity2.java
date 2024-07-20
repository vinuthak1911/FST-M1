package activities;

import org.testng.annotations.Test;

import io.github.bonigarcia.wdm.WebDriverManager;

import org.testng.annotations.BeforeClass;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.Assert;
import org.testng.SkipException;
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
			driver.get(" https://v1.training-support.net/selenium/target-practice");
  }
  
  @Test
  public void TestMethod1() {
	  //In the first @Test method, use getTitle() to get and assert the title of the page
	  String Title = driver.getTitle();
	  System.out.println("Page Title is: " + Title);
	  //Assertion for page title
      Assert.assertEquals("Target Practice", Title);
	  }
  
  
  @Test
  public void TestMethod2() {
	//This test case will Fail
      WebElement blackButton = driver.findElement(By.cssSelector("button.black"));
      Assert.assertTrue(blackButton.isDisplayed());
      Assert.assertEquals(blackButton.getText(), "black");
  }
  
  
  @Test (enabled = false)
  public void TestMethod3() {
	  String Heading = driver.findElement(By.className("sub")).getText();
      Assert.assertTrue (Heading.contains("Practice"));
  }
  
  
  @Test
  public void TestMethod4() {
	  throw new SkipException("Skipping test case");
  
  }

  @AfterClass
  public void afterClass() {
	  driver.quit();

}
}