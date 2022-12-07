package iframe;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Nestediframe {

	public static void main(String[] args) throws InterruptedException 
	{
		System.setProperty("webdriver.chrome.driver", "C:\\\\myselenium\\\\chromedriver.exe");
		
		WebDriver driver=new ChromeDriver();
		
		driver.get("https://www.dezlearn.com/nested-iframes-example/");
		Thread.sleep(1000);
		
		driver.switchTo().frame("Parent iframe");
		
		
		
		
		

	}

}
