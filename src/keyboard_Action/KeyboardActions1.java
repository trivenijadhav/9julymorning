package keyboard_Action;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class KeyboardActions1 {

	public static void main(String[] args) throws InterruptedException
	{
        System.setProperty("webdriver.chrome.driver", "C:\\myselenium\\chromedriver.exe");
		
		WebDriver driver=new ChromeDriver();
		
		
		driver.get("https://www.facebook.com/");
		
		Thread.sleep(1000);
		
		WebElement createNewAccount = driver.findElement(By.xpath("//a[contains(@id,'u_0_0')]"));
		
		Actions act=new Actions(driver);
		
		act.click(createNewAccount).perform();
		
		Thread.sleep(1000);
		
		WebElement Day=driver.findElement(By.name("birthday_day"));
		
		act.click(Day).perform();
		
		Thread.sleep(1000);
		
		//act.sendKeys(Keys.ARROW_DOWN).sendKeys(Keys.ARROW_DOWN).sendKeys(Keys.ENTER).build().perform();
		
		act.sendKeys(Keys.ARROW_DOWN).perform();
		
		Thread.sleep(1000);
		
		act.sendKeys(Keys.ARROW_DOWN).perform();
		
		Thread.sleep(1000);
         
		act.sendKeys(Keys.ARROW_DOWN).perform();
		
		Thread.sleep(1000);

         act.sendKeys(Keys.ARROW_DOWN).perform();
         
         act.sendKeys(Keys.ENTER).perform();
         
         //selection of month using actions class
         
         WebElement month = driver.findElement(By.id("month"));
         
         act.click(month).perform();
         
         for(int i=0; i<=7; i++)
         {
        	 act.sendKeys(Keys.ARROW_UP).perform();
        	 Thread.sleep(500);
        
         }
          act.sendKeys(Keys.ENTER).perform();
         
	}

}
