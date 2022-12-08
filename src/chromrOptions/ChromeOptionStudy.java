package chromrOptions;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

public class ChromeOptionStudy {

	public static void main(String[] args)
	{
		System.setProperty("webdriver.chrome.driver","C:\\myselenium\\chromedriver.exe");
		
		ChromeOptions option = new ChromeOptions();
		//option.addArguments("incognito");
		option.addArguments("--disable-notifications");
		WebDriver driver =new ChromeDriver(option);
		driver.get("https://www.facebook.com/");
		driver.manage().window().maximize();
		
		

	
	
		

	}

}
