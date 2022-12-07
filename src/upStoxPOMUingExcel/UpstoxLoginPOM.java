package upStoxPOMUingExcel;

import org.openqa.selenium.SearchContext;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class UpstoxLoginPOM 

//delecration using @findby method 
{
	@FindBy( name= "userId") private WebElement userID;
	
	@FindBy( name= "password") private WebElement password;
	
	@FindBy( xpath="//div[text()='Sign into Upstox']")private WebElement signInButton;
	
	//Initialization using  pagefactory.initelement
	
	public UpstoxLoginPOM(WebDriver driver)
	{
		PageFactory.initElements(driver, this);
		
	}

	//variable usage
	
	public void enterUserId(String un)
	{
		userID.sendKeys(un);
	}
	
	public void enterpassword(String pass)
	{
		password.sendKeys(pass);
	}
	
	public void clickonsinginbutton()
	{
		signInButton.click();
	}
	
}
