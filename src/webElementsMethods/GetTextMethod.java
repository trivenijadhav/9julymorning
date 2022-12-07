package webElementsMethods;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class GetTextMethod {

	public static void main(String[] args) throws InterruptedException 
	{
		 System.setProperty("webdriver.chrome.driver", "C:\\myselenium\\chromedriver.exe");
		   
		 WebDriver driver=new ChromeDriver();
		 
		driver.get("https://vctcpune.com/selenium/practice.html");
		 //String result = driver.findElement(By.xpath("//h1[contains(text(),'To Practice Page')]")).getText();
		 
		// System.out.println("Text present on webpageis "+result);
	//storing element is reference variable when we are using that element multiples times
		 WebElement myElement = driver.findElement(By.xpath("//h1[contains(text(),'To Practice Page')]"));
		 myElement.click();
		 
		 myElement.getText();
		 
		 
	}

}
