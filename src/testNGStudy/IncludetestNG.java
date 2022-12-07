package testNGStudy;

import org.testng.Reporter;
import org.testng.annotations.Test;

public class IncludetestNG 
{
	//I Wnat onlny A,D to be tested
  @Test
  public void A() 
  {
	  Reporter.log("A TC running", true);
  }
  @Test
  public void B()
  {
	  Reporter.log("B TC running", true); 
  }
  @Test
  public void C()
  {
	  Reporter.log("C TC running", true); 
  }
  @Test
  public void D()
  {
	  Reporter.log("D TC running", true); 
  }
  @Test
  public void E()
  {
	  Reporter.log("E TC running", true); 
  }
  @Test
  public void F()
  {
	  Reporter.log("F TC running", true); 
  }
}
