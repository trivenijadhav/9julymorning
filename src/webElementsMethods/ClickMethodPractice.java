package webElementsMethods;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class ClickMethodPractice {

	public static void main(String[] args) throws InterruptedException 
	{
		System.setProperty("webdriver.chrome.driver","C:\\myselenium\\chromedriver.exe");
		WebDriver driver =new ChromeDriver();
		
		driver.get("https://vctcpune.com/selenium/practice.html");
		
		Thread.sleep(1500);
		
		driver.findElement(By.name("radio")).click();
		
		Thread.sleep(1500);
		
		driver.findElement(By.id("checkBoxOption1")).click();
		
		
		}

}
