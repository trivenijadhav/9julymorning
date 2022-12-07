package webDriverMethods;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class GetTitleMethod {

	public static void main(String[] args) 
	{
	
		 System.setProperty("webdriver.chrome.driver", "C:\\myselenium\\chromedriver.exe");
		   
		 WebDriver driver=new ChromeDriver();
		 
		 driver.navigate().to("https://apps.google.com/meet/");
		 
		  System.out.println(driver.getTitle());
		  
		  String myTitle=driver.getTitle();
		  
		  System.out.println("title of webpage is "+myTitle);
		  

	}

}
