package CRMProject;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.Assert;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

public class LoginCRM {
	WebDriver driver;

	@BeforeClass
	public void invokeBrowser()
	{
		driver = new FirefoxDriver();
		driver.get("https://alchemy.hguy.co/crm/ ");
	}
	
	@Test
	public void verifyLogin()
	{
		driver.findElement(By.id("user_name")).sendKeys("admin");
		driver.findElement(By.id("username_password")).sendKeys("pa$$w0rd");	
		driver.findElement(By.id("bigbutton")).click();
		WebElement dashboard = driver.findElement(By.id("tab0"));
		String dashText = dashboard.getAttribute("text").trim();
		System.out.println(dashText);
		Assert.assertEquals(dashText, "SUITECRM DASHBOARD");
	}
			
	@AfterClass
	public void teardown()
	{
		driver.quit();
	}
	
}
