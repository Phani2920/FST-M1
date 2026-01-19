package activities;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;

public class Activity7 

{
	public  static void main(String args[])
	{
		WebDriver driver  = new FirefoxDriver();
		
		driver.get("https://training-support.net/webelements/dynamic-controls");
		System.out.println("Home page title: " + driver.getTitle());
		
		WebElement textbox = driver.findElement(By.xpath("//input[@id = 'textInput']"));
		System.out.println("Is Enabled: " + textbox.isEnabled());
		
		driver.findElement(By.xpath("//button[@id ='textInputButton']")).click();
		
		System.out.println("Is Enabled: " + textbox.isEnabled());
		
	      textbox.sendKeys("Need improvement");
	      System.out.println(textbox.getDomProperty("value"));

		driver.quit();
		
	}

}
