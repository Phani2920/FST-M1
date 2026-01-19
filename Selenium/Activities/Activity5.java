package activities;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class Activity5 
{
	public static void main(String arg[])
	{
		
		WebDriver driver = new FirefoxDriver();
		driver.get("https://training-support.net/webelements/dynamic-controls");
		
		System.out.println("Page title is "+driver.getTitle());
		
		System.out.println("Is Checkbox availbale: "+driver.findElement(By.xpath("//input[@id ='checkbox']")).isDisplayed());
		
		driver.findElement(By.xpath("//button[contains(text(),'Toggle')]")).click();
		
		System.out.println("Is Checkbox availbale now: "+driver.findElement(By.xpath("//input[@id ='checkbox']")).isDisplayed());
		
		driver.quit();

	}

}
