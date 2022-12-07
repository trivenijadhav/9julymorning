package generalMethods;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import webElementsMethods.ClickMethodUse;

public class ClickByJavascript {

	public static void main(String[] args) throws InterruptedException 
	{
		 System.setProperty("webdriver.chrome.driver", "C:\\myselenium\\chromedriver.exe");
			
			WebDriver driver=new ChromeDriver();
			
			driver.get("https://www.amazon.in/");
			
			Thread.sleep(1000);
			
			JavascriptExecutor js = (JavascriptExecutor)driver;
			
			//Click By Javascript
			WebElement searchcontext = driver.findElement(By.id("nav-search-submit-button"));
			js.executeScript("arguments[0].click", searchcontext);
			
			//Sendkey By Javascript
			
			WebElement searchtext = driver.findElement(By.id("twotabsearchtextbox"));
            js.executeScript("arguments[0].value='iphone'", searchtext);
	}

}
