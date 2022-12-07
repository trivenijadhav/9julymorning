package scrolling;

import java.io.File;
import java.io.IOException;

import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.io.FileHandler;

public class ScrollingEg1 {

	public static void main(String[] args) throws InterruptedException, IOException 
	{
		System.setProperty("webdriver.chrome.driver", "c:\\myselenium\\chromedriver.exe");
		
		WebDriver driver =new ChromeDriver();
		
		driver.get("https://paytm.com/");
		
		//driver.manage().window().maximize();
		
		Thread.sleep(1000);
		
		File source = ((TakesScreenshot)driver).getScreenshotAs(OutputType.FILE);
		System.out.println(source);
		
		File destination = new File("C:\\myselenium\\Screenshots\\screenshotjpg.png");
		
		FileHandler.copy(source, destination);
		Thread.sleep(1000);
		
		 JavascriptExecutor js =(JavascriptExecutor)driver;
		 
		 js.executeScript("window.scrollBy(1000, 800)");
		  Thread.sleep(5000);
		 
		 js.executeScript("window.scrollBy(1000,8000)");
		 Thread.sleep(1000);
		 
		 js.executeScript("window.scrollBy(1000,-5000)");
		 
	}

}
