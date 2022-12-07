package testNGStudy;

import org.testng.Reporter;
import org.testng.annotations.Test;

public class Grouping {
	//I Want only A,D tested
  @Test(groups = {"homepage","funds"})
  public void A() 
  {
	 Reporter.log("A TC running", true);
	 
  }
  @Test(groups = "funds")
  public void B() 
  {
	 Reporter.log("B TC running", true);
	 
  }
  @Test(groups = "homepage")
  public void C() 
  {
	 Reporter.log("C TC running", true);
	 
  }
  @Test(groups = "funds")
  public void D() 
  {
	 Reporter.log("D TC running", true);
	 
  }
  @Test(groups = "homepage")
  public void E() 
  {
	 Reporter.log("E TC running", true);
	 
  }
}
