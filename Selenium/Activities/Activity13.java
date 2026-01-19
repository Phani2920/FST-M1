package activities;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;

public class Activity13 
{
	public static void main(String[] args)
	{
		
		WebDriver driver = new FirefoxDriver();
		
		
		driver.get("https://training-support.net/webelements/tables");
		
	    System.out.println("Page title is: "+driver.getTitle());
	    
	    List<WebElement> col = driver.findElements(By.xpath("//table[contains(@class,'text-center')]/thead/tr/th"));
	    System.out.println("Total no of columns: "+col.size());
	    List<WebElement> rows = driver.findElements(By.xpath("//table[contains(@class,'text-center')]/tbody/tr"));
	    System.out.println("Total no of rows: "+rows.size());
	    
	    
	    List<WebElement> thirdRow = driver.findElements(By.xpath("//table[contains(@class,'text-center')]/tbody/tr[3]/td"));
	    System.out.println("Third row cell values: ");
	    for(WebElement cell : thirdRow)
	    {
		    System.out.println(cell.getText());

	    }
	    
	    WebElement cellData = driver.findElement(By.xpath("//table[contains(@class,'text-center')]/tbody/tr[2]/td[2]"));
        System.out.println("Second row, second cell value: " + cellData.getText());

		driver.quit();

	}

}
