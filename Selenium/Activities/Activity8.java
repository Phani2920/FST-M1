package activities;

import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class Activity8 
{
	public static void main(String[] args)
	{
         WebDriver driver = new FirefoxDriver();	
         driver.get("https://training-support.net/webelements/mouse-events");
         System.out.println("Page title is "+driver.getTitle());
         
         Actions builder = new Actions(driver);
		
         WebElement cargoLock = driver.findElement(By.xpath("//h1[text()='Cargo.lock']"));
         WebElement cargoToml = driver.findElement(By.xpath("//h1[text()='Cargo.toml']"));
         WebElement srcButton = driver.findElement(By.xpath("//h1[text()='src']"));
         WebElement targetButton = driver.findElement(By.xpath("//h1[text()='target']"));
         
         builder.click(cargoLock).pause(1000).click(cargoToml).pause(5000).build().perform();
         String actionMessage = driver.findElement(By.id("result")).getText();
         System.out.println(actionMessage);
//.moveToElement(targetButton).pause(2000)
         
         builder.doubleClick(srcButton).pause(3000).pause(3000).contextClick(targetButton).pause(2000).build().perform();
         builder.click(driver.findElement(By.xpath("//div[@id='menu']/div/ul/li[1]"))).pause(5000).build().perform();
         actionMessage = driver.findElement(By.id("result")).getText();
         System.out.println(actionMessage);
         
         driver.quit();


	}

}
