package _WebElements_Methods;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class _isDisplayed_isEnabled{

	public static void main(String[] args) 
	{
		WebDriver driver = new ChromeDriver();
		driver.get("http://localhost:8080/login.do");
		
		WebElement element = driver.findElement(By.xpath("//input[@id='username']"));
		if (element.isDisplayed()) {
			System.out.println("PASS: Object is Displayed");
		} else {
			System.out.println("FAIL: Object is NOT Displayed");
		}
		
		if (element.isEnabled()) {
			System.out.println("PASS: Object is Enabled");
		} else {
			System.out.println("FAIL: Object is NOT Enabled");
		}
	}

}
