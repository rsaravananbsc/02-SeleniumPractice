package _LocatorConcept;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class CSSSelector
{
	static
	{
		System.setProperty("webdriver.chrome.driver", "./Drivers/chromedriver.exe");
	}
	public static void main(String[] args) throws InterruptedException 
	{
		
		System.out.println("HI");
		WebDriver driver = new ChromeDriver();
		driver.get("C:\\Users\\S0070155\\Desktop\\Java & Selenium\\HTML Pages\\LocatorConcept.html");
		driver.findElement(By.cssSelector("a[id='d1']")).click();
		Thread.sleep(1000);
		driver.navigate().back();
		Thread.sleep(1000);
		driver.findElement(By.cssSelector("a#d1")).click();
		Thread.sleep(1000);
		driver.navigate().back();
		Thread.sleep(1000);
		driver.findElement(By.cssSelector("a[name='n1']")).click();
		Thread.sleep(1000);
		driver.navigate().back();
		Thread.sleep(1000);
		driver.findElement(By.cssSelector("a[class= 'c1']")).click();
		Thread.sleep(1000);
		driver.navigate().back();
		Thread.sleep(1000);
		driver.findElement(By.cssSelector("a.c1")).click();
		Thread.sleep(1000);
		driver.navigate().back();
		Thread.sleep(1000);
//		#String str = "a[href='https://www.google.com']";
//		#driver.findElement(By.cssSelector(str)).click();
//		#driver.navigate().back();
//		#driver.findElement(By.partialLinkText("gle"));
		driver.close();
		
	}
}
