package _LaunchingBroswerConcepts;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class Program3 {

	public static void main(String[] args) 
	{
		System.getProperty("webdriver.chrome.driver", ".//Drivers//chromedriver.exe");
		ChromeDriver driver = new ChromeDriver();
		Program3.testBrowser(driver);
		
		System.getProperty("webdriver.firefox.driver", ".//Drivers//geckodriver.exe");
		FirefoxDriver driver1 = new FirefoxDriver();
		Program3.testBrowser(driver1);
	}

	private static void testBrowser(WebDriver driver) 
	{
		driver.get("https://www.facebook.com");
		String urltitle = driver.getTitle();
		System.out.println(urltitle);
		String currenturl = driver.getCurrentUrl();
		System.out.println(currenturl);
		driver.close();
		
	}

}
