package _Assignments;

import java.util.Date;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.Color;

public class Program016 
{
	public static void main(String[] args) throws InterruptedException 
	{
		WebDriver driver = new ChromeDriver();
		driver.get("http://localhost/login.do");
		verifyTittle(driver, "actiTIME - Login");
		driver.findElement(By.id("username")).sendKeys("admin");
		driver.findElement(By.name("pwd")).sendKeys("manager");
		driver.findElement(By.xpath("//div[.='Login ']")).click();
		verifyTittle(driver, "actiTIME - Enter Time-Track");
		Thread.sleep(2000);
		driver.findElement(By.xpath("//a[@class='content tasks']")).click();
		verifyTittle(driver, "actiTIME - Task List");
		driver.findElement(By.xpath("//div[.='Add New']")).click();
		driver.findElement(By.xpath("//div[.='+ New Customer']")).click();	
		verifyElement(driver, By.xpath("//span[contains(.,'New')]"));
		Thread.sleep(2000);
		String cname= new Date().toString().replaceAll(":", "'").replaceAll("", "");
		driver.findElement(By.xpath("//input[@id='customerLightBox_nameField']")).sendKeys("Rocky");
		driver.findElement(By.xpath("//textarea[@id='customerLightBox_descriptionField']")).sendKeys("gtfghgvgcfbhvbggv");
		driver.findElement(By.xpath("//span[.='Create Customer']")).click();
		verifyElement(driver, By.xpath("//a[.='All Customers']"));
		System.out.println("Customer"+cname+"has been created");
		WebElement popup = driver.findElement(By.xpath("//*[contains(.,'has been ')]"));
		String rgb = popup.getCssValue("color");
		System.out.println(rgb);
		String hex = Color.fromString(rgb).asHex();
		System.out.println(hex);	
		Thread.sleep(5000);
		driver.findElement(By.id("logoutLink")).click();
		driver.close();
	}
	public static void verifyElement(WebDriver driver , By b)
	{
		try 
		{
			@SuppressWarnings("unused")
			WebElement element = driver.findElement(b);
			System.out.println("Pass: Element is present ");
		}
		catch (Exception e) 
		{
			System.out.println("Fail: Element is not present ");
		}
	}
	public static void verifyTittle(WebDriver driver , String eTittle)
	{
		System.out.println(eTittle);
		String aTittle = driver.getTitle();
		System.out.println(aTittle);
		if (aTittle.equals(eTittle))
		{
			System.out.println("Pass: Page is displayed ");
		} 
		else 
		{
			System.out.println("Fail: Page is not displayed ");
		}
	}
}
