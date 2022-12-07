package webDriverMethods;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class GetMethod {

	public static void main(String[] args) throws InterruptedException 
	{
		 System.setProperty("webdriver.chrome.driver", "C:\\myselenium\\chromedriver.exe");
		   
		 WebDriver driver=new ChromeDriver();
		 
		 //1]get method use
		 
        driver.get("https://www.amazon.in/");
        
        Thread.sleep(2000);
        
        driver.get("https://meet.google.com/");
        
        
        //2] close Method use
        
       // driver.close();
        
        //3]quit Method Use
        
      //  driver.quit();
        
        //4]Maximize/minimize Method use
        
        driver.manage().window().maximize();
        
        Thread.sleep(2000);
        
        driver.manage().window().minimize();
        
        
        
        
        
        
        
        
        
        
	}

}
