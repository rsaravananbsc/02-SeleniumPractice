package _TestNG_ProductsUsers;

import org.testng.annotations.Test;
import org.testng.annotations.Test;
import org.testng.Reporter;

public class Users extends BaseTest {

	@Test(groups={"USER","SMOKETEST"})
	public static void CreateUser()
	{
		Reporter.log("User Created",true);
	}
	
	@Test(groups= {"USER,","NEGATIVETEST"}) 
	public static void DeleteUser()
	{
		Reporter.log("User Deleted",true);
	}
	
	@Test(groups= {"SUPERUSER"},enabled=false)
	public static void ModifyUser()
	{
		Reporter.log("User Modified",true);
	}
	
	@Test 
	public static void UpdateUser()
	{
		Reporter.log("User Updated",true);
	}
	
	@Test
	public static void CopyUser()
	{
		Reporter.log("User Copied",true);
	}
}
