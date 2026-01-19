package activities;


import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.support.ui.Select;

public class Activity16 

{
	
	public static void main(String[] args)
	{
		
		
		WebDriver driver = new FirefoxDriver();
        driver.manage().window().maximize();
               
 
		driver.get("https://training-support.net/webelements/selects");
		System.out.println("Title is: "+driver.getTitle());
		
		WebElement dropDown = driver.findElement(By.cssSelector("select.h-10"));
		
		Select signleSelect = new Select(dropDown);
		
		signleSelect.selectByContainsVisibleText("Two");		
        System.out.println("Second option: " + signleSelect.getFirstSelectedOption().getText());

        signleSelect.selectByIndex(3);
        System.out.println("third option: " + signleSelect.getFirstSelectedOption().getText());
        
        signleSelect.selectByValue("four");
        System.out.println("fourth option: " + signleSelect.getFirstSelectedOption().getText());

        List<WebElement> allOptions = signleSelect.getOptions();
        
        for (WebElement option:allOptions)
        {
            System.out.println(option.getText());

        	
        }

        driver.quit();

}
	
}
