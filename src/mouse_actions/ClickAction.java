package mouse_actions;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class ClickAction {

	public static void main(String[] args) throws InterruptedException 
	{
	
		 System.setProperty("webdriver.chrome.driver", "C:\\myselenium\\chromedriver.exe");
		   
		 WebDriver driver=new ChromeDriver();
		 
		 driver.get("https://vctcpune.com/selenium/practice.html");
		 
		 Thread.sleep(1000);
		 
		 WebElement RadioButton = driver.findElement(By.xpath("//input[@value='Radio1']"));
		 
		 RadioButton.click();  //by using web element
		 
		 //click by using Actions class
		//1.find Element to be handled and store in reference variable
		 
		WebElement RedioButton1 = driver.findElement(By.xpath("//input[@value='Radio1']"));
		
		//2. create an object of Actions class
		
		Actions act=new Actions(driver);
		
		//3. Using one of the actions class methods
		
	    //1st way
		 
		//act.moveToElement(RedioButton1).perform();
		//act.click().perform();
		
		//2nd way
		
	//	act.moveToElement(RedioButton1).build().perform();
		
		//3rd way
		
		act.click(RedioButton1).perform();
		

	}

}
