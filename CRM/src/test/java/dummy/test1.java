package dummy;

import org.testng.Reporter;
import org.testng.annotations.Test;

//example for exclude method, here we're going to execute only Regression by excluding if it's contain smoke in it (test 2 has smoke and reg)
//hence it will be ignored. In normal case test 2 method also get executed for regression group

//excludeexample is the suite file for this

public class test1 {
	
	@Test(groups="Regression")
	public void Login()
	{
		Reporter.log("Login Method", true);
	}
	
	@Test(groups="Smoke")
	public void Logout()
	{
		Reporter.log("Logout Method", true);
	}

}
