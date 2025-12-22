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

public class TraversingTableMenu 

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
	public void accountsTable()
		{
		
		//Actions builder = new Actions(driver);
		WebDriverWait wait = new WebDriverWait(driver,Duration.ofSeconds(2000));
		driver.findElement(By.id("user_name")).sendKeys("admin");
		driver.findElement(By.id("username_password")).sendKeys("pa$$w0rd");	
		driver.findElement(By.id("bigbutton")).click();
		wait.until(ExpectedConditions.elementToBeClickable(By.id("grouptab_0"))).click();
    	wait.until(ExpectedConditions.elementToBeClickable(By.xpath("//a[text()='Accounts']"))).click();
    	wait.until(ExpectedConditions.visibilityOfElementLocated(By.cssSelector("table.list.view")));
    	List<WebElement> oddRows = driver.findElements(By.cssSelector("tr.oddListRowS1"));
    	int count = Math.min(5, oddRows.size());
    	for (int i = 0; i < count; i++) {
            // First column contains Account Name
            String accountName = oddRows.get(i)
                    .findElement(By.xpath("td[3]"))
                    .getText();
            System.out.println((i + 1) + ". " + accountName);
    	}

	}
	@AfterMethod
	public void teardown()
	{
		driver.quit();
	}
	
	
	
}
