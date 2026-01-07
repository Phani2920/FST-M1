package Activities;
import io.appium.java_client.AppiumBy;
import io.appium.java_client.android.AndroidDriver;
import io.appium.java_client.android.options.UiAutomator2Options;

import org.openqa.selenium.Dimension;
import org.openqa.selenium.Point;

import org.testng.Assert;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;


import java.net.MalformedURLException;
import java.net.URI;
import java.net.URISyntaxException;
import java.net.URL;

public class Activity6 

{
	// Driver Declaration
    AndroidDriver driver;

    // Set up method
    @BeforeClass
    public void setUp() throws MalformedURLException, URISyntaxException {
    	
        // Desired Capabilities
        UiAutomator2Options options = new UiAutomator2Options();
        options.setPlatformName("android");
        options.setAutomationName("UiAutomator2");
        options.setAppPackage("com.android.chrome");
        options.setAppActivity("com.google.android.apps.chrome.Main");
        options.noReset();

        // Server Address
        URL serverURL = new URI("http://localhost:4723").toURL();

        // Driver Initialization
        driver = new AndroidDriver(serverURL, options);
    	
        // Open the page in Chrome
        driver.get("https://training-support.net/webelements/sliders");
    }

    // Test method
    @Test
    public void volume25Test() 
    {
    	Dimension dims = driver.manage().window().getSize();
    	System.out.println(dims.getWidth()+" , "+dims.getHeight());
    	
    //Calculating the start and end points
    	int startX = (int)(0.50*dims.getWidth());
    	int startY = (int)(0.72*dims.getHeight());
    	Point start = new Point(startX,startY);
    	
    	int endX = (int)(0.335*dims.getWidth());
    	int endY = (int)(0.72*dims.getHeight());
    	Point end = new Point(endX,endY);
    	
    	//Perform swipe
    	ActionsBase.doSwipe(driver,start,end,1500);
    	
    	String volumeText =driver.findElement(AppiumBy.xpath("//android.widget.TextView[contains(@text,'%')]")).getText();
    	
    	Assert.assertEquals(volumeText,"25%");
    	
    	
    }
    @Test
    public void volume75Test() 
    {
       	Dimension dims = driver.manage().window().getSize();
    	System.out.println(dims.getWidth()+" , "+dims.getHeight());
    	
    //Calculating the start and end points
    	int startX = (int)(0.50*dims.getWidth());
    	int startY = (int)(0.72*dims.getHeight());
    	Point start = new Point(startX,startY);
    	
    	int endX = (int)(0.67*dims.getWidth());
    	int endY = (int)(0.72*dims.getHeight());
    	Point end = new Point(endX,endY);
    	
    	//Perform swipe
    	ActionsBase.doSwipe(driver,start,end,1500);
    	
    	String volumeText1 =driver.findElement(AppiumBy.xpath("//android.widget.TextView[contains(@text,'%')]")).getText();
    	Assert.assertEquals(volumeText1,"75%");
    	

    }


    // Tear down method
    @AfterClass
    public void tearDown() {
        // Close the app
        driver.quit();
    }
}


