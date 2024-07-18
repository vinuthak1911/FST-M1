package activities;


import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
import io.github.bonigarcia.wdm.WebDriverManager;

public class Activity20 {

	public static void main(String[] args) throws InterruptedException {
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
		//Find the button to open a PROMPT alert and click it.
		WebElement Prompt = driver.findElement(By.id("prompt"));
		Prompt.click();
		//Switch the focus from the main window to the Alert box and get the text in it and print it.
		Alert alertBox = driver.switchTo().alert();
		System.out.println(alertBox.getText());
		Thread.sleep(1000);
		//Type "Awesome!" into the prompt.
		alertBox.sendKeys("Awesome!");
		Thread.sleep(1000);
		//Close the alert once with Ok
		alertBox.accept();
		//Close Browser
		driver.quit();

	}

}
