package _TestNG;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.Test;
import org.testng.asserts.SoftAssert;

public class TestNG_AssertMethod1 {
	
	@Test
	public static void testLoginPage()
	{
		WebDriver driver = new ChromeDriver();
		driver.get("http://localhost/login.do");
		String eTitle = "actiTIME - Login";
		String aTitle = driver.getTitle();
		
		SoftAssert s = new SoftAssert(); //SoftAssert allows to further execution even TestMethod is Failed.
		s.assertEquals(aTitle, eTitle);
		
		driver.findElement(By.xpath("//input[@id='username']")).sendKeys("admin");
		driver.findElement(By.xpath("//input[@name='pwd']")).sendKeys("manager");
		driver.findElement(By.xpath("//a[@id='loginButton']")).click();
		
		s.assertAll();//Must user AsserAll() method to update the Test Results at the End.

	}

}
