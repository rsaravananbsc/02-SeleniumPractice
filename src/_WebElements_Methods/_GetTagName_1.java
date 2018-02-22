package _WebElements_Methods;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class _GetTagName_1 
{
	public static void main(String[] args) 
	{
		WebDriver driver = new ChromeDriver();
		driver.get("http://localhost/login.do");
		WebElement element = driver.findElement(By.xpath("//a[text()='View License']"));
		if (element.getTagName().contains("a")) {
			System.out.println("View License is a LINK TAG");
		} else {
			System.out.println("View License is NOT a LINK TAG");
		}
	}
}
