package mouse_actions;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class Doubleclick 
{

	public static void main(String[] args) throws InterruptedException
	{
		System.setProperty("webdriver.chrome.driver", "C:\\myselenium\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		
		 driver.get("https://demo.guru99.com/test/simple_context_menu.html");
		
		 Thread.sleep(100);
		 
		 //1.find the element to be handled and store it in reference variable
		 
		 WebElement doubleclick = driver.findElement(By.xpath("//button[text()='Double-Click Me To See Alert']"));
		 
		 //2.create an object of actions class
		 
		 Actions action= new Actions(driver);
		 
		 //3.using one of the actions of class methods complete required action
		 
		 //1st way:-
		 
		// action.moveToElement(double click).doubleClick().perform();
		 
		 //2nd way:-
		 
		/* action.moveToElement(double click).perform();
		 action.doubleClick().perform();*/
		 
		 //3rd way
		 
		 action.doubleClick(doubleclick).perform();
    }

}
