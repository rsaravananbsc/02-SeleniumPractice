package _TestNG;

import org.testng.Reporter;
import org.testng.annotations.Test;

public class TestNG_DependsOn {

	@Test(priority=2)
	public void registerUser()
	{
		Reporter.log("User Registered",true);
//		Assert.fail();//Here Assert.Fail() will stop only this Testmethod
	}
	
	@Test(dependsOnMethods="registerUser")
	public void deleteUser()
	{
		Reporter.log("User Deleted",true);
	}
	
	@Test(priority=1)
	public void LoginPage()
	{
		Reporter.log("Login Successful",true);
	}
}
