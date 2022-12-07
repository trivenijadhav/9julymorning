package chromrOptions;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

public class ChromeOptionsUse {

	public static void main(String[] args) throws InterruptedException
	{
		System.setProperty("webdriver.chrome.driver", "C:\\myselenium\\chromedriver.exe");
		
		WebDriver driver=new ChromeDriver();
		
		//driver.manage().window().maximize();
		
		driver.get("https://www.justdial.com/");
		
		ChromeOptions opt= new ChromeOptions();
		//opt.addArguments("--disable-notifications");
		opt.addArguments("incognito");
		opt.addArguments("start-maximized");
		
		driver.manage().timeouts().implicitlyWait(Duration.ofMillis(1000));
		driver.findElement(By.xpath("//span[text()='Shop Online']")).click();


	}

}