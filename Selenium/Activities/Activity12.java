package activities;

import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class Activity12 
{
	public static void main(String[] args)

	{
		WebDriver driver = new FirefoxDriver();
		WebDriverWait wait = new WebDriverWait(driver,Duration.ofSeconds(10));
		driver.get("https://training-support.net/webelements/dynamic-content");
		System.out.println("Tittle is : "+driver.getTitle());
		
		WebElement clickButton = driver.findElement(By.xpath("//button[@id='genButton']"));
		clickButton.click();
		
		if(wait.until(ExpectedConditions.textToBePresentInElementLocated(By.id("word"), "release")))
		{
			
			System.out.println("Word Found :" +driver.findElement(By.id("word")).getText());
		}
		
		driver.quit();
	}
}
