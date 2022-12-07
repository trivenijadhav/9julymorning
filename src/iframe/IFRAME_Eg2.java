package iframe;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class IFRAME_Eg2 {

	public static void main(String[] args) throws InterruptedException 
	{
	
		System.setProperty("webdriver.chrome.driver", "C:\\myselenium\\chromedriver.exe");
		 WebDriver driver=new ChromeDriver();
		
		driver.get("https://demoqa.com/frames");
		
		Thread.sleep(1000);
		
		driver.switchTo().frame("frame1");
		
		String PageText = driver.findElement(By.xpath("//h1[@id='sampleHeading']")).getText();
		System.out.println("the text in frame 1 is "+PageText);
		Thread.sleep(1000);
		
		//driver.switchTo().defaultContent();
		
		Thread.sleep(1000);
		
		//driver.switchTo().frame("frame2");
		
         String PageText2 = driver.findElement(By.xpath("//h1[@id='sampleHeading']")).getText();
         System.out.println("the text in frame 2 is "+PageText2);
         		
		
	}

}
