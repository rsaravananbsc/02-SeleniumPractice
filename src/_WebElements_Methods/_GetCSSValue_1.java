package _WebElements_Methods;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.Color;

public class _GetCSSValue_1 {

	public static void main(String[] args) throws InterruptedException 
	{
		WebDriver driver = new ChromeDriver();
		driver.get("http://localhost:8080/login.do");
		driver.findElement(By.xpath("//a[@id='loginButton']")).click();
		Thread.sleep(2000);
		WebElement element = driver.findElement(By.xpath("//span[contains(.,'invalid')]"));
		String clr = element.getCssValue("color");
		System.out.println(clr);
						
		String clrhexa = Color.fromString(clr).asHex();
		System.out.println(clrhexa);		
	}

}
