package _TestNG;

import org.testng.Reporter;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;

public class DemoB1 {
	@BeforeMethod
	public void Login()
	{
		Reporter.log("Login",true);
	}
	
	@AfterMethod
	public void Logout()
	{
		Reporter.log("Logout",true);
	}
}
