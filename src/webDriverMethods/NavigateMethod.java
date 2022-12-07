package webDriverMethods;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class NavigateMethod {

	public static void main(String[] args) throws InterruptedException 
	{
		 System.setProperty("webdriver.chrome.driver", "C:\\myselenium\\chromedriver.exe");
		   
		 WebDriver driver=new ChromeDriver();
		 
		 driver.navigate().to("https://apps.google.com/meet/");
		 
		 Thread.sleep(2000);
		 
		 driver.navigate().to("https://www.amazon.in/");
		 
		 Thread.sleep(2000);
		 
		 driver.navigate().back();
		 
		 Thread.sleep(2000);
		 
		 driver.navigate().forward();
		 
		 Thread.sleep(2000);
		 
		 driver.navigate().refresh();
		 
		 
		 

	}

}
