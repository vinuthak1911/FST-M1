package activities;

import java.net.MalformedURLException;
import java.net.URL;

import org.testng.Assert;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

import io.appium.java_client.AppiumBy;
import io.appium.java_client.android.AndroidDriver;
import io.appium.java_client.android.options.UiAutomator2Options;

public class Activity3 {
	// Driver Declaration
    AndroidDriver driver;

    // Set up method
    @BeforeClass
    public void setUp() throws MalformedURLException {
        // Desired Capabilities
        UiAutomator2Options options = new UiAutomator2Options();
        options.setPlatformName("android");
        options.setAutomationName("UiAutomator2");
        options.setAppPackage("com.google.android.calculator");
        options.setAppActivity("com.android.calculator2.Calculator");
        options.noReset();

        // Server Address
        URL serverURL = new URL("http://localhost:4723/");

        // Driver Initialization
        driver = new AndroidDriver(serverURL, options);
    }
 // Test method
    @Test (priority=1)
    public void AdditionTest() {
        // Perform the calculation
        driver.findElement(AppiumBy.id("digit_9")).click();
        driver.findElement(AppiumBy.accessibilityId("plus")).click();
        driver.findElement(AppiumBy.id("digit_5")).click();
        driver.findElement(AppiumBy.accessibilityId("equals")).click();

        // Find the result
        String addresult = driver.findElement(AppiumBy.id("result_final")).getText();
        System.out.println("Addition result is:" + addresult);
        // Assertion
        Assert.assertEquals(addresult, "14");
        driver.findElement(AppiumBy.id("clr")).click();
        System.out.println("Addition Test Passed!");
        
    }
    @Test (priority=2)
    public void SubtractionTest() {
        // Perform the calculation
        driver.findElement(AppiumBy.id("digit_1")).click();
        driver.findElement(AppiumBy.id("digit_0")).click();
        driver.findElement(AppiumBy.accessibilityId("minus")).click();
        driver.findElement(AppiumBy.id("digit_5")).click();
        driver.findElement(AppiumBy.accessibilityId("equals")).click();

        // Find the result
        String subresult = driver.findElement(AppiumBy.id("result_final")).getText();
        System.out.println("Subraction result is:" + subresult);
        // Assertion
        Assert.assertEquals(subresult, "5");
        driver.findElement(AppiumBy.id("clr")).click();
        System.out.println("Subraction Test Passed!");
    }
    
    @Test (priority=3)
    public void multiplyTest() {
        // Perform the calculation
        driver.findElement(AppiumBy.id("digit_5")).click();
        driver.findElement(AppiumBy.accessibilityId("multiply")).click();
        driver.findElement(AppiumBy.id("digit_1")).click();
        driver.findElement(AppiumBy.id("digit_0")).click();
        driver.findElement(AppiumBy.id("digit_0")).click();
        driver.findElement(AppiumBy.accessibilityId("equals")).click();

        // Find the result
        String mulresult = driver.findElement(AppiumBy.id("result_final")).getText();
        System.out.println("Multiplication result is:" + mulresult);
        // Assertion
        Assert.assertEquals(mulresult, "500");
        driver.findElement(AppiumBy.id("clr")).click();
        System.out.println("Multiplication Test Passed!");
    }
    
    @Test (priority=4)
    public void divTest() {
        // Perform the calculation
        driver.findElement(AppiumBy.id("digit_5")).click();
        driver.findElement(AppiumBy.id("digit_0")).click();
        driver.findElement(AppiumBy.accessibilityId("divide")).click();
        driver.findElement(AppiumBy.id("digit_2")).click();
        driver.findElement(AppiumBy.accessibilityId("equals")).click();

        // Find the result
        String divresult = driver.findElement(AppiumBy.id("result_final")).getText();
        System.out.println("Division result is:" + divresult);
        // Assertion
        Assert.assertEquals(divresult, "25");
        driver.findElement(AppiumBy.id("clr")).click();
        System.out.println("Division Test Passed!");
    }
    // Tear down method
    @AfterClass
    public void tearDown() {
        // Close the app
        driver.quit();
    }
}
