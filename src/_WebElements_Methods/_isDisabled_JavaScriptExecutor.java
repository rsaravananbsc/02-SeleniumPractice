package _WebElements_Methods;

import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class _isDisabled_JavaScriptExecutor {

	public static void main(String[] args) throws InterruptedException 
	{
		WebDriver driver = new ChromeDriver();
		driver.get("file:///C:/Users/S0070155/Desktop/Java%20&%20Selenium/HTML%20Pages/Disable.html");
		
		//Alternate for SendKeys
		String myJS1 = "document.getElementById('i2').value='ADMIN';";
		JavascriptExecutor j1 = (JavascriptExecutor)driver;
		j1.executeScript(myJS1);
		
		Thread.sleep(2000);
		//Alternate for Clear
		String myJS2 = "document.getElementById('i2').value='';";
		JavascriptExecutor j2 = (JavascriptExecutor)driver;
		j2.executeScript(myJS2);
		
		Thread.sleep(2000);
		//Alternate for Click
		String myJS3 = "document.getElementById('i2').click();";
		JavascriptExecutor j3 = (JavascriptExecutor)driver;
		j3.executeScript(myJS3);
		
		driver.close();
	
	}

}
