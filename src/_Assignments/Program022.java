package _Assignments;

import org.openqa.selenium.By;
import org.openqa.selenium.Dimension;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Program022 {

	public static void main(String[] args) 
	{
		WebDriver driver = new ChromeDriver();
		driver.get("https://facebook.com");
		
		 Dimension size1 = driver.findElement(By.id("email")).getSize();
		 Dimension size2 = driver.findElement(By.id("pass")).getSize();
		
		System.out.println(size1);
		System.out.println(size2);
		
		if (size1.equals(size2)) {
			System.out.println("Username & Password Fields are Alligned Veritically");
		} else {
			System.out.println("Username & Password Fields are NOT Alligned Veritically");
		}
		
		driver.close();

	}

}
