package findelement;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

     //Master Code

public class Flipkart {

	public static void main(String[] args) throws InterruptedException
	{
		
		System.setProperty("webdriver.chrome.driver", "C:\\myselenium\\chromedriver.exe");
		
		WebDriver driver=new ChromeDriver();
		
		driver.get("https://www.flipkart.com/");
		
		
		driver.findElement(By.xpath("//button[@class='_2KpZ6l _2doB4z']")).click();
		
		Thread.sleep(1000);
		
		driver.findElement(By.name("q")).sendKeys("i phone 14pro max");
		
		driver.findElement(By.xpath("//button[@type='submit']")).click();
		
		Thread.sleep(2000);
		
		List<WebElement> review = driver.findElements(By.xpath("((//div[@class='col col-7-12'])[1]//span)[6]"));
		
		for(WebElement a:review)
		{
			System.out.println(a.getText());
		}

	}
     
	
}
