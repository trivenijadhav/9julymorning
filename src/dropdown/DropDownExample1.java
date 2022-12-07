package dropdown;

import java.util.Iterator;
import java.util.List;
import java.util.ListIterator;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class DropDownExample1 {

	public static void main(String[] args) throws InterruptedException
	{
		System.setProperty("webdriver.chrome.driver","C:\\myselenium\\chromedriver.exe");
		WebDriver driver =new ChromeDriver();
		
		driver.get("https://www.facebook.com/");
		
		driver.findElement(By.xpath("//a[contains(@id,'u_0_0_')]")).click();
		
		Thread.sleep(1000);
		
		WebElement Day = driver.findElement(By.id("day"));
		
		Select s=new Select(Day);
		
		s.selectByIndex(5);
		
		//select month From DRopDown
		
		WebElement month = driver.findElement(By.id("month"));
		Thread.sleep(200);
		
		Select smonth= new Select(month);
		
		//smonth.selectByVisibleText("Apr");
		
		
		for(int i=0; i<5;i++)
		{
			smonth.selectByIndex(i);
		}
		
		for(int i=5; i>=2; i--)
		{
			Thread.sleep(100);
			smonth.selectByIndex(i);
			
		}
		System.out.println(smonth.isMultiple());
		 System.out.println(smonth.getFirstSelectedOption().getText());
		 
		//select Month from DropDown
		 
		List<WebElement>allMonths= smonth.getOptions();
		
		System.out.println("++++++++++++++++++ For Loop(Month) +++++++++++++++++++++++");
		
		for (int i=0; i<=allMonths.size()-1; i++)
		{
			System.out.println(allMonths.get(i).getText());
		}
		
		System.out.println("++++++++++++++++++ For Each(Month) +++++++++++++++++++++++");
		
		for(WebElement m:allMonths)
		{
			System.out.println(m.getText());
		}
		System.out.println("++++++++++++++++++ Iterator(Month) +++++++++++++++++++++++");
		
		Iterator<WebElement> it=allMonths.iterator();
		while(it.hasNext())
		{
			System.out.println(it.next().getText());
			
		}
		System.out.println("++++++++++++++++++ List Iterator(Month) +++++++++++++++++++++++");
		
		ListIterator<WebElement> ll = allMonths.listIterator();
		while(ll.hasNext())
		{
			System.out.println(ll.next().getText());
			
		}
		
         /* WebElement day = driver.findElement(By.id("day"));
          
          Select sday= new Select(day);
          
          List<WebElement> alldays= sday.getOptions();
          
  		System.out.println("++++++++++++++++++ For Loop(Days) +++++++++++++++++++++++");
  		
  		for(int i=0; i<=alldays.size()-1; i++)
  		{
  			System.out.println(alldays.get(i).getText());
  		}
  		System.out.println("++++++++++++++++++ For Each(Days) +++++++++++++++++++++++");
  		
  		for(WebElement d:alldays)
  		{
  		   System.out.println(d.getText());	
  		}*/

          
          
		
	}
	
}
