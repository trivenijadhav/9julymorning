package webElementsMethods;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class SendkeyMethodUse {

	public static void main(String[] args) throws InterruptedException
	{
		System.setProperty("webdriver.chrome.driver", "C:\\myselenium\\chromedriver.exe");
		
		WebDriver driver=new ChromeDriver();
		
		driver.get("https://www.facebook.com/login/");
		
		//driver.manage().window().maximize();
		
		driver.findElement(By.xpath("//input[@id='email']")).sendKeys("Sangamner");
		
		Thread.sleep(2000);
		
		driver.findElement(By.xpath("//input[@id='email']")).clear();
		
		driver.findElement(By.xpath("//input[@id='email']")).sendKeys("pune");
		
		
		
		
		
	}

}
