package verificationUsingTestNG;

import org.testng.Reporter;
import org.testng.annotations.Test;

public class AssertEquals
{
  @Test
  public void TC1() 
  {
	  String a="Pune";
	  String b="Pune";
	  
  
  //need to verify a and b are equals or not
  //if a and b are equals TC is passed or TC is failed
  
  if(a.equals(b))
  {
	Reporter.log("a and b are matching TC is PASSED", true);  
  }
  else {
	  Reporter.log("a and b are not matching TC is FAILED", true);
  }
  
  //using Hard assert using static methods of Assert class
  
  //1)Assert Equals()
  
  
  
  
  }
  
}
