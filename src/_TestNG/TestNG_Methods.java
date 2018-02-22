package _TestNG;

import org.testng.Reporter;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.BeforeTest;

public class TestNG_Methods extends DemoA {
	
	//Flow of TestMethods
	@BeforeSuite
	public void BeforeSuite()
	{
		Reporter.log("BeforeSuite",true);
	}
	
	@BeforeTest
	public void BeforeTest()
	{
		Reporter.log("BeforeTest",true);
	}

	@BeforeClass
	public void BeforeClass()
	{
		Reporter.log("BeforeClass",true);
	}
	
	@BeforeMethod
	public void BeforeMethod()
	{
		Reporter.log("BeforeMethod",true);
	}
	
	//-------------------------------------
	
	@org.testng.annotations.AfterSuite
	public void AfterSuite()
	{
		Reporter.log("AfterSuite",true);
	}
	
	@org.testng.annotations.AfterTest
	public void AfterTest()
	{
		Reporter.log("AfterTest",true);
	}

	@org.testng.annotations.AfterClass
	public void AfterClass()
	{
		Reporter.log("AfterClass",true);
	}
	
	@org.testng.annotations.AfterMethod
	public void AfterMethod()
	{
		Reporter.log("AfterMethod",true);
	}
	
	
	//-------------------------------------------

}
