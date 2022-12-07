package selenuim_use;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Selenium_code {

	public static void main(String[] args) 
	{
	 System.setProperty("webdriver.chrome.driver", "C:\\myselenium\\chromedriver.exe");
	   
	 WebDriver driver=new ChromeDriver();
	 
	  driver.get("https://www.netflix.com/in/");
	  
	  
	 

	}

}
