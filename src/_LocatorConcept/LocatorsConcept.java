package _LocatorConcept;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class LocatorsConcept {

	public static void main(String[] args) throws InterruptedException 
	{
		WebDriver driver = new ChromeDriver();
		
		driver.get("C:\\Users\\S0070155\\Desktop\\Java & Selenium\\HTML Pages\\LocatorConcept.html");
		
		//Find Elements using TagName
		WebElement element1 = driver.findElement(By.tagName("a"));
		element1.click();
		driver.navigate().back();
		
		driver.findElement(By.tagName("a")).click();
		driver.navigate().back();
		Thread.sleep(2000);
		
		//Find Elements using ID
		WebElement element2 = driver.findElement(By.id("d1"));
		element2.clear();
		
		driver.findElement(By.id("d1")).click();
		driver.navigate().back();
		Thread.sleep(2000);
		
		//Find Elements using Name
		WebElement element3 = driver.findElement(By.name("n1"));
		element3.clear();
		
		driver.findElement(By.name("n1")).click();
		driver.navigate().back();
		Thread.sleep(2000);
		
		//Find Elements using ClassName
		WebElement element4 = driver.findElement(By.className("c1"));
		element4.clear();
		
		driver.findElement(By.className("c1")).click();
		driver.navigate().back();
		
		//Find Elements using LinkText
		WebElement element5 = driver.findElement(By.linkText("ActiTime"));
		element5.click();
				
		driver.findElement(By.linkText("http://localhost/login.do")).click();
		driver.navigate().back();
		
		//Find Elements using PartialLinkText
		WebElement element6 = driver.findElement(By.partialLinkText("tiTi"));
		element6.click();
						
		driver.findElement(By.linkText("http://localhost/login.do")).click();
		driver.navigate().back();
		
		
		//Find Elements using CssSelector
		
		driver.findElement(By.cssSelector("input[type='text']")).sendKeys("admin");
		Thread.sleep(2000);
		driver.findElement(By.cssSelector("input[type='password']")).sendKeys("manager");

	}

}
