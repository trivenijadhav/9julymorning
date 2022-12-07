package keyboard_Action;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;


public class KeyboardActions2 {

	public static void main(String[] args) throws InterruptedException
{
		System.setProperty("webdriver.chrome.driver","C:\\myselenium\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		
		driver.get("https://www.facebook.com/");
		
		Thread.sleep(100);
		
		WebElement UesrName= driver.findElement(By.id("email"));
		
		//User Name sendkey Triveni
		
	 Actions act=new Actions(driver);
	 
	 act.keyDown(Keys.SHIFT).sendKeys("t").keyUp(Keys.SHIFT).sendKeys("riveni Vijay Thorat").build().perform();
	 
	 WebElement Password = driver.findElement(By.id("passContainer"));
	 
	 //act.moveToElement(Password).perform();
	 
	 //act.click().perform();
	 
	 Password.click();
	 
	 act.keyDown(Keys.SHIFT).sendKeys("s").keyUp(Keys.SHIFT).sendKeys("angamner").build().perform();
	 
	 act.sendKeys(Keys.ENTER).perform();
	 
	 
	 
		
	}

}