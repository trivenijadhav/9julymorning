package tablereading;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class WebTable {

	public static void main(String[] args)
	{
        System.setProperty("webdriver.chrome.driver", "C:\\myselenium\\chromedriver.exe");
		
		WebDriver driver=new ChromeDriver();
		
		driver.get("https://vctcpune.com/selenium/practice.html");
		
		List<WebElement> rows = driver.findElements(By.xpath("//table[@id='product']//tr"));
		
          System.out.println("rows are "+ rows.size());
          
         List<WebElement> columns = driver.findElements(By.xpath("//table[@id='product']//tr[1]/th"));
         
         System.out.println("Columns are "+ columns.size());
         
        /* for(WebElement r:rows)
        	 
         {
        	 
        	 System.out.println(r.getText());
         }*/
         
        WebElement table = driver.findElement(By.xpath("//table[@id='product']/tbody"));
        
        System.out.println(table.getText());
         
		

	}
		

}
