package project;

import org.testng.annotations.Test;

import io.github.bonigarcia.wdm.WebDriverManager;

import org.testng.annotations.BeforeClass;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.AfterClass;

public class Activity9 {
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
		  //Locate the left hand menu and click the menu item that says “Job Listings”.
		  WebElement jobListings = driver.findElement(By.xpath("/html/body/div[1]/div[1]/div[2]/ul/li[7]/a/div[3]"));
		  jobListings.click();
		  //Locate the “Add New” button and click it.
		  WebElement addNew = driver.findElement(By.linkText("Add New"));
		  addNew.click();
		  //Fill in the necessary details
		  WebElement position = driver.findElement(By.id("post-title-0"));
		  position.sendKeys("Assistant1");
		  WebElement company = driver.findElement(By.id("_company_name"));
		  company.sendKeys("IBM");
		  //Publish
		  WebElement publish = driver.findElement(By.xpath("/html/body/div[1]/div[2]/div[2]/div[1]/div[4]/div[1]/div/div/div[1]/div/div[1]/div/div[2]/button[2]"));
		  publish.click();
		  WebElement publish1 = driver.findElement(By.cssSelector(".editor-post-publish-button"));
		  publish1.click();
		  //View Job
		  driver.get("https://alchemy.hguy.co/jobs/wp-admin");
		  //Locate the left hand menu and click the menu item that says “Job Listings”.
		  WebElement jobListings1 = driver.findElement(By.xpath("/html/body/div[1]/div[1]/div[2]/ul/li[7]/a/div[3]"));
		  jobListings1.click();
		  
	  }

	  @AfterClass
	  public void afterClass() {
	  //Close
	  driver.quit();
	  }

}
