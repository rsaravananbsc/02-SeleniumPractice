package _LaunchingBroswerConcepts;

import org.openqa.selenium.chrome.ChromeDriver;

public class Program2 
{
	static
	{
		System.setProperty("WebDriver.chrome.driver", ".//Drivers//chromedriver.exe");
	}
	
	public static void main(String[] args) 
	{
//		Program2.set();
		ChromeDriver driver = new ChromeDriver();
		driver.close();	
	}

//	private static void set() 
//	{	
//		System.setProperty("WebDriver.chrome.driver", ".//Drivers//chromedriver.exe");
//	}
}
