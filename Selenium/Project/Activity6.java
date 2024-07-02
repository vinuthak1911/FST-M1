package project;

import org.testng.annotations.Test;

import io.github.bonigarcia.wdm.WebDriverManager;

import org.testng.annotations.BeforeClass;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.annotations.AfterClass;

public class Activity6 {
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
	  public void TestMethod() throws Exception{
		//Find the navigation bar.Select the menu item that says “Jobs” and click it.
		  WebElement menuItem = driver.findElement(By.linkText("Jobs"));
		  menuItem.click();
		//Search for a particular job and wait for listings to show.
		  WebElement search = driver.findElement(By.id("search_keywords"));
		  search.sendKeys("Banking");
		  WebElement searchSubmit = driver.findElement(By.xpath("//input[@type = 'submit']"));
		  searchSubmit.click();
		  WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(10));
		  wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//div[@class = 'company']")));
		  WebElement company = driver.findElement(By.xpath("//div[@class = 'company']"));  
		  company.click();
		//Click the apply button
		  driver.findElement(By.xpath("//input[@class = 'application_button button']")).click();
	    //print the email to the console.
		  WebElement email= driver.findElement(By.linkText("san@gmail.com"));
		  System.out.println("Email id is " + email.getText());
	  }


	  @AfterClass
	  public void afterClass() {
	  //Close
	  driver.quit();
	  }

}
