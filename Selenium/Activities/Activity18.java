package activities;

import java.time.Duration;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class Activity18 
{

	public static void main(String[] args)
	
	{
		WebDriver driver = new FirefoxDriver();
		WebDriverWait wait = new WebDriverWait(driver,Duration.ofSeconds(0));
		
		driver.get("https://training-support.net/webelements/alerts");
		System.out.println("Page title is: "+driver.getTitle());
		
		driver.findElement(By.xpath("//button[@id ='simple']")).click();
		
		//wait.until(ExpectedConditions.alertIsPresent());
		
			Alert simpleAlret = driver.switchTo().alert();
			String alertText = simpleAlret.getText();
			System.out.println(alertText);
			simpleAlret.accept();
	        System.out.println(driver.findElement(By.id("result")).getText());

			driver.quit();
		
		
		
		
	}
}
