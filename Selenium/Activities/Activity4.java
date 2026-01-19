package activities;
import org.openqa.selenium.support.Color;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class Activity4 
{
	
	public static void main(String arg[])
	{
		WebDriver driver = new FirefoxDriver();
		driver.get("https://training-support.net/webelements/target-practice");
		System.out.println("Home page title: " + driver.getTitle());
		
		String thirdHeader = driver.findElement(By.xpath("//h3[contains(text(),'#3')]")).getText();
		
		System.out.println("Third header : " + thirdHeader);

		Color headerColor = Color.fromString(driver.findElement(By.xpath("//h5[contains(text(), '#5')]")).getCssValue("color"));
		System.out.println("Color as RGB: " +headerColor.asRgb());
		System.out.println("Color as hexcode: " +headerColor.asHex());
		
		String purpleButtonClass = driver.findElement(By.xpath("//button[text()='Purple']")).getDomAttribute("class");
		System.out.println("Classes "+purpleButtonClass);
		
		String slateButton = driver.findElement(By.xpath("//button[text()='Slate']")).getText();
		System.out.println("Text of Button "+slateButton);
		
		driver.quit();



	}

}
