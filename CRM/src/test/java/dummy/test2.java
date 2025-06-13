package dummy;

import org.testng.Reporter;
import org.testng.annotations.Test;

public class test2 {
	
	@Test(groups= {"Smoke", "Regression"})
	public void Test()
	{
		Reporter.log("Test Method", true);
	}

}
