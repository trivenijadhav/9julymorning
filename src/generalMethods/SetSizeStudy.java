package generalMethods;

import org.openqa.selenium.Dimension;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class SetSizeStudy {

	public static void main(String[] args) throws InterruptedException 
	{
     System.setProperty("webdriver.chrome.driver", "C:\\myselenium\\chromedriver.exe");
		
		WebDriver driver=new ChromeDriver();
		
		driver.get("https://www.facebook.com/");
		
		Thread.sleep(1000);
		
		//driver.manage().window().maximize();
		
		//Default Size
		Dimension defaultsize = driver.manage().window().getSize();
		
		System.err.println("Default Size "+defaultsize);
		
		//current Size
		
		Dimension d= new Dimension(400,800);
		Thread.sleep(1000);
		driver.manage().window().setSize(d);
		
	    Dimension currentsize = driver.manage().window().getSize();
	    
	    System.out.println("Current Size "+currentsize);
	    
	    //maximum Size
	    
		driver.manage().window().maximize();
       
		Dimension maxsize = driver.manage().window().getSize();
		
		System.out.println("Max Size "+maxsize);
	
	    
	
		

		
		
		

	}

}
