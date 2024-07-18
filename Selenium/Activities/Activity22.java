package activities;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Activity22 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//Set up GeckoDriver
			WebDriverManager.firefoxdriver().setup();
		//Initialize the Driver and Waits
			WebDriver driver = new FirefoxDriver();
	        WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(10));
	    // Create the Actions object
	        Actions builder = new Actions(driver);
		//Open Browser
			driver.get("https://v1.training-support.net/selenium/popups");
		//Page Title
			String Title = driver.getTitle();
			System.out.println("Page Title is: "+ Title);
		//Find the Sign in button and hover over it. Print the tooltip message.
		//Click the button to open the Sign in form.
			// Find the sign-in button
	        WebElement button = driver.findElement(By.className("orange"));
	        // Hover over the button
	        builder.moveToElement(button).build().perform();
	        // Print the tooltip message
	        String tooltipMessage = button.getAttribute("data-tooltip");
	        System.out.println("Tooltip message is: " + tooltipMessage);

	        // Click the button and wait for the modal to appear
	        button.click();
	        wait.until(ExpectedConditions.visibilityOfElementLocated(By.id("username")));

	        // Find the input fields and enter the credentials
	        WebElement username = driver.findElement(By.id("username"));
	        username.sendKeys("admin");
	        WebElement password = driver.findElement(By.id("password"));
	        password.sendKeys("password");
	       // Click login button
	        WebElement login = driver.findElement(By.xpath("//button[text()='Log in']"));
	        login.click();

	        // Print message
	        String message = driver.findElement(By.id("action-confirmation")).getText();
	        System.out.println("Login message: " + message);

	        // Close the browser
	        driver.quit();
	}

}
