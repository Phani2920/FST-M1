package activities;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;

public class Activity6 

{
	public static void main(String arg[])
	{
	WebDriver driver  = new FirefoxDriver();
	
	driver.get("https://training-support.net/webelements/dynamic-controls");
	System.out.println("Home page title: " + driver.getTitle());
	
	WebElement checkbox = driver.findElement(By.xpath("//input[@id ='checkbox']"));
	
	System.out.println("Is Checkbox seletced: " + checkbox.isSelected());
	
	checkbox.click();
	
	System.out.println("Is Checkbox seletced now: " + checkbox.isSelected());
	
	driver.quit();

	
	}
	

}
