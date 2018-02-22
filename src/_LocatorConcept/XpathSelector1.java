package _LocatorConcept;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class XpathSelector1
{
	static 
	{
		System.setProperty("webdriver.chrome.driver", "./Drivers/chromedriver.exe");
	}
	public static void main(String[] args) throws InterruptedException 
	{	
		WebDriver driver = new ChromeDriver();
		driver.get("http://localhost/login.do");
		//Xpath by Relative Xpath Attributes.
		driver.findElement(By.xpath("//input[@name='username']")).sendKeys("admin");
		driver.findElement(By.xpath("//input[@name='pwd']")).sendKeys("manager");
		driver.findElement(By.xpath("//img[@src='/img/default/login/timer.png?hash=1388610907']")).click();
		driver.findElement(By.xpath("//nobr[text()='actiTIME 2017.4']")).click();
		driver.findElement(By.xpath("//a[@id='licenseLink']")).click();
		driver.findElement(By.xpath("//input[@id='keepLoggedInCheckBox']")).click();
		driver.findElement(By.xpath("//a[@href='http://www.actitime.com']")).click();
		driver.findElement(By.xpath("//table//td[@id='headerContainer']")).click();
		driver.findElement(By.xpath("//a[@id='loginButton']")).click();
		
	}
}
