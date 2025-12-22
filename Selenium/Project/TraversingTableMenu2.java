package CRMProject;
import java.time.Duration;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class TraversingTableMenu2

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
		public void leadsTable()
			{
			
			//Actions builder = new Actions(driver);
			WebDriverWait wait = new WebDriverWait(driver,Duration.ofSeconds(2000));
			driver.findElement(By.id("user_name")).sendKeys("admin");
			driver.findElement(By.id("username_password")).sendKeys("pa$$w0rd");	
			driver.findElement(By.id("bigbutton")).click();
	    	wait.until(ExpectedConditions.elementToBeClickable(By.id("grouptab_0"))).click();
	    	wait.until(ExpectedConditions.elementToBeClickable(By.xpath("//a[text()='Leads']"))).click();
	    	wait.until(ExpectedConditions.visibilityOfElementLocated(By.cssSelector("table.list.view")));
	    	List<WebElement> rows = driver.findElements(
	                By.xpath("//tr[contains(@class,'oddListRowS1') or contains(@class,'evenListRowS1')]"));
	    	int count = Math.min(10, rows.size());
	        for (int i = 0; i < count; i++) {
	            WebElement row = rows.get(i);
	            String leadName = row.findElement(By.xpath("td[3]")).getText();
	            String userName = row.findElement(By.xpath("td[8]")).getText();
	            System.out.println((i + 1) + ". " + leadName + " | " + userName);
	        }

		}
		@AfterMethod
		public void teardown()
		{
			driver.quit();
		}
		
		
		
	}


