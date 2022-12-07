package popupStudy;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class AlertPopup {

	public static void main(String[] args) throws InterruptedException
	{
		
        System.setProperty("webdriver.chrome.driver", "C:\\myselenium\\chromedriver.exe");
        
        WebDriver driver=new ChromeDriver();
        
        driver.get("https://chercher.tech/practice/practice-pop-ups-selenium-webdriver");
        
        Thread.sleep(1000);
        
        driver.findElement(By.name("alert")).click();
        
        Alert alt = driver.switchTo().alert();
        
        System.out.println(alt.getText());
        
        Thread.sleep(1000);
        
        alt.accept();
         
        
        
	}

}
