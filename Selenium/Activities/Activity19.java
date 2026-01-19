package activities;

import java.time.Duration;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.support.ui.WebDriverWait;

public class Activity19

{
public static void main(String[] args)
	
	{
		WebDriver driver = new FirefoxDriver();
		//WebDriverWait wait = new WebDriverWait(driver,Duration.ofSeconds(0));
		
		driver.get("https://training-support.net/webelements/alerts");
		System.out.println("Page title is: "+driver.getTitle());
		
		driver.findElement(By.xpath("//button[@id ='confirmation']")).click();
		
		//wait.until(ExpectedConditions.alertIsPresent());
		
			Alert confirmAlret = driver.switchTo().alert();
			String alertText = confirmAlret.getText();
			System.out.println(alertText);
			confirmAlret.accept();
			
			
			
	        System.out.println(driver.findElement(By.id("result")).getText());
	        
	        driver.findElement(By.xpath("//button[@id ='confirmation']")).click();
			
			//wait.until(ExpectedConditions.alertIsPresent());
			
				Alert cancelAlret = driver.switchTo().alert();
				String alertText1 = cancelAlret.getText();
				System.out.println(alertText1);
				confirmAlret.dismiss();
		        System.out.println(driver.findElement(By.id("result")).getText());

			driver.quit();
	}
		
}
