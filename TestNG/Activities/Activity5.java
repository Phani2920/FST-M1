package Activities;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.support.Color;
import org.testng.Assert;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

public class Activity5 

{
	private WebDriver driver;
	
	
	@BeforeClass(alwaysRun = true)
	public void setUp()
	{
		driver = new FirefoxDriver();
		driver.get("https://training-support.net/webelements/target-practice");
	}
	
	@Test(groups = { "HeaderTests", "ButtonTests" })
	public void tittleTest()
	{
		String pageTittle = driver.getTitle();
		Assert.assertEquals(pageTittle, "Selenium: Target Practice");
	}
	@Test(dependsOnMethods = { "tittleTest" }, groups = { "HeaderTests" })
	public void HeaderTest1()
	{
		String thirdHeader = driver.findElement(By.xpath("//h3[contains(@class,'orange')]")).getText();
		Assert.assertEquals(thirdHeader, "Heading #3");

	}
	@Test(dependsOnMethods = { "tittleTest" }, groups = { "HeaderTests" })
	public void HeaderTest2()
	{
		Color header5Color  = Color.fromString(driver.findElement(By.cssSelector("h5.text-purple-600")).getCssValue("color"));
		Assert.assertEquals(header5Color.asHex(), "#9333ea");

	}
	@Test(dependsOnMethods = { "tittleTest" }, groups = { "ButtonTests" })
	public void ButtonTest1()
	{
		String emeraldButton = driver.findElement(By.xpath("//button[contains(@class,'emerald')]")).getText();
		Assert.assertEquals(emeraldButton, "Emerald");

		
	}
	
	@Test(dependsOnMethods = { "tittleTest" }, groups = { "ButtonTests" })
	public void ButtonTest2()
	{
		Color button2Color= Color.fromString(driver.findElement(By.xpath("//button[contains(@class, 'purple')]")).getCssValue("color"));
		
				Assert.assertEquals(button2Color.asHex(), "#ffffff");

		
	}
	
	@AfterClass(alwaysRun = true)
	public void tearDown()
	{
		driver.close();
	}
	

}
