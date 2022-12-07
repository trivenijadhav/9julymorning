package upStoxPOM;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class UpStoxLoginPage 
{
	//variable declaration
	
	@FindBy(name="userID")private WebElement userID;
	
	@FindBy(name ="Password") private WebElement Password;
	
	@FindBy(xpath = "//div[text()='Sign inti Upstox']") private WebElement signInButtton;
    
	//Initialization using constructor--> uses--> page factory class --> (method)-->initEleements
	 public UpStoxLoginPage(WebDriver driver)
	 {
		 PageFactory.initElements(driver, this);
		 
	 }
	 
	 //variable Usage using method
	 
	 public void enterUserID()
	 {
		 userID.sendKeys("6VBXJN");
	 }
	 
	 public void enretPassword()
	 {
		 Password.sendKeys("Imshubh@143");
	 }
	 
	 public void clickOnSignInButton()
	 {
		 signInButtton.click();
	 }
	 

}
