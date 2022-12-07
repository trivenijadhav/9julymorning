package screenshot;

import java.io.File;
import java.io.IOException;

import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.io.FileHandler;

public class ScreenshotEg2 {

	public static void main(String[] args) throws IOException 
	{
		System.setProperty("webdriver.chrome.driver", "C:\\myselenium\\chromedriver.exe");
		   
		 WebDriver driver=new ChromeDriver();
		 driver.get("https://paytm.com/");
		 driver.manage().window().maximize();
		  File source = ((TakesScreenshot)driver).getScreenshotAs(OutputType.FILE);
		   File destination = new File("C:\\myselenium\\Screenshots\\Screenshot(jpg).png");
		   FileHandler.copy(source,destination);

	}

}
