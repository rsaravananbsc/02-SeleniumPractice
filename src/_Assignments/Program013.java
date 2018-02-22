package _Assignments;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Program013 {

	public static void main(String[] args)
	{
		WebDriver driver = new ChromeDriver();
		driver.get("https://facebook.com");
		
		int size1 = driver.findElement(By.id("email")).getLocation().getY();
		int size2 = driver.findElement(By.id("pass")).getLocation().getY();
		
		System.out.println(size1);
		System.out.println(size2);
		
		if (size1==size2) {
			System.out.println("Username & Password Fields are Alligned Veritically");
		} else {
			System.out.println("Username & Password Fields are NOT Alligned Veritically");
		}
		
		driver.close();

	}

}
