package activities;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class Activity20 


{
	
public static void main(String[] args) throws InterruptedException
	
	{
		WebDriver driver = new FirefoxDriver();
		//WebDriverWait wait = new WebDriverWait(driver,Duration.ofSeconds(0));
		
		driver.get("https://training-support.net/webelements/alerts");
		System.out.println("Page title is: "+driver.getTitle());
		
		driver.findElement(By.xpath("//button[@id ='prompt']")).click();
		
		//wait.until(ExpectedConditions.alertIsPresent());
		
			Alert promtAlret = driver.switchTo().alert();
			String alertText = promtAlret.getText();
			System.out.println(alertText);
			promtAlret.sendKeys("Awesome");
			Thread.sleep(5000);
			promtAlret.accept();
			
					
	        System.out.println(driver.findElement(By.id("result")).getText());
	        

			driver.quit();
	}

}
