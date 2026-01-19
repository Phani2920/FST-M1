package activities;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class Activity22 
{
	public static void main(String[] args)
	{
		WebDriver driver = new FirefoxDriver();
		WebDriverWait wait = new WebDriverWait(driver,Duration.ofSeconds(10));
		driver.get("https://training-support.net/webelements/popups");
		System.out.println(driver.getTitle());
		
		driver.findElement(By.xpath("//button[@id='launcher']")).click();
        wait.until(ExpectedConditions.elementToBeClickable(By.id("username")));
        
        WebElement username = driver.findElement(By.id("username"));

        WebElement password = driver.findElement(By.id("password"));

        username.sendKeys("admin");
        password.sendKeys("password");
        // Click the submit button
        driver.findElement(By.xpath("//button[text()='Submit']")).click();
        
        //String message = driver.findElement(By.cssSelector("h2.text-center")).getText();
        String message = driver.findElement(By.xpath("//h2[contains(@class,'text-center')]")).getText();

        System.out.println("Login message: " + message);

        // Close the browser
        //driver.quit();

		
	}

}
