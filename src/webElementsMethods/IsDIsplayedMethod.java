package webElementsMethods;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class IsDIsplayedMethod {

	public static void main(String[] args) throws InterruptedException
	{
		System.setProperty("webdriver.chrome.driver", "C:\\myselenium\\chromedriver.exe");
		   
WebDriver driver = new ChromeDriver();
		
		driver.get("https://vctcpune.com/selenium/practice.html");
		
		driver.manage().window().maximize();
		
		WebElement showtextBox = driver.findElement(By.id("displayed-text"));
		
		System.out.println(showtextBox.isDisplayed());
		
		Thread.sleep(100);
		
		driver.findElement(By.id("hide-textbox")).click();
			
		System.out.println(showtextBox.isDisplayed());
		
		Thread.sleep(100);
		
		driver.findElement(By.id("show-textbox")).click();
		
		System.out.println(showtextBox.isDisplayed());
		
		driver.findElement(By.id("displayed-text")).sendKeys("Welcome");
		 
		 
		
		
		
	
	
	
	
	}
		
		}
