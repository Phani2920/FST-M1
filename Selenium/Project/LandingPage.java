package CRMProject;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.Assert;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class LandingPage 

{
	WebDriver driver;
	
	@BeforeMethod
	public void invokeBrowser()
	{
		driver = new FirefoxDriver();
		driver.get("https://alchemy.hguy.co/crm/ ");
	}
	
	@Test(priority = 0 )
		public void verifyTittleHomePage()
	{
		
		Assert.assertEquals(driver.getTitle(),"SuiteCRM");
		System.out.println("Title of the Page is "+driver.getTitle());
		
	}
	
	@Test(priority = 1 )
	public void fetchLogoUrl()
	
  {
		WebElement headlogo = driver.findElement(By.xpath("/html/body/div[1]/div[2]/div/form[1]/div[1]/img"));//*[@id="form"]/div[1]/img
						
		//System.out.println(headlogo);

		String imageurl = headlogo.getAttribute("src");
		
		System.out.println("imageurl is "+imageurl);
  }
	@Test(priority = 2 )
	public void copyrightText()
	{
		WebElement footer1 = driver.findElement(By.id("admin_options"));
		String footerText1 = footer1.getText();
		System.out.println("Fetch Text is "+footerText1);

	}
	@AfterMethod
	public void teardown()
	{
		driver.quit();
	}
	

}
