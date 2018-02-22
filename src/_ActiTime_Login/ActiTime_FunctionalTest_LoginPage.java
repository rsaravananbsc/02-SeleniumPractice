package _ActiTime_Login;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class ActiTime_FunctionalTest_LoginPage {

	public static void main(String[] args) 
	{
		WebDriver driver = new ChromeDriver();
		driver.get("http://localhost/login.do");
		
		verifyTitle(driver, "actiTIME - Login");
		driver.findElement(By.xpath("//input[@id='username']")).sendKeys("admin");
		driver.findElement(By.xpath("//input[@name='pwd']")).sendKeys("manager");
		driver.findElement(By.xpath("//a[@id='loginButton']")).click();
		
		try {
			Thread.sleep(2000);
		} catch (Exception e) {
			// TODO: handle exception
		}
		
		verifyElement(driver, By.xpath("//span[contains(text(),''invalid'))"));
		driver.close();
		
	}

	static void verifyElement(WebDriver driver, By b) 
	{
		try {
			WebElement element = driver.findElement(b);
			System.out.println("PASS: Element is Present");
			if (element.isDisplayed()) {
				System.out.println("PASS: Element is Displayed");
			} else {
				System.out.println("PASS: Element is NOT Displayed");
			}
		} catch (Exception e) {
			System.out.println("PASS: Element is NOT Present");
		}	
	}
	
	static void verifyTitle(WebDriver driver, String eTitle) 
	{
		try {
			System.out.println("Expected Page:"+eTitle);
			String aTitle=driver.getTitle();
			System.out.println("Actual Page:"+aTitle);
			if(aTitle.equals(eTitle))
			{
				System.out.println("PASS: Expected Page is Displayed");
			}
			else
			{
				System.out.println("FAIL: Expected Page Not is Displayed");
			}
			
		} catch (Exception e) {
			// TODO: handle exception
		}
		
	}
	
}
