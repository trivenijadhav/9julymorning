package testNGStudy;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class NormalClass
{
  
   public static void main(String[] args)
   {
	   System.setProperty("webdriver.chrome.driver", "c:\\myselenium\\chromedriver.exe");
	   
	   WebDriver driver =new ChromeDriver();
	   
	  // driver.manage().window().maximize();
	   driver.get("https://Kite.zerodha.com");
	
} 
}
