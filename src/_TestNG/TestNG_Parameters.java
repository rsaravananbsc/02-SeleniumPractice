package _TestNG;

import org.testng.Reporter;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

public class TestNG_Parameters {

	@Parameters({"city","area"})
	
	@Test
	public static void getData(String x, String y)
	{
		Reporter.log(x +" " +y,true);
	}
}
