package generalMethods;

import org.openqa.selenium.Point;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class SetPositionStudy {

	public static void main(String[] args)
	{
       System.setProperty("webdriver.chrome.driver", "C:\\myselenium\\chromedriver.exe");
		
		WebDriver driver=new ChromeDriver();
		
		driver.get("https://www.google.com/");
		
		//driver.manage().window().maximize();
		
		Point defaultposition = driver.manage().window().getPosition();
		
		System.out.println("Default Position "+defaultposition);
		
		Point p = new Point(500,100);
		
		driver.manage().window().setPosition(p);
		
		Point newposition = driver.manage().window().getPosition();
		
		System.out.println("New Position "+ newposition);
		
		
		}

}
