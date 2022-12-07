package popupStudy;

import java.util.Iterator;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class ChildBrowserPopup {

	public static void main(String[] args) throws InterruptedException 
	{
System.setProperty("webdriver.chrome.driver", "C:\\myselenium\\chromedriver.exe");
        
        WebDriver driver=new ChromeDriver();
		
		driver.get("https://skpatro.github.io/demo/links/");
		
		Thread.sleep(1000);
		
		//to get id of main page use get WindowHandle-->
		
		String mainpageId=driver.getWindowHandle();
		
		System.out.println(mainpageId);
		
		//to open new window click on main page     
		
		driver.findElement(By.name("NewWindow")).click();
		
		//to get all page id's use get windows handles() method return type is set string
		
		Set<String> allpageId = driver.getWindowHandles();
		
	      for(String a:allpageId)
	      {
	    	  System.out.println(a);
	      }
	      
	      //to get desired page id use iterator and use next method to move
	      
	      Iterator<String> it = allpageId.iterator();
	      
	         String mainpageIdnew = it.next();
	         
	         String childpageid = it.next();
	         
	         Thread.sleep(1000);
	         
	         System.out.println(mainpageIdnew);
	         System.out.println(childpageid);
	         
	         driver.switchTo().window(childpageid); //switching selenium focus from main page to child page
	         
	         Thread.sleep(1000);
	         
	         driver.manage().window().maximize();
	         
	         //driver.close();
	         driver.quit();
	         
		
		
		
		
		

	}

}
