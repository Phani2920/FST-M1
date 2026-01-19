package activities;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;

public class Activity14 

{
	public static void main(String[] args)
	{
		WebDriver driver = new FirefoxDriver();
		driver.get("https://training-support.net/webelements/tables");
		System.out.println("Title is: "+driver.getTitle());
		
		List<WebElement> cols = driver.findElements(By.xpath("//table[contains(@class,'text-center')]/thead/tr/th"));
		System.out.println("column count: "+cols.size());
		
		List<WebElement> rows = driver.findElements(By.xpath("//table[contains(@class,'text-center')]/tbody/tr"));
		System.out.println("column count: "+rows.size());
		
		WebElement fifthBookName = driver.findElement(By.xpath("//table[contains(@class,'text-center')]/tbody/tr[5]/td[2]"));

		System.out.println("5th Bookname: "+fifthBookName.getText());
		
		WebElement priceHeader = driver.findElement(By.xpath("//table[contains(@class,'text-center')]/thead/tr/th[5]"));
		
		priceHeader.click();
		
		fifthBookName = driver.findElement(By.xpath("//table[contains(@class,'text-center')]/tbody/tr[5]/td[2]"));
		
		System.out.println("5th Bookname after sorting: "+fifthBookName.getText());

		

		
	}

}
