package CRMProject;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.support.Color;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class NavigationMenu 

{
	WebDriver driver;

	@BeforeMethod
	public void invokeBrowser()
	{
		driver = new FirefoxDriver();
		driver.get("https://alchemy.hguy.co/crm/ ");
	}
	
	@Test
	public void menuColors()
	{
		driver.findElement(By.id("user_name")).sendKeys("admin");
		driver.findElement(By.id("username_password")).sendKeys("pa$$w0rd");	
		driver.findElement(By.id("bigbutton")).click();
		WebElement navigationMenu = driver.findElement(By.xpath("//*[@id=\"ajaxHeader\"]/nav"));
		Color navigationColor = Color.fromString(navigationMenu.getCssValue("color"));
		System.out.println("Color as RGB: " + navigationColor.asRgb());
		System.out.println("Color as hexacode: " + navigationColor.asHex());

	}
	@Test
	public void menuCheck()
	{
		driver.findElement(By.id("user_name")).sendKeys("admin");
		driver.findElement(By.id("username_password")).sendKeys("pa$$w0rd");	
		driver.findElement(By.id("bigbutton")).click();
		WebElement ActivityTab = driver.findElement(By.id("grouptab_3"));
		System.out.println("Is Activity tab Enabled: "+ActivityTab.isEnabled());
		//ActivityTab.click();

	}
	
			
	@AfterMethod
	public void teardown()
	{
		driver.quit();
	}
	

}
