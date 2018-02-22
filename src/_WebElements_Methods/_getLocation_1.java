package _WebElements_Methods;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class _getLocation_1 {

	public static void main(String[] args) 
	{
		WebDriver driver = new ChromeDriver();
		driver.get("http://localhost:8080/login.do");
		WebElement element = driver.findElement(By.id("username"));
		
		int x = element.getLocation().getX();
		int y = element.getLocation().getY();
		System.out.println("Username Element Position "+x +"," +y);
		
		int h = element.getSize().getHeight();
		int w = element.getSize().getWidth();
		System.out.println("Username Element Size "+h +"," +w);
		

	}

}
