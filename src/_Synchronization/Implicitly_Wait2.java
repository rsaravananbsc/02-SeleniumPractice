package _Synchronization;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.TimeoutException;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Implicitly_Wait2  {

	public static void main(String[] args) {
		WebDriver driver = new ChromeDriver();
		
		//How to Verify Page Loaded or Not in 10 Seconds
		
		driver.manage().timeouts().pageLoadTimeout(10, TimeUnit.SECONDS);
		
		try {
			driver.get("https://demo.actitime.com");
			System.out.println("Page Loaded with in 10 Secs");
		} catch (TimeoutException e) {
			System.out.println("Page Did not Loaded with in 10 Secs");
		}
	}

}
