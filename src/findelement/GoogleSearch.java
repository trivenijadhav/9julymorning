package findelement;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class GoogleSearch {

	public static void main(String[] args) throws InterruptedException
	{
		System.setProperty("webdriver.chrome.driver", "C:\\myselenium\\chromedriver.exe");
		
		WebDriver driver=new ChromeDriver();
		
		driver.get("https://www.google.com/");
		
		driver.findElement(By.name("q")).sendKeys("nivia");
		
		Thread.sleep(1000);
		
	 List<WebElement> searchlist = driver.findElements(By.xpath("(//ul[@class='G43f7e'])[1]/li"));
		
        for(WebElement sl:searchlist)
        {
        	System.out.println(sl.getText());
        
         String nf = "nivia football";
		
        if(nf.equals(sl.getText()))
       
        {
        	sl.click();
        	driver.findElement(By.xpath("//a[@data-hveid='CAIQBA']")).click();
        	Thread.sleep(1000);
        	//WebElement totalimages = driver.findElement(By.id("islmp"));
        	List<WebElement> totalimages = driver.findElements(By.id("islmp"));
        	System.out.println("List of FootBall Image " +totalimages.size());
        	break;
        	
        }
        
     }
        		
}

}
