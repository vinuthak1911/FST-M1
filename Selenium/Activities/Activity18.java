package activities;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.support.ui.Select;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Activity18 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//Set up GeckoDriver
        WebDriverManager.firefoxdriver().setup();
        //Initialize the Driver
        WebDriver driver = new FirefoxDriver();

        // Open Browser
        driver.get("https://v1.training-support.net/selenium/selects");
        //Page Title
      	String Title = driver.getTitle();
      	System.out.println("Page Title is: "+ Title);
        // Find the dropdown
        WebElement dropDown = driver.findElement(By.id("multi-select"));
        // Pass the WebElement to the Select object
        Select multiSelect = new Select(dropDown);

        // Select "Javascript" using visible text
        multiSelect.selectByVisibleText("Javascript");
        // Select 4th, 5th, and 6th index options
        for(int i = 4; i<=6 ; i++) {
            multiSelect.selectByIndex(i);
        }
        // Select "NodeJS" using value attribute
        multiSelect.selectByValue("node");
        // Print the selected options
        List<WebElement> selectedOptions = multiSelect.getAllSelectedOptions();
        System.out.println("Selected options are: ");
        for(WebElement option : selectedOptions) {
            System.out.println(option.getText());
        }

        // Deselect 5th index option
        multiSelect.deselectByIndex(5);
        // Print the selected options
        selectedOptions = multiSelect.getAllSelectedOptions();
        System.out.println("Selected options after deselecting are: ");
        for(WebElement option : selectedOptions) {
            System.out.println(option.getText());
        }

        // Close browser
        driver.quit();

	}

}
