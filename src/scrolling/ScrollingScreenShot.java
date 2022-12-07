package scrolling;

import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class ScrollingScreenShot {

	
	
		public static void scrollIntoView(WebDriver driver,WebElement element)
		{
			JavascriptExecutor js = (JavascriptExecutor)driver;
			
			js.executeScript("arguments[0].scrollIntoView()", element );
			
			
			
			
			
		}

	}


