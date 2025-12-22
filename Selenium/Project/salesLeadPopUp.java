package CRMProject;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
//import org.openqa.selenium.interactions.Actions;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class salesLeadPopUp
{
	WebDriver driver;

	@BeforeMethod
	public void invokeBrowser()
	{
		driver = new FirefoxDriver();
		driver.get("https://alchemy.hguy.co/crm/ ");
		driver.manage().window().maximize();
	}
	

	
	@Test
	public void salesLead()
		{
		
		//Actions builder = new Actions(driver);
		WebDriverWait wait = new WebDriverWait(driver,Duration.ofSeconds(2000));
		driver.findElement(By.id("user_name")).sendKeys("admin");
		driver.findElement(By.id("username_password")).sendKeys("pa$$w0rd");	
		driver.findElement(By.id("bigbutton")).click();
		driver.findElement(By.id("grouptab_0")).click();
		driver.findElement(By.id("moduleTab_9_Leads")).click();
		//WebElement LeadsButton  = driver.findElement(By.id("moduleTab_9_Leads"));
		//builder.click(salesButton).pause(1000).moveToElement(LeadsButton).pause(1000).click();	
		
		//wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//*[@id=\"content\"]/div[1]/h2")));
		 wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//*[@id=\"MassUpdate\"]/div[3]/table")));
		// driver.findElement(By.xpath("/html/body/div[4]/div/div[3]/form[2]/div[3]/table/tbody/tr[1]/td[10]/span/span")).click();
		// wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//span[contains(@class,'suitepicon-action-info')])[1]")));
		 
		 WebElement additionalInfoIcon = wait.until(ExpectedConditions
					.visibilityOfElementLocated(By.xpath("(//span[contains(@class,'suitepicon-action-info')])[1]")));
	        additionalInfoIcon.click();
	        WebElement phone = wait
					.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//span[@class='phone']")));
			System.out.println("Phone Number : " + phone.getText());
		
	}
	@AfterMethod
	public void teardown()
	{
		driver.quit();
	}
	
	
	
	
			
	

}
