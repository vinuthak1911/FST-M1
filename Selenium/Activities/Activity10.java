package activities;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Activity10 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//Set up GeckoDriver
		WebDriverManager.firefoxdriver().setup();
	//Initialize the Driver and Waits
		WebDriver driver = new FirefoxDriver();
		 WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(10));

	//Open Browser
		driver.get("https://v1.training-support.net/selenium/dynamic-controls");
	//Page Title
		String Title = driver.getTitle();
		System.out.println("Page Title is: "+ Title);
		//Find the checkbox input element.
		WebElement checkBox = driver.findElement(By.cssSelector("input.willDisappear"));
		WebElement dynamicCheckBox = driver.findElement(By.id("dynamicCheckbox"));
		//Check if it is visible on the page.
		wait.until(ExpectedConditions.visibilityOfElementLocated(By.id("dynamicCheckbox")));
	    System.out.println("Checkbox is displayed: " + dynamicCheckBox.isDisplayed());
		//Click the "Remove Checkbox" button.
	    driver.findElement(By.id("toggleCheckbox")).click();
		//Check if it is visible again and print the result.
		WebElement dynamicCheckBox2 = driver.findElement(By.id("dynamicCheckbox"));
        wait.until(ExpectedConditions.invisibilityOf(dynamicCheckBox2));
        System.out.println("Checkbox is displayed: " + dynamicCheckBox2.isDisplayed());
        //Close Browser
        driver.quit();
	}

}
