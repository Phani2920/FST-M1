package activities;

import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class Activity11 
{
	
	public static void main(String[] args)
	
	{
		
		WebDriver driver = new FirefoxDriver();
        WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(10));

		driver.get("https://training-support.net/webelements/dynamic-controls");
		System.out.println("Page title is: "+driver.getTitle());
		
		
		WebElement checkBox = driver.findElement(By.id("checkbox"));
        System.out.println("Checkbox is visible? " + checkBox.isDisplayed());

			
		WebElement toggleButton = driver.findElement(By.xpath("//button[text()= 'Toggle Checkbox']"));

		toggleButton.click();
		
		 wait.until(ExpectedConditions.invisibilityOf(checkBox));
		 System.out.println("Checkbox is visible? " + checkBox.isDisplayed());

			toggleButton.click();
		wait.until(ExpectedConditions.elementToBeClickable(checkBox)).click();
		
		 System.out.println("Checkbox is selected? " + checkBox.isSelected());
		 
        driver.quit();

	}

}
