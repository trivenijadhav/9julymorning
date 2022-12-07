package verificationUsingTestNG;

import static org.testng.Assert.assertTrue;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Reporter;
import org.testng.annotations.Test;

public class MyTestCase {
  @Test
  public void verufycheckbox()
  {
	  System.setProperty("webdriver.chrome.driver", "C:\\myselenium\\chromedriver.exe");
		
		WebDriver driver=new ChromeDriver();
		
		
		driver.get("https://www.vctcpune.com//selenium/practice.html");
		
		WebElement checkBox1 = driver.findElement(By.id("checkBoxOption1"));
		
	/*	if(checkBox1.isSelected())
		{
			Reporter.log("checkBox is selecterd TC is PASSED", true);
			
		}
		else
		{
			Reporter.log("checkBox is not selecterd TC is FAILSED", true);
		}*/
		
		checkBox1.click();
		
		assertTrue(checkBox1.isSelected(), "checkBox is not selecterd TC is FAILSED");
  }
}
