package activities;


import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;


import io.github.bonigarcia.wdm.WebDriverManager;

public class Activity11 {

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
			//Find the checkbox input element.
				WebElement checkBox = driver.findElement(By.cssSelector("input.willDisappear"));
				checkBox.click();
			//Check if the checkbox is selected and print the result.
				System.out.println("Checkbox is selected: " + checkBox.isSelected());
			//Click the checkbox to select it.
				checkBox.click();
			//Check if the checkbox is selected again and print the result.
				System.out.println("Checkbox is selected: " + checkBox.isSelected());
			//Close browser
				driver.quit();
	}

}
