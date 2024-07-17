package activities;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.interactions.Actions;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Activity5 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//Set up GeckoDriver
		WebDriverManager.firefoxdriver().setup();
		//Initialize the Driver
		WebDriver driver = new FirefoxDriver();
		// Create the Actions object
        Actions builder = new Actions(driver);
		//Open Browser
		driver.get("https://v1.training-support.net/selenium/input-events");
		//Page Title
		String Title = driver.getTitle();
		System.out.println("Page Title is: "+ Title);
		//Left click and print the value of the side in the front.
		builder.click().pause(1000).build().perform();
		String leftClickText = driver.findElement(By.className("active")).getText();
        System.out.println("Left Click Text is: " + leftClickText);
		//Double click to show a random side and print the number.
        builder.doubleClick().pause(3000).build().perform();
		String doubleClickText = driver.findElement(By.className("active")).getText();
        System.out.println("Double Click Text is: " + doubleClickText);        
		//Right click and print the value shown on the front of the cube.
        builder.contextClick().pause(1000).build().perform();
		String rightClickText = driver.findElement(By.className("active")).getText();
        System.out.println("Right Click Text is: " + rightClickText); 
		//Close Browser
		driver.quit();

	}

}
