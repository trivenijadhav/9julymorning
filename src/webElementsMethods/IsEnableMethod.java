package webElementsMethods;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class IsEnableMethod {

	public static void main(String[] args) throws InterruptedException 
	{
		System.setProperty("webdriver.chrome.driver", "C:\\myselenium\\chromedriver.exe");
		   
		  WebDriver driver=new ChromeDriver();
		  driver.get("https://www.discoveryplus.in/");
	      Thread.sleep(7000);
	      driver.findElement(By.xpath("(//h6[text()='Sign In'])[2]")).click();
	      WebElement getotp = driver.findElement(By.xpath("//button[text()='Get OTP']"));
	      boolean result = getotp.isEnabled();
	      System.out.println("Get OTP Button is enable Status is  "+result);
	      WebElement mobileNumberField = driver.findElement(By.id("mobileNumber"));
	      mobileNumberField.sendKeys("9999999999");
	      boolean result1 = getotp.isEnabled();
	      System.out.println("Get OTP Button is enable Status is  "+result1);
	      getotp.click();
	      
	
	
	
	
	}
	   

	}

