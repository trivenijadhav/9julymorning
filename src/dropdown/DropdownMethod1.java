package dropdown;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class DropdownMethod1 {

	public static void main(String[] args ) throws InterruptedException 
	{
		System.setProperty("webdriver.chrome.driver", "C:\\myselenium\\chromedriver.exe");
		   
		 WebDriver driver=new ChromeDriver();
		 driver.get("https://vctcpune.com/selenium/practice.html");
		 WebElement dropdown = driver.findElement(By.id("dropdown-class-example"));
		 Select s=new Select(dropdown);
		 s.selectByIndex(2);
		 Thread.sleep(500);
		 s.selectByIndex(0);
		 Thread.sleep(500);
		 s.selectByIndex(1);
		 Thread.sleep(500);
		 s.selectByIndex(3);
		 
		// s.selectByValue("option2");
		
		
		 
		 
		 

	}

}
