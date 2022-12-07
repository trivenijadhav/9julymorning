package iframe;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class iframe_Eg1 {

	public static void main(String[] args) throws InterruptedException
	{
		System.setProperty("webdriver.chrome.driver", "C:\\myselenium\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		
		 driver.get("https://www.w3schools.com/js/tryit.asp?filename=tryjs_events");
		 
		 Thread.sleep(1000);
		 driver.switchTo().frame("iframeResult");
		 
		 Thread.sleep(1000);
		 driver.findElement(By.xpath("//button[@type='button']")).click();
		 
		 

	}

}
