package activities;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Activity3b {

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
				driver.findElement(By.xpath("//*[@id=\"username\"]")).sendKeys("admin");
				//Password
				driver.findElement(By.xpath("//*[@id=\"password\"]")).sendKeys("password");
				//Log-in Click
				driver.findElement(By.xpath("/html/body/div[2]/div/div[2]/div[2]/div/div/button")).click();
				//Confirmation message
				//Page Title
				String message = driver.findElement(By.xpath("//div[@id='action-confirmation']")).getText();
		        System.out.println("Login message: " + message);
				System.out.println("User Logged in successfully!!");
				//Close
				driver.quit();

			}

	}


