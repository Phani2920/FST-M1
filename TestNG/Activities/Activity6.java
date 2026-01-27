package Activities;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.annotations.Test;
import org.testng.annotations.BeforeClass;
import org.testng.Assert;
import org.testng.annotations.AfterClass;
import org.testng.annotations.Parameters;

public class Activity6 
{
	private WebDriver driver;
	WebDriverWait wait;
	
	@BeforeClass
	public void setUp()
	{
		driver = new FirefoxDriver();
        wait = new WebDriverWait(driver, Duration.ofSeconds(10));
		driver.get("https://training-support.net/webelements/login-form");
		
	}
	
	@Test
	@Parameters({"username","password","message"})
	public void loginTest(String username, String password, String message)
	{
		
		WebElement usernameField = driver.findElement(By.id("username"));
        WebElement passwordField = driver.findElement(By.id("password"));
 
        // Enter credentials
        usernameField.sendKeys(username);
        passwordField.sendKeys(password);
        
        driver.findElement(By.xpath("//button[text()='Submit']")).click();
        
        // Wait for the success page to load
        wait.until(ExpectedConditions.titleContains("Success"));
 
        // Assert login message
        String loginMessage = driver.findElement(By.cssSelector("h2.text-center")).getText();
        Assert.assertEquals(message, loginMessage);
	}
	
	
	
	@AfterClass
	public void tearDown()
	{
		driver.close();
	}
	
	

}
