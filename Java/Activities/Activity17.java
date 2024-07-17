package activities;


import java.util.List;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.support.ui.Select;
import io.github.bonigarcia.wdm.WebDriverManager;

public class Activity17 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
				//Set up GeckoDriver
				WebDriverManager.firefoxdriver().setup();
				//Initialize the Driver and Waits
				WebDriver driver = new FirefoxDriver();
				// Create the Wait object
		        
				//Open Browser
				driver.get("https://v1.training-support.net/selenium/selects");
				//Page Title
				String Title = driver.getTitle();
				System.out.println("Page Title is: "+ Title);
				//Find Dropdown
				WebElement dropdown = driver.findElement(By.id("single-select"));
				//Initialize Select object
				Select singleSelectList = new Select(dropdown);
				//Select the second option using the visible text.
				singleSelectList.selectByVisibleText("Option 2");
				// Print the selected option
		        System.out.println("Second option is: " + singleSelectList.getFirstSelectedOption().getText());
				//Select the third option using the index.
		        singleSelectList.selectByIndex(2);
		        // Print the selected option
		        System.out.println("Third option is: " + singleSelectList.getFirstSelectedOption().getText());
				//Select the fourth option using the value.
		        singleSelectList.selectByValue("4");
		        // Print the selected option
		        System.out.println("Fourth option is: " + singleSelectList.getFirstSelectedOption().getText());
				//Get all the options and print them to the console.
		        List<WebElement> allOptions = singleSelectList.getOptions();
		        System.out.println("Options in the dropdown: ");
		        for(WebElement option : allOptions) {
		            System.out.println(option.getText());
		        }
		        //Close Browser
				driver.quit();

	}

}
