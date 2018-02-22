package _WebElements_Methods;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class _getAttributes_1 
{
	public static void main(String[] args) 
	{
		WebDriver driver = new ChromeDriver();
		driver.get("http://localhost:8080/login.do");
		
		WebElement element = driver.findElement(By.xpath("//input[@id='username']"));
		
		System.out.println("ID:"+element.getAttribute("id"));
		System.out.println("TYPE:"+element.getAttribute("type"));
		System.out.println("NAME:"+element.getAttribute("name"));
		System.out.println("VALUE:"+element.getAttribute("value"));
		System.out.println("CLASS:"+element.getAttribute("class"));
		System.out.println("PLACE HODLER:"+element.getAttribute("placeholder"));
		
		driver.close();
		
		
		
		
	}
}
