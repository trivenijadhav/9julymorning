package testNGStudy;

import org.testng.Reporter;
import org.testng.annotations.Test;

public class KeywordStudy {
  @Test(invocationCount = 2)
  public void A()
  {
	  Reporter.log("Mathod A", true);
  }
  @Test(priority = -1)
  public void B()
  {
	  Reporter.log("Method B", true);
  }
  @Test(enabled = false)
  public void C()
  {
	  Reporter.log("Method C", true);
  }
  @Test(timeOut = 1000)
  public void D() throws InterruptedException
  {
	  Thread.sleep(10002);
	  Reporter.log("Method D", true);
  }
  @Test(dependsOnMethods = {"D"})
  public void E()
  {
	  Reporter.log("Method E", true);
  }
}
