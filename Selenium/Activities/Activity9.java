package activities;

import java.time.Duration;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Activity9 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//Set up GeckoDriver
			WebDriverManager.firefoxdriver().setup();
		//Initialize the Driver and Waits
			WebDriver driver = new FirefoxDriver();
			 WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(10));

		//Open Browser
			driver.get("https://v1.training-support.net/selenium/ajax");
		//Page Title
			String Title = driver.getTitle();
			System.out.println("Page Title is: "+ Title);
		//Find and click the "Change content" button on the page.
			driver.findElement(By.className("violet")).click();
		//Wait for the text to say "HELLO!". Print the message that appears on the page
			wait.until(ExpectedConditions.visibilityOfElementLocated(By.tagName("h1")));
			String headerText = driver.findElement(By.tagName("h1")).getText();
	        System.out.println(headerText);
	     //Wait for the text to change to contain "I'm late!". Print the new message on the page.
	        wait.until(ExpectedConditions.textToBePresentInElementLocated(By.tagName("h3"), "I'm late!"));
	        String lateText = driver.findElement(By.tagName("h3")).getText();
	        System.out.println(lateText);
		//close browser
			driver.quit();

	}

}
