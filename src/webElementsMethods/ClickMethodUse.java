package webElementsMethods;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class ClickMethodUse {

	public static void main(String[] args) throws InterruptedException 
	{
	
		System.setProperty("webdriver.chrome.driver","C:\\myselenium\\chromedriver.exe");
		
		WebDriver driver=new ChromeDriver();
		
		//driver.get("https://vctcpune.com/");
		
		//driver.close();
		
		//Thread.sleep(1000);
		
		driver.get("https://vctcpune.com/selenium/practice.html");
		
		 driver.findElement(By.xpath("//input[@id='checkBoxOption1']")).click();
		 
		 Thread.sleep(2000);
		 
		 driver.findElement(By.xpath("//input[@id='checkBoxOption2']")).click();
		 
		 Thread.sleep(2000);
		 
		 driver.findElement(By.name("checkBoxOption1")).click();
		 
		 Thread.sleep(2000);
		 
		 driver.findElement(By.id("dropdown-class-example")).click();
		 
		 
		 
		 

	}

}
