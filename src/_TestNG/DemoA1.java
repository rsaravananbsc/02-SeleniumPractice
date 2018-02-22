package _TestNG;

import org.testng.Reporter;
import org.testng.annotations.Test;

public class DemoA1 extends DemoB1 {

	@Test(priority=1)
	public void CreateUser()
	{
		Reporter.log("UserCreated",true);
	}
	
	@Test(priority=2)
	public void DeleteUser()
	{
		Reporter.log("UserDeleted",true);
	}
	
}
