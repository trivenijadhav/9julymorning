package testNGStudy;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class Example1Testing {
  @Test//this for method /test case
  public void KiteLogin() 
  {
	 System.setProperty("webdriver.chrome.driver","c:\\myselenium\\chromedriver.exe");
	 
	 WebDriver driver =new ChromeDriver();
	 
	 driver.get("https://Kite.zeridha.com/");
  }
}
