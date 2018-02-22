package _TestNG;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.Reporter;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

public class TestNG_ParallelBrowserTest {

	@Parameters({"browser"})
	
	@Test
	public static void browserTest(String b)
	{
		WebDriver driver;
		
		if(b.equals("chrome")) {
			driver = new ChromeDriver();
		}
		else {
			driver = new FirefoxDriver();
		}
		
		driver.get("http://localhost/login.do");
		
		for (int i = 0; i < 100; i++) {
			driver.findElement(By.id("username")).clear();
			driver.findElement(By.id("username")).sendKeys("admin");
		}
		
		driver.close();
	}
}
