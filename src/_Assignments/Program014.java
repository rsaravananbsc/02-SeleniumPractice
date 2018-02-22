package _Assignments;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Program014 {

	public static void main(String[] args) 
	{
		WebDriver driver = new ChromeDriver();
		driver.get("http://facebook.com");
		
		driver.findElement(By.id("email")).sendKeys("rsaravananbsc@gmail.com");
		driver.findElement(By.id("pass")).sendKeys("test@123");
		driver.findElement(By.id("loginbutton")).click();
		
		if (driver.findElement(By.xpath("//a[contains(text(),'Forgotten password?')]")).isDisplayed()) 
		{
			System.out.println("Invalid Login is Success");
			driver.close();
		} else {
			System.out.println("Invalid Login is Failure");
			driver.close();
		}

	}

}
