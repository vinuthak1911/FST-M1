package activities;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Activity16 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//Set up GeckoDriver
		WebDriverManager.firefoxdriver().setup();
		//Initialize the Driver
		WebDriver driver = new FirefoxDriver();
		//Open Browser
		driver.get("https://v1.training-support.net/selenium/dynamic-attributes");
		//Page Title
		String Title = driver.getTitle();
		System.out.println("Page Title is: "+ Title);
		//Find the input fields of the Sign Up form.
		//Fill in the details in the fields with your own data.
		WebElement userName = driver.findElement(By.xpath("//input[contains(@class, '-username')]"));
		userName.sendKeys("admin");
        WebElement password = driver.findElement(By.xpath("//input[contains(@class, '-password')]"));
        password.sendKeys("password");
        WebElement ConfPassword = driver.findElement(By.cssSelector("div.field:nth-child(4) > input:nth-child(2)"));
        ConfPassword.sendKeys("password");
        WebElement email = driver.findElement(By.xpath("//input[starts-with(@class, 'email-')]"));
        email.sendKeys("abc1@xyz.com");
		//Wait for success message to appear and print it to the console
        WebElement signUp = driver.findElement(By.xpath("//button[contains(text(), 'Sign Up')]"));
        signUp.click();
        String loginMessage = driver.findElement(By.id("action-confirmation")).getText();
        System.out.println("SignUp message is: " + loginMessage);
		//Close Browser
		driver.quit();
				

	}

}
