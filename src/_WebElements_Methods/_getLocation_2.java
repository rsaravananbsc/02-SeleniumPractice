package _WebElements_Methods;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class _getLocation_2 {

	public static void main(String[] args) 
	{
		WebDriver driver = new ChromeDriver();
		driver.get("http://localhost:8080/login.do");
		WebElement element1 = driver.findElement(By.id("username"));
		WebElement element2 = driver.findElement(By.name("pwd"));
		
		int x1 = element1.getLocation().getX();
		int x2 = element2.getLocation().getX();
		
		if (x1==x2)
			System.out.println("PASS: Username & Password are in Same Allignment");
		else
			System.out.println("FAIL: Username & Password are Not in Same Allignment");

	}

}
