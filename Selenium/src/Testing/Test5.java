package Testing;

import org.testng.Reporter;
import org.testng.annotations.Test;

public class Test5 {
  @Test(invocationCount=4)
  public void f() {
	  Reporter.log("calls",true);
  }
  @Test(priority = -1,invocationCount=2,enabled=false)
  public void setting() {
	  Reporter.log("settings",true);
  }
  @Test(priority = 1)
  public void chats()
  {
	  Reporter.log("chats",true);
	  
  }
}
