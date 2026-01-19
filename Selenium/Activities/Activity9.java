package activities;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.interactions.Actions;

public class Activity9 

{
	public static void main(String[] args)
	{
		WebDriver driver = new FirefoxDriver();
		Actions builder = new Actions(driver);

		
		driver.get("https://training-support.net/webelements/keyboard-events");
		
		System.out.println("Page title is: "+driver.getTitle());
		
        builder.sendKeys("This is coming from Selenium").build().perform();
        builder.sendKeys(Keys.ENTER).build().perform();
        builder.sendKeys(Keys.RETURN).build().perform();
       // builder.sendKeys(Keys.BACK_SPACE).build().perform();
       // builder.sendKeys(Keys.BACK_SPACE).build().perform();

        String pageText = driver.findElement(By.cssSelector("h1.mt-3")).getText();
        System.out.println(pageText);

		driver.quit();
	}

}
