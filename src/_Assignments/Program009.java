package _Assignments;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Program009 {

	public static void main(String[] args) 
	{
//		WebDriver driver = new ChromeDriver();
//		driver.get("https://demo.vtiger.com/");
//		driver.findElement(By.id("username")).clear();
//		driver.findElement(By.id("username")).sendKeys("SARAVANAN");
//		(OR)
		WebDriver driver1 = new ChromeDriver();
		driver1.get("https://demo.vtiger.com/");
		driver1.findElement(By.id("username"));	

	}

}
