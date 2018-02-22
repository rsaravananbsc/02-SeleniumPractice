package _Assignments;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Program010 
{
	public static void main(String[] args) 
	{
		WebDriver driver = new ChromeDriver();
		driver.get("https://demo.vtiger.com/");
		WebElement element = driver.findElement(By.id("username"));
		element.sendKeys("Saravanan");
		element.sendKeys(Keys.CONTROL+"a");
		element.sendKeys(Keys.CONTROL+"c");
		driver.findElement(By.name("password")).sendKeys(Keys.CONTROL+"v");
		String v = element.getAttribute("value");
		System.out.println(v);
		driver.close();
	}
}
