package _TestPackage;

import java.awt.AWTException;
import java.awt.Robot;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class Test {

	public static void main(String[] args) throws InterruptedException, AWTException 
	{
		WebDriver driver = new ChromeDriver();
//		driver.get("http://localhost/login.do");
//		
//		WebElement element = driver.findElement(By.xpath("//a[@id='licenseLink']"));
//		System.out.println(element.getText());
		
		driver.get("https://demo.vtiger.com/");
		
//		WebElement element = driver.findElement(By.id("password"));
//		System.out.println(element.getAttribute("value"));
		
		WebElement element = driver.findElement(By.id("password"));
//		element.sendKeys(Keys.CONTROL+"a");
//		element.sendKeys(Keys.DELETE);
//		
//		Thread.sleep(3000);
//		
//		element.sendKeys(Keys.TAB);
//		
//		Thread.sleep(3000);
		element.sendKeys(Keys.CONTROL+"a");
		Thread.sleep(4000);
		element.sendKeys(Keys.DELETE);
	}
}
