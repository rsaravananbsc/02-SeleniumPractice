package _LocatorConcept;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class XpathSelector3
{
	static 
	{
		System.setProperty("webdriver.chrome.driver", "./Drivers/chromedriver.exe");
	}
	public static void main(String[] args) throws InterruptedException 
	{	
		WebDriver driver = new ChromeDriver();
		driver.get("file:///C:/Users/S0070155/Desktop/Java%20&%20Selenium/HTML%20Pages/LocatorConcept1.html");
		
		//Xpath AXES of Special word used for traversing(navigating from one element to another element) 
		//following are the important AXES
		//1.Child
			driver.findElement(By.xpath("child::html"));
			//or
			driver.findElement(By.xpath("/html"));
		
		//2.Descendant 
			//driver.findElement(By.xpath("decendant::select"));
			//or
			//driver.findElement(By.xpath("//select"));
			
		//3.Parent
			driver.findElement(By.xpath("//option[text()='Idly']/parent::select")).click();
			//or
			driver.findElement(By.xpath("//option[text()='Idly']/..")).click();
		
			//4.Ancestor
			driver.findElement(By.xpath("//select/ancestor::html"));
			
		//5.Following-sibling
			driver.findElement(By.xpath("//option[.='Dosa']/following-sibling::option")).click();
			driver.findElement(By.xpath("//option[.='Dosa']/following-sibling::option[1]")).click();
			driver.findElement(By.xpath("//option[.='Dosa']/following-sibling::option[1+1]")).click();
			driver.findElement(By.xpath("//option[.='Dosa']/following-sibling::option[last()]")).click();
			driver.findElement(By.xpath("//option[.='Dosa']/following-sibling::option[last()-1]")).click();
			
		//6.Preceding-sibling
			driver.findElement(By.xpath("//option[.='Dosa']/preceding-sibling::option")).click();
			driver.findElement(By.xpath("//option[.='Dosa']/preceding-sibling::option[1]")).click();
			driver.findElement(By.xpath("//option[.='Dosa']/preceding-sibling::option[1+1]")).click();
			driver.findElement(By.xpath("//option[.='Dosa']/preceding-sibling::option[last()]")).click();
			driver.findElement(By.xpath("//option[.='Dosa']/preceding-sibling::option[last()-1]")).click();
		
		
	}
}
