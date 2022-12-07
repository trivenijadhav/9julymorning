package testNGStudy;

import org.testng.annotations.Test;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeClass;
import org.apache.xmlbeans.impl.repackage.Repackage;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Reporter;
import org.testng.annotations.AfterClass;

public class AnnotationsStudy {
	
  @Test
  public void facebookLaunch()
  {
	  System.setProperty("webdriver.chrome.driver", "C:\\myselenium\\chromedriver.exe");
  	
  	WebDriver driver= new ChromeDriver();
  	
  	driver.get("https://www.youtube.com/");
  	
  }
  @BeforeMethod
  public void beforeMethod() 
  {
	  Reporter.log("clear cache and cookies", true);
  }

  @AfterMethod
  public void afterMethod() 
  {
	  Reporter.log("clear browser history", true);
  }

  @BeforeClass
  public void beforeClass() 
  {
	  Reporter.log("launch the browser", true);
  }

  @AfterClass
  public void afterClass() 
  {
	  Reporter.log("close the browser", true);
  }

}
