package _TestNG;

import org.testng.Reporter;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

public class TestNG_DataProvider {

	//In DataProvider Iteration of TestMethods depends on No of Rows of 2 Dimensional Array.
	//Where Parameter depends on No of Columns of 2 Dimensional Array
	@DataProvider
	public Object[][] getData()
	{
		Object[][] a = new Object[2][3];
		a[0][0] = "admin";
		a[0][1] = "admin123";
		a[0][2] = 12345;
		
		
		a[1][0] = "manager";
		a[1][1] = "manager123";
		a[1][2] = 1234;
	
		return a;
	}
	
	@Test(dataProvider="getData")
	public void CreateUser(String s1, String s2, int i1)
	{
		Reporter.log(s1+ " "+s2 +" " +"i1", true);
	}
		
}
