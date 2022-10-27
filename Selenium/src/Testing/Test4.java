package Testing;

import org.testng.Reporter;
import org.testng.annotations.Test;

public class Test4 {
  @Test
  public void f() {
	  Reporter.log("hello selenium",true);
	  Reporter.log("hello java",false);
  }
}
