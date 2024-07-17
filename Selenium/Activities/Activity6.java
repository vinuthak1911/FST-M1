package activities;

import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.interactions.Actions;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Activity6 {

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
		//Press the key of first letter of your name in caps
		builder.sendKeys("V").build().perform();
		//Press CTRL+a and the CTRL+c to copy all the text on the page.
		//(Paste the text in a text editor to verify results.)
		 builder.keyDown(Keys.CONTROL).sendKeys("a").sendKeys("c").keyUp(Keys.CONTROL).build().perform();
		//Close Browser
		driver.quit();

	}

}
