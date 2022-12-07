package selenuim_use;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Testing1
{

	public static void main(String[] args) 
	{
		System.setProperty("webdriver.chrome.driver", "C:\\myselenium\\chromedriver.exe");
		
		WebDriver driver=new ChromeDriver();
		
		
		driver.get("https://www.amazon.in/");
		
		driver.findElement(By.xpath("//a[@class='nav-a  ']")).click();
		
		
		
		

	}

}
