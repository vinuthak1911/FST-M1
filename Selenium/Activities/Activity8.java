package activities;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Activity8 {

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
		//Find the checkbox toggle button and click it.
		driver.findElement(By.id("toggleCheckbox")).click();
		//Wait till the checkbox disappears.
		WebElement dynamicCheckBox = driver.findElement(By.id("dynamicCheckbox"));
        wait.until(ExpectedConditions.invisibilityOf(dynamicCheckBox));
        System.out.println("Checkbox is displayed: " + dynamicCheckBox.isDisplayed());
		//Click the button again. Wait till it appears and check the checkbox.
        driver.findElement(By.id("toggleCheckbox")).click();
        wait.until(ExpectedConditions.visibilityOf(dynamicCheckBox));
        System.out.println("Checkbox is displayed: " + dynamicCheckBox.isDisplayed());
        driver.findElement(By.cssSelector("input.willDisappear")).click();
        System.out.println("Checkbox checked");
		//Close Browser
		driver.quit();

	}

}
