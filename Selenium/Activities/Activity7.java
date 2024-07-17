package activities;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.interactions.Actions;
import io.github.bonigarcia.wdm.WebDriverManager;

public class Activity7 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//Set up GeckoDriver
		WebDriverManager.firefoxdriver().setup();
		//Initialize the Driver
		WebDriver driver = new FirefoxDriver();
		//Actions Object
		Actions builder = new Actions(driver);
		//Open Browser
		driver.get("https://v1.training-support.net/selenium/drag-drop");
		//Page Title
		String Title = driver.getTitle();
		System.out.println("Page Title is: "+ Title);
		//Find the football
		WebElement football = driver.findElement(By.id("draggable"));
		//Dropzone1
		WebElement dz1football = driver.findElement(By.id("droppable"));
		//Dropzone2
		WebElement dz2football = driver.findElement(By.id("dropzone2"));
		//validation
		//to dropzone1
		builder.clickAndHold(football).moveToElement(dz1football).pause(5000).release().build().perform();
		//validation
		//to dropzone2
		builder.clickAndHold(dz1football).moveToElement(dz2football).pause(5000).release().build().perform();
		
		//Close Browser
		driver.quit();

	}

}
