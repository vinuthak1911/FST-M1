package activities;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Activity15 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//Set up GeckoDriver
		WebDriverManager.firefoxdriver().setup();
		//Initialize the Driver
		WebDriver driver = new FirefoxDriver();
		//Open Browser
		driver.get("https://v1.training-support.net/selenium/dynamic-attributes");
		//Page Title
		String Title = driver.getTitle();
		System.out.println("Page Title is: "+ Title);
		//Find the username and password input fields. Type in the credentials:
		WebElement userName = driver.findElement(By.xpath("//input[starts-with(@class, 'username-')]"));
		userName.sendKeys("admin");
        WebElement password = driver.findElement(By.xpath("//input[starts-with(@class, 'password-')]"));
        password.sendKeys("password");
		//Wait for login message to appear and print the login message to the console.
        WebElement login = driver.findElement(By.xpath("//button[@type='submit']"));
        login.click();
        String message = driver.findElement(By.id("action-confirmation")).getText();
        System.out.println("Login message is: " + message);
		//Close Browser
		driver.quit();
		}

}
