package _FramesConcept;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class FramesSwitch_1 {

	public static void main(String[] args) 
	{
		WebDriver driver = new ChromeDriver();
		driver.get("file:///C:/Users/S0070155/Desktop/Java%20&%20Selenium/HTML%20Pages/DemoB.html");
		
		driver.findElement(By.id("t1")).sendKeys("QSP");
		driver.switchTo().frame(0).findElement(By.id("t2")).sendKeys("JSP");
		driver.switchTo().defaultContent().findElement(By.id("t1")).sendKeys("JSP");
		
		driver.switchTo().frame(0); //Switching to Frame using Index of Frames.
		driver.findElement(By.id("t1")).sendKeys("A");
		driver.switchTo().defaultContent();
		driver.findElement(By.id("t1")).sendKeys("B");
		
		driver.switchTo().frame("f1"); //Switching to Frame using ID of Frames.
		driver.findElement(By.id("t1")).sendKeys("A");
		driver.switchTo().defaultContent();
		driver.findElement(By.id("t1")).sendKeys("B");
		
		driver.switchTo().frame("n1"); //Switching to Frame using NAME of Frames.
		driver.findElement(By.id("t1")).sendKeys("A");
		driver.switchTo().defaultContent();
		driver.switchTo().parentFrame();
		driver.findElement(By.id("t1")).sendKeys("B");
		
		//Any Locators can use to Find the Frames if Frame does have those Attributes(ID,Class,Name and Reference)
		WebElement element = driver.findElement(By.id("f1")); // Switching to Frame using Reference/Address of Element.
		
		driver.switchTo().frame(element);
		driver.findElement(By.id("t1")).sendKeys("A");
		driver.switchTo().defaultContent();
		driver.findElement(By.id("t1")).sendKeys("B");
		
		
		
		
	
	}

}
