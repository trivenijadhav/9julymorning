package scrolling;

import java.io.IOException;

import org.apache.poi.EncryptedDocumentException;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class ScrollIntiView {

	public static void main(String[] args) throws InterruptedException, EncryptedDocumentException, IOException
	{
		System.setProperty("webdriver.chrome.driver","c:\\myselenium\\chromedriver.exe");
		
		WebDriver driver=new ChromeDriver();
		
		driver.get("https://paytm.com/");
		Thread.sleep(1000);
		
		WebElement postpaid = driver.findElement(By.xpath("(//div[@class='_39f3B'])[3]"));
		
		/*JavascriptExecutor js = (JavascriptExecutor)driver;
		
		js.executeScript("arguments[0].scrollIntoView()",postpaid);*/
		
	     ScrollingScreenShot.scrollIntoView(driver,postpaid);
	     
	     ExcelSheetEg1.ExcelScroll1(0, 0);
	     
	
		
		
		

	}

}
