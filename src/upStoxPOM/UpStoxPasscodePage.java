package upStoxPOM;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class UpStoxPasscodePage
{
	//variable declaration
	
	@FindBy(name="yob") private WebElement passcodeField;
	
	//initialize variable
	
	public  UpStoxPasscodePage(WebDriver driver) 
	{
		PageFactory.initElements(driver, this);
	}
	
	//usage

	public void enterPassCode()
	{
		passcodeField.sendKeys("1996");
	}
}
