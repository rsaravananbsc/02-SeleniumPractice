package _MyWipro_ProjectTest;

import java.text.AttributedCharacterIterator.Attribute;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class MyWiproAutomationTest {

	public static void main(String[] args) 
	{
		//Open Browser
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		
		//Enter the URL 
		driver.get("https://mywipro.wipro.com/");

		driver.findElement(By.xpath("//span[text()='Wipro Limited']")).click();
		
		//Verify URL Page Display or Not
		try 
		{
			String eURL = "wipro.com";
			String aURL = driver.getCurrentUrl();
			if (aURL.contains(eURL)) 
			{
				System.out.println("LOGIN PAGE DISPLAY TEST: "+"PASS");
			}
			else
			{
				WebElement eElement = driver.findElement(By.xpath("//span[@id='submitButton']"));
				System.out.println("LOGIN PAGE DISPLAY TEST: "+"PASS");
			}
		} 
		catch (Exception e) 
		{
			
			System.out.println("LOGIN PAGE DISPLAY TEST: "+"FAIL");				
		}
		
		//Enter the UserName, Password and Click On Login Button 
		driver.findElement(By.xpath("//input[@id='userNameInput']")).sendKeys("S0070155@wipro.com");
		driver.findElement(By.xpath("//input[@id='passwordInput']")).sendKeys("Informatica@11");
		driver.findElement(By.xpath("//span[@id='submitButton']")).click();
		
		//Verify Home Page Display or Not Post Click LoginButton
		try 
		{
			String eHomeURL = "Home";
			String aHomeURL = driver.getCurrentUrl();
			if (aHomeURL.contains(eHomeURL)) 
			{
				System.out.println("HOME PAGE DISPLAY TEST: "+"PASS");
			}
			else
			{
				WebElement eElement = driver.findElement(By.xpath("//div[@id='logo1']"));
				System.out.println("HOME PAGE DISPLAY TEST: "+"PASS");
			}
		} 
		catch (Exception e) 
		{
			System.out.println("HOME PAGE DISPLAY TEST: "+"FAIL");				
		}
		
		//verify "APP STORE" Button Re-directing to AppStore WebPage or NOT
		
		driver.findElement(By.xpath("//a[@title='App Store']")).click();
		try 
		{
			String aAppStoreURL = driver.getCurrentUrl();
			String eAppStoreURL = "myAppStore";
			if (aAppStoreURL.contains(eAppStoreURL)) {
				System.out.println("APP STORE PAGE DISPLAY TEST: "+"PASS");
			}
		} catch (Exception e)
		{
			WebElement eElement = driver.findElement(By.xpath("//div[@class='app_header MYDATA']"));
			System.out.println("APP STORE PAGE DISPLAY TEST: "+"PASS");
		}
		
	}

}
