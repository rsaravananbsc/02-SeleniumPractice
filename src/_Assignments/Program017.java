package _Assignments;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.Color;

public class Program017 {

	public static void main(String[] args) 
	{
		WebDriver driver = new ChromeDriver();
		driver.get("http://localhost/login.do");
		
		driver.findElement(By.xpath("//div[text()='Login ']")).click();	
			
		WebElement element = driver.findElement(By.xpath("//span[contains(.,'invalid')]"));
		String clr = element.getCssValue("color");
		System.out.println(clr);
						
		String clrhexa = Color.fromString(clr).asHex();
		System.out.println(clrhexa);
		
		driver.close();
		

	}

}
