package activities;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Activity3a {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		// TODO Auto-generated method stub
		//Set up GeckoDriver
		WebDriverManager.firefoxdriver().setup();
		//Initialize the Driver
		WebDriver driver = new FirefoxDriver();
		//Open Browser
		driver.get("https://v1.training-support.net/");
		//Page Title
		String Title = driver.getTitle();
		System.out.println("Page Title is: "+ Title);
		//Find the "About Us" button on the page using it's id. Click on that button.
		driver.findElement(By.xpath("//*[@id=\"about-link\"]")).click();
		//Get the title of the new page and print it to the console.
		String Title1 = driver.getTitle();
		System.out.println("Page Title is: "+ Title1);
		//Close
		driver.quit();

	}

}
