package activities;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Activity4 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//Set up GeckoDriver
		WebDriverManager.firefoxdriver().setup();
		//Initialize the Driver
		WebDriver driver = new FirefoxDriver();
		//Open Browser
		driver.get("https://v1.training-support.net/selenium/target-practice");
		//Page Title
		String Title = driver.getTitle();
		System.out.println("Page Title is: "+ Title);
		//Find the 3rd header on the page and print it's text to the console.
		String thirdHeader = driver.findElement(By.xpath("//h3[@id='third-header']")).getText();
        System.out.println("Third Header Text is: " + thirdHeader);
		//Find the 5th header on the page and print it's color.
        String fifthHeader = driver.findElement(By.xpath("//h5[text()='Fifth header']")).getCssValue("color");
        System.out.println("Fifth Header colour is: " + fifthHeader);
        //Find the violet button and print all it's classes.
        String violetButton = driver.findElement(By.cssSelector(".violet")).getAttribute("class");
        System.out.println("Violet Button class details: " + violetButton);
        //Find the grey button and print it's text.
        String greyButton = driver.findElement(By.cssSelector(".grey")).getText();
        System.out.println("Grey Button Text is: " + greyButton);
        //Close Browser
        driver.quit();
	}

}
