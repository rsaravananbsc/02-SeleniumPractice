package _Assignments;

import org.openqa.selenium.By;
import org.openqa.selenium.Dimension;
import org.openqa.selenium.Point;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Program011 {

	public static void main(String[] args) 
	{
		WebDriver driver = new ChromeDriver();
		driver.get("http://localhost/login.do");
		
		WebElement element1 = driver.findElement(By.id("username"));
		Point location1 = element1.getLocation(); //Getting Location of an Element
		System.out.println("Location of UserName Element:"+location1);
		
		WebElement element2 = driver.findElement(By.name("pwd"));
		Point location2 = element2.getLocation(); //Getting Location of an Element
		System.out.println("Location of Password Element:"+location2);
		
		Dimension size1 = element1.getSize(); //Getting Size of an Element
		System.out.println("Size of UserName Element:"+size1);
		
		Dimension size2 = element2.getSize(); //Getting Size of an Element
		System.out.println("Size of Password Element:"+size2);
		
		driver.close();
		
	}

}
