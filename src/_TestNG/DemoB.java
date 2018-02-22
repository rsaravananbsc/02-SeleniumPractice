package _TestNG;

import org.testng.Reporter;
import org.testng.annotations.Test;

public class DemoB {
	@Test
	public void testB()
	{
	  Reporter.log("Hi, I am DemoB",true); //Here True Means Msg will prints at Console as well as HTML, False Means only on HTML.
	}
}
