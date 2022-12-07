package webDriverMethods;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class GetCurrentUrl {

	public static void main(String[] args)
	
	{
		 System.setProperty("webdriver.chrome.driver", "C:\\myselenium\\chromedriver.exe");
		   
		 WebDriver driver=new ChromeDriver();
		 driver.get("https://www.google.com/");
		 
		 driver.manage().window().maximize();
		 
		 String CurrentUrl = driver.getCurrentUrl();
		 
		 System.out.println("Current opened Url is "+CurrentUrl);
		 
		
		 

	}

}
