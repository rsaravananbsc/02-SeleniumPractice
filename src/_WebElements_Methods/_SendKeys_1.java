package _WebElements_Methods;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class _SendKeys_1 {

	public static void main(String[] args) 
	{
//		WebDriver driver = new ChromeDriver();
//		driver.get("https://demo.vtiger.com/");
//		driver.findElement(By.id("username")).clear();
//		driver.findElement(By.id("username")).sendKeys("SARAVANAN");
//		(OR)
		WebDriver driver = new ChromeDriver();
		driver.get("https://demo.vtiger.com/");
		driver.findElement(By.id("username"));		
	}

}
