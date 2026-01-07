package Activities;

import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.Assert;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

import io.appium.java_client.AppiumBy;
import io.appium.java_client.android.AndroidDriver;
import io.appium.java_client.android.options.UiAutomator2Options;

import java.net.MalformedURLException;
import java.net.URI;
import java.net.URISyntaxException;
import java.net.URL;
import java.time.Duration;

public class Activity4 
{
	// Driver Declaration
    AndroidDriver driver;
    WebDriverWait wait;

    // Set up method
    @BeforeClass
    public void setUp() throws MalformedURLException, URISyntaxException {
    	
        // Desired Capabilities
        UiAutomator2Options options = new UiAutomator2Options();
        options.setPlatformName("android");
        options.setAutomationName("UiAutomator2");
        options.setAppPackage("com.google.android.contacts");
        options.setAppActivity("com.android.contacts.activities.PeopleActivity");
        options.noReset();

        // Server Address
        URL serverURL = new URI("http://localhost:4723").toURL();

        // Driver Initialization
        driver = new AndroidDriver(serverURL, options);
        wait = new WebDriverWait(driver, Duration.ofSeconds(10));
        
    }
    
 // Test method
    @Test
    public void contactsTest() {
        // Find and click the add button
        driver.findElement(AppiumBy.xpath("//android.widget.TextView[@content-desc=\"Predicted app: Contacts\"]")).click();

        driver.findElement(AppiumBy.accessibilityId("Create contact")).click();
 
        // Wait for elements to load
        wait.until(ExpectedConditions.elementToBeClickable(
                AppiumBy.xpath("//android.widget.EditText[@text='First name']")
        ));
 
        // Enter the details
        driver.findElement(AppiumBy.xpath(
                "//android.widget.EditText[@text='First name']"
        )).sendKeys("Aaditya");
        driver.findElement(AppiumBy.xpath(
                "//android.widget.EditText[@text='Last name']"
        )).sendKeys("Sharma");
        driver.findElement(AppiumBy.xpath(
                "//android.widget.EditText[@text='+1']/android.view.View[3]"
        )).clear();
        driver.findElement(AppiumBy.xpath(
                "//android.widget.EditText[@text=\"+1\"]")).sendKeys("999148002");
        // Click Save
        driver.findElement(AppiumBy.xpath("//android.widget.TextView[@text=\"Save\"]")).click();
 
        // Wait for contact to save
        wait.until(ExpectedConditions.elementToBeClickable(AppiumBy.id("large_title")));
 
        // Assertion
        String contactName = driver.findElement(AppiumBy.id("large_title")).getText();
        Assert.assertEquals(contactName, "Aaditya Sharma");
    }
    // Tear down method
    @AfterClass
    public void tearDown() {
        // Close the app
        driver.quit();
    }
	
}
