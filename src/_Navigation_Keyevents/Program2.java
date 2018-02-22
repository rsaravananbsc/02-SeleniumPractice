package _Navigation_Keyevents;

import org.openqa.selenium.WebDriver.Navigation;
import org.openqa.selenium.chrome.ChromeDriver;

public class Program2 {

	public static void main(String[] args) throws InterruptedException 
	{
		ChromeDriver driver = new ChromeDriver();
		driver.get("http:// localhost/login.do");
		
//		Navigation n = driver.navigate();
//		n.to("http://localhost/license.jsp");

		Thread.sleep(4000);
		driver.navigate().to("https://yahoo.com");
		driver.navigate().back();
		driver.navigate().forward();
		driver.navigate().refresh();
		
		

	}

}