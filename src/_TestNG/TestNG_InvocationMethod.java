package _TestNG;

import org.testng.Reporter;
import org.testng.annotations.Test;

public class TestNG_InvocationMethod {
	
	@Test(invocationCount=3) // 3 means 3Times this test will executes. 0 Zero means it dont run test methods. 
	//Negative values not support. Decimal & variables are not allowed.
	public static void createUser()
	{
		Reporter.log("User Created", true);
	}
	
	//We use Invocation Count to repeat the Task only when Input is not mandatory and repeat a task multiple times.
	//Ex: Gamil 50 present and need to delete where first mail from input and we use invocation count as 50 times.
}
