package activities;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Activity12 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//Set up GeckoDriver
		WebDriverManager.firefoxdriver().setup();
		//Initialize the Driver
		WebDriver driver = new FirefoxDriver();
		//Open Browser
		driver.get("https://v1.training-support.net/selenium/dynamic-controls");
		//Page Title
		String Title = driver.getTitle();
		System.out.println("Page Title is: "+ Title);
		//Find the text field.
		WebElement textField = driver.findElement(By.id("input-text"));
		//Check if the text field is enabled and print it.
		System.out.println("Input field is enabled: " + textField.isEnabled());
		//Click the "Enable Input" button to enable the input field.
		WebElement enableInput = driver.findElement(By.id("toggleInput"));
		enableInput.click();
		//Check if the text field is enabled again and print it.
		System.out.println("Input field is enabled: " + textField.isEnabled());
		//Close Browser
		driver.quit();
	}

}
