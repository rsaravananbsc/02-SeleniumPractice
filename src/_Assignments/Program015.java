package _Assignments;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Program015 {

	public static void main(String[] args) 
	{
		WebDriver driver = new ChromeDriver();
		driver.get("http://localhost/login.do");
		
		driver.findElement(By.xpath("//div[text()='Login ']")).click();
				
		if (driver.findElement(By.xpath("//span[contains(text(),'invalid')]")).isDisplayed()) 
		{
			System.out.println("Invalid Login is Success");
			driver.close();
		} else {
			System.out.println("Invalid Login is Failure");
			driver.close();
		}
	}

}
