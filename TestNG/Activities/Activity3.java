package Activities;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.Assert;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

public class Activity3 

{
	private WebDriver driver;
	private WebDriverWait wait;
	
	@BeforeClass
	public void setUp()
	{
		driver = new FirefoxDriver();
		driver.get("https://training-support.net/webelements/login-form/");
		wait = new WebDriverWait(driver,Duration.ofSeconds(10));
	}
	
	@Test
	public void loginTest()
	{
		WebElement userName = driver.findElement(By.xpath("//input[@id='username']"));
		WebElement password = driver.findElement(By.xpath("//input[@id='password']"));
		WebElement loginButton = driver.findElement(By.xpath("//button[text()='Submit']"));
		userName.sendKeys("admin");
		password.sendKeys("password");
		loginButton.click();
		
		wait.until(ExpectedConditions.titleContains("Success"));
		String loginMessage = driver.findElement(By.cssSelector("h2.text-center")).getText();
		Assert.assertEquals(loginMessage, "Welcome Back, Admin!");

		
	}
	
	
    @AfterClass
	public void tearDown()
	{
		driver.close();
		
	}
}
