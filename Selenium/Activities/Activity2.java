package activities;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Activity2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//Set up GeckoDriver
		WebDriverManager.firefoxdriver().setup();
		//Initialize the Driver
		WebDriver driver = new FirefoxDriver();
		//Open Browser
		driver.get("https://v1.training-support.net/selenium/login-form");
		//Page Title
		String Title = driver.getTitle();
		System.out.println("Page Title is: "+ Title);
		//Username
		driver.findElement(By.id("username")).sendKeys("admin");
		//Password
		driver.findElement(By.id("password")).sendKeys("password");
		//Log-in Click
		driver.findElement(By.cssSelector(".ui button")).click();
		//Close
		driver.quit();

	}

}
