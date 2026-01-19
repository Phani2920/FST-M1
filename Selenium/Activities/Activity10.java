package activities;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.interactions.Actions;

public class Activity10 

{
	public static void main(String[] args)
	{
		
		WebDriver driver = new FirefoxDriver();
		Actions builder = new Actions(driver);
		
		driver.get("https://training-support.net/webelements/drag-drop");
		
		System.out.println("Title is : " +driver.getTitle());
		
		WebElement ball = driver.findElement(By.id("ball"));
		
		WebElement dropZone1 = driver.findElement(By.id("dropzone1"));
		WebElement dropZone2 = driver.findElement(By.id("dropzone2"));
		
        builder.dragAndDrop(ball, dropZone1).build().perform();

        //builder.clickAndHold(ball).moveToElement(dropZone1).pause(5000).release().build().perform();
        //.pause(5000)
        if(dropZone1.findElement(By.className("dropzone-text")).getText().equals("Dropped!")) 
        {
        	
        	System.out.println("Ball was dropped in Dropzone 1");

        }

       builder.dragAndDrop(ball, dropZone2).build().perform();
        if(dropZone2.findElement(By.className("dropzone-text")).getText().equals("Dropped!")) {
        	System.out.println("Ball was dropped in Dropzone 2");
        } 
        
        driver.quit();
	}

}
