package Activities;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.Assert;
import org.testng.SkipException;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

public class Activity2 

{

	private WebDriver driver;
	 
	 @BeforeClass
	 public void setUp()
	 {
		 
		 driver = new FirefoxDriver();
		 driver.get("https://training-support.net/webelements/target-practice");
	 }
	 
	 @Test
	 public void testCase1()
	 {
		 String pageTittle = driver.getTitle();
		 System.out.println("Title is: "+pageTittle);
		 Assert.assertEquals(pageTittle, "Selenium: Target Practice");
		 
	 }
	 
	 @Test
	 public void testCase2()
	 { 
		 WebElement blackButton = driver.findElement(By.cssSelector("button.black"));
		 Assert.assertTrue(blackButton.isDisplayed());
		 
	 }
	 
	 @Test(enabled = false)
	 public void testCase3()
	 { 
		 System.out.println("This will be skipped. But not show as skipped");
		 
	 }
	 
	 @Test
	 public void testCase4() 	
	 { 
		 throw new SkipException("Skipping test case 4");
		 
	 }
	 
	  
		
		 
	 @AfterClass
	  public void teardown()
	  {
		 driver.close();
	  }
	 
		 
}
