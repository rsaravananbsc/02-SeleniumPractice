package _TestNG_ProductsUsers;

import org.testng.Reporter;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;

public class BaseTest {
	
	@BeforeMethod(alwaysRun=true)
	public static void login()
	{
		Reporter.log("Login",true);
	}
	
	@AfterMethod(alwaysRun=true)
	public static void logout()
	{
		Reporter.log("Logout",true);
	}
	
	
}	
