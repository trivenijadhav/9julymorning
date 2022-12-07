package mouse_actions;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class Contextclick_RightClick 
{

	public static void main(String[] args) throws InterruptedException 
	{
		System.setProperty("webdriver.chrome.driver", "C:\\myselenium\\chromedriver.exe");
		
		WebDriver driver= new ChromeDriver();
		
		driver.get("https://demo.guru99.com/test/simple_context_menu.html");
		Thread.sleep(1000);
		
		//1.find Element to be handled and store in reference variable
		
		WebElement rightclickbutton = driver.findElement(By.xpath("//span[text()='right click me']"));
		
		//2. create an object of Actions class
		
		Actions act=new Actions(driver);
		
		//3. Using one of the actions class methods
		
		//1st way
		
		/*act.moveToElement(rightclickbutton).perform();
		
		act.contextClick().perform();
		
		//2nd way
		
		act.moveToElement(rightclickbutton).contextClick().build().perform();
		
		//3rd way*/
		
		act.contextClick(rightclickbutton).perform();
		
		
		
		
		
		

	}

}
