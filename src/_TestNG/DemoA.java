package _TestNG;

import org.testng.Reporter;
import org.testng.annotations.Test;

public class DemoA {
	@Test
	public void testA()
	{
	  Reporter.log("Hi, I am DemoA", true); //Here True Means Msg will prints at Console as well as HTML, False Means only on HTML.
	}
	
}
