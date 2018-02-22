package _LocatorConcept;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class XpathSelector2
{
	static 
	{
		System.setProperty("webdriver.chrome.driver", "./Drivers/chromedriver.exe");
	}
	public static void main(String[] args) throws InterruptedException 
	{	
		WebDriver driver = new ChromeDriver();
		driver.get("http://localhost/login.do");
		//Xpath by Attributes Method.
		driver.findElement(By.xpath("//input[@id='username']")).sendKeys("admin");
		driver.findElement(By.xpath("//input[@name='pwd']")).sendKeys("manage");
		
		//Xpath by TextValue Method.
		driver.findElement(By.xpath("//div[text()='Login']")).click();
		
		//Xpath by Contains Method
		driver.findElement(By.xpath("//nobr[contains(text(),'actiTIME')]")).click();
		driver.findElement(By.xpath("//img[contains(@src,'timer')]")).click();
		driver.findElement(By.xpath("//span[contains(text(),'invaild')]")).click();
		driver.findElement(By.xpath("//span[contains(text(),build')]")).click();
		
	}
}
