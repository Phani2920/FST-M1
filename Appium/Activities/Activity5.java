package Activities;

import java.net.MalformedURLException;
import java.net.URI;
import java.net.URISyntaxException;
import java.net.URL;
import java.time.Duration;

import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.Assert;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

import io.appium.java_client.AppiumBy;
import io.appium.java_client.android.AndroidDriver;
import io.appium.java_client.android.nativekey.AndroidKey;
import io.appium.java_client.android.nativekey.KeyEvent;
import io.appium.java_client.android.options.UiAutomator2Options;

public class Activity5 
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
        options.setAppPackage("com.google.android.apps.messaging");
        options.setAppActivity("ui.ConversationListActivity");
        options.noReset();

        // Server Address
        URL serverURL = new URI("http://localhost:4723").toURL();

        // Driver Initialization
        driver = new AndroidDriver(serverURL, options);
        wait = new WebDriverWait(driver, Duration.ofSeconds(20));
    	    
    }
    
 // Test method
    @Test
    public void smsTest() 
    {
    	driver.findElement(AppiumBy.accessibilityId("Messages")).click();
    	wait.until(ExpectedConditions.elementToBeClickable(
				AppiumBy.accessibilityId("Start chat")));
    	driver.findElement(AppiumBy.accessibilityId("Start chat")).click();
    	driver.findElement(AppiumBy.xpath("//android.widget.EditText[@resource-id=\"ContactSearchField\"]")).sendKeys("9491277791");
    	driver.pressKey(new KeyEvent(AndroidKey.ENTER));
		wait.until(ExpectedConditions.elementToBeClickable(AppiumBy.id("compose_message_text")));
	 	//driver.findElement(AppiumBy.xpath("//android.widget.TextView[@text=\"Send to (949) 127-7791\"]")).click();-not a good way
    	driver.findElement(AppiumBy.id("compose_message_text")).sendKeys("Hello from Appium");
    	driver.findElement(AppiumBy.accessibilityId("Send SMS")).click();
    	wait.until(ExpectedConditions.elementToBeClickable(AppiumBy.xpath(
    			"//android.widget.TextView[contains(@text, 'Hello from Appium')]")));
    	String messageText = driver.findElement(AppiumBy.xpath(
				"//android.widget.TextView[contains(@text, 'Hello from Appium')]")).getText();
    	//String messageText = driver.findElement(AppiumBy.id("message_text")).getText();- not working
        System.out.println(messageText);
    	Assert.assertEquals(messageText, "Hello from Appium");
    	
    }

}
