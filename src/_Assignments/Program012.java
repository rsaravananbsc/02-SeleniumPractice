package _Assignments;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Program012 
{
	public static void main(String[] args)
	{
		WebDriver driver = new ChromeDriver();
		driver.get("http://localhost/login.do");
		
		WebElement element1 = driver.findElement(By.id("username"));
		int x1 = element1.getLocation().getX();
		
		@SuppressWarnings("unused")
		WebElement element2 = driver.findElement(By.name("pwd"));
		int x2 = element1.getLocation().getX();
		
		if (x1==x2) {
			System.out.println("Username & Password Fields are Alligned Horizontally");
		} else {
			System.out.println("Username & Password Fields are NOT Alligned Horizontally");
		}
		
		driver.close();

	}

}
