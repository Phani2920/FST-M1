package activities;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class Activity15
{
	
	public static void main(String[] args)
	{
		
		
		WebDriver driver = new FirefoxDriver();
        WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(30));
        driver.manage().window().maximize();
               
 
		driver.get("https://training-support.net/webelements/dynamic-attributes");
		System.out.println("Title is: "+driver.getTitle());
		
		WebElement fullName = driver.findElement(By.xpath("//input[starts-with(@id, 'full-name')]"));
		WebElement email = driver.findElement(By.xpath("//input[contains(@id,'-email')]"));
		WebElement date = driver.findElement(By.xpath("//input[contains(@name, 'event-date')]"));
        WebElement details = driver.findElement(By.xpath("//textarea[contains(@id, '-additional-details-')]"));

        fullName.sendKeys("Raiden Shogun");
        email.sendKeys("raiden@electromail.com");
        date.sendKeys("2025-06-26");
        details.sendKeys("It will be electric!");
        
        driver.findElement(By.xpath("//button[text()='Submit']")).click();
String message = wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//h3[@id ='action-confirmation']"))).getText();

System.out.println(message);

driver.quit();

	}

}
