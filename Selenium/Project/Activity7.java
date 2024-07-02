package project;

import org.testng.annotations.Test;

import io.github.bonigarcia.wdm.WebDriverManager;

import org.testng.annotations.BeforeClass;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.AfterClass;

public class Activity7 {
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
	  public void TestMethod(){
		//Locate the navigation menu and click the menu item that says “Post a Job”
		  WebElement menuItem = driver.findElement(By.linkText("Post a Job"));
		  menuItem.click();
		//Fill in the necessary details and click the button that says “Preview”.
		  WebElement email = driver.findElement(By.id("create_account_email"));
		  email.sendKeys("fstmod12@gmail.com");
		  WebElement jobTitle = driver.findElement(By.id("job_title"));
		  jobTitle.sendKeys("Assistant");
		  WebElement description = driver.findElement(By.id("job_description_ifr"));
		  driver.switchTo().frame(description);
		  description.sendKeys("hhhh");
		  driver.switchTo().defaultContent();
		  WebElement applicationEmail = driver.findElement(By.id("application"));
		  applicationEmail.sendKeys("ibm@example.com");
		  WebElement companyName = driver.findElement(By.id("company_name"));
		  companyName.sendKeys("IBM");
		  WebElement preview = driver.findElement(By.xpath("//input[@class = 'button']"));
		  preview.click();
		//Click on the button that says “Submit Listing”.
		  driver.findElement(By.xpath("//input[@id = 'job_preview_submit_button']")).click();
			//Find the navigation bar.Select the menu item that says “Jobs” and click it.
		  WebElement menuItem1 = driver.findElement(By.linkText("Jobs"));
		  menuItem1.click();
		//Search for a particular job and wait for listings to show.
		  WebElement search = driver.findElement(By.id("search_keywords"));
		  search.sendKeys("Assistant");
		  WebElement searchSubmit = driver.findElement(By.xpath("/html/body/div[2]/div/div/div/main/article/div/div/form/div[1]/div[4]/input"));
		  searchSubmit.click();
	  }

	  @AfterClass
	  public void afterClass() {
	  //Close
	  driver.quit();
	  }

}
