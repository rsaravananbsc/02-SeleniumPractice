package _TestNG;

import org.testng.Reporter;
import org.testng.annotations.Test;

public class SampleforTestNG {

	//Multiple TestMethods
	
	//Default order of Execution: Alphabetical Order (always)
	//Priority can Decide which TestMethod needs to run in a Order.
	//Default Priority is 0
	//Multiple Methods have same Priority, and those methods will execute in Alphabetical Order.
	//Priority can be Negative but it cant be Decimal, Variables.
	
	@Test(priority=-1) //Negative value is accepted 
	public void RegisterUser()
	{
		Reporter.log("User Registered");
	}
	
	@Test(priority=0) //Default Priority is 0
	public void DeleteUser()
	{
		Reporter.log("User Deleted");
	}
	
	
}
