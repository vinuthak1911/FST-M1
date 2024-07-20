package activities;

import org.testng.annotations.Test;

import io.github.bonigarcia.wdm.WebDriverManager;

import org.testng.annotations.BeforeClass;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.Assert;
import org.testng.annotations.AfterClass;

public class Activity5 {
	WebDriver driver;
	 
	  @BeforeClass
	  public void setUp() {
		//Set up GeckoDriver
			WebDriverManager.firefoxdriver().setup();
			//Initialize the Driver
			driver = new FirefoxDriver();
			//Open Browser
			driver.get("https://v1.training-support.net/selenium/target-practice");  
	  }
	  
	  @Test (groups = {"HeaderTests", "ButtonTests"})
	    public void pageTitleVal() {
	        String title = driver.getTitle();
	        System.out.println("Title is: " + title);
	        Assert.assertEquals(title, "Target Practice");
	    }
	    
	    @Test (dependsOnMethods = {"pageTitleVal"}, groups = {"HeaderTests"})
	    public void HeaderTest1() {
	        WebElement header3 = driver.findElement(By.xpath("//h3[@id='third-header']"));
	        Assert.assertEquals(header3.getText(), "Third header");
	    }
	    
	    @Test (dependsOnMethods = {"pageTitleVal"}, groups = {"HeaderTests"})
	    public void HeaderTest2() {
	        WebElement header5 = driver.findElement(By.xpath("//h5[text()='Fifth header']"));
	        Assert.assertEquals(header5.getCssValue("color"), "rgb(33, 186, 69)");
	    }
	    
	    @Test (dependsOnMethods = {"pageTitleVal"}, groups = {"ButtonTests"})
	    public void ButtonTest1() {
	        WebElement buttonOlive = driver.findElement(By.cssSelector("button.olive"));
	        Assert.assertEquals(buttonOlive.getText(), "Olive");
	    }
	    
	    @Test (dependsOnMethods = {"pageTitleVal"}, groups = {"ButtonTests"})
	    public void ButtonTest2() {
	        WebElement buttonBrown = driver.findElement(By.cssSelector("button.brown"));
	        Assert.assertEquals(buttonBrown.getCssValue("color"), "rgb(255, 255, 255)");
	    }
	 
	  

	  @AfterClass
	  public void tearDown() {
		  driver.quit();
	  }

}
