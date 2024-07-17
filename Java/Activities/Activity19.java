package activities;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Activity19 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//Set up GeckoDriver
		WebDriverManager.firefoxdriver().setup();
		//Initialize the Driver 
		WebDriver driver = new FirefoxDriver();
		//Open Browser
		driver.get("https://v1.training-support.net/selenium/javascript-alerts");
		//Page Title
		String Title = driver.getTitle();
		System.out.println("Page Title is: "+ Title);
		//Find the button to open a CONFIRM alert and click it.
		WebElement Confirm = driver.findElement(By.id("confirm"));
		Confirm.click();
		//Switch the focus from the main window to the Alert box and get the text in it and print it.
		Alert alertBox = driver.switchTo().alert();
		System.out.println(alertBox.getText());
		//Close the alert once with Ok
		alertBox.accept();
		//Find the button to open a CONFIRM alert and click it.
		WebElement Confirm1 = driver.findElement(By.id("confirm"));
		Confirm1.click();
		//Switch the focus from the main window to the Alert box and get the text in it and print it.
		Alert alertBox1 = driver.switchTo().alert();
		System.out.println(alertBox1.getText());
		//Close the alert once with Cancel
		alertBox1.dismiss();
		//Close Browser
		driver.quit();

	}

}
