package _TestNG;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.Test;

public class TestNG_AssertMethod {
	@Test
	public static void testLoginPage() {
		WebDriver driver = new ChromeDriver();
		driver.get("http://localhost/login.do");
		String eTitle = "actiTIME - Loin";
		String aTitle = driver.getTitle();
		Assert.assertEquals(aTitle, eTitle); //If Comparison Failed, Assert Wont allow to further execution
		//inorder to avoid we have to use SoftAssert
		driver.findElement(By.xpath("//input[@id='username']")).sendKeys("admin");
		driver.findElement(By.xpath("//input[@name='pwd']")).sendKeys("manager");
		driver.findElement(By.xpath("//a[@id='loginButton']")).click();

	}

}
