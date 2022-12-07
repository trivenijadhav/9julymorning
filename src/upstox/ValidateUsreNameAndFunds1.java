package upstox;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import scrolling.ScrollIntiView;
import scrolling.ScrollingScreenShot;

public class ValidateUsreNameAndFunds1 
 
 {
    private static Object actualUserName;

	public static void main(String[] args)
    {
	
    	System.setProperty("webdriver.chrome.driver", "C:\\myselenium\\chromedriver.exe");
    	
    	WebDriver driver= new ChromeDriver();
    	
    	driver.get("https://login-v2.upstox.com/");
    	
    	driver.manage().timeouts().implicitlyWait(Duration.ofMillis(500));
    	
    	//sending user Name
    	
    	driver.findElement(By.name("userId")).sendKeys("6VBXJN");
    	
    	//Sending Password
    	
    	driver.findElement(By.name("password")).sendKeys("Imshubh@143");
    	
    	//click on Signin button
    	
    	driver.findElement(By.id("submit-btn")).click();
    	
    	//Navigating to next page(passcode)
    	
    	driver.manage().timeouts().implicitlyWait(Duration.ofMillis(4000));
    	
    	//Entering birth year in passcode page
    	
    	driver.findElement(By.name("yob")).sendKeys("1996");
    	
    	//Navigating to next page
    	
    	driver.manage().timeouts().implicitlyWait(Duration.ofMillis(7000));
    	
    	//click on no thanks go to home page-->
    	
    	driver.findElement(By.xpath("(//button[@type='button'])[9]")).click();
    	
    	driver.manage().timeouts().implicitlyWait(Duration.ofMillis(2000));
    	
    	//validate User Name
    	
    	driver.findElement(By.xpath("(//span[@class='_3YI_lRyLDAFhz2WE-6yGuX'])[2]")).getText();
    	
    	
    	String expectedUserName="Shubham K.";
    	
    	
		//ScrollingScreenShot.scrollIntoView(driver, username);
    	
    	if(actualUserName.equals(expectedUserName))
    	{
    		System.out.println("Actual and Expected user names are matching TC is passed");
    	}

    	else
    	{
    		System.out.println("Actual and Expected user names are matching TC is Failed");
    	}
    	
    	//valid Funds
    	
    	//clicking on funds button
    	
    	driver.findElement(By.id("funds")).click();
    	
    	String funds = driver.findElement(By.xpath("((//div[@class='-2Bthrplw1VYHfLzzQvOasZ'])[1]//div)[3]")).getText();
    	
    	System.out.println("funds Available to trade is "+funds);
    	
    	
    	
     }
}
