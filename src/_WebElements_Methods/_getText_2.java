package _WebElements_Methods;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class _getText_2 {

	public static void main(String[] args) 
	{
		WebDriver driver = new ChromeDriver();
		driver.get("https://demo.vtiger.com/");
		WebElement element = driver.findElement(By.xpath("//input[@id='username' and @value='admin']"));
		String str = element.getText();
		System.out.println(str);

	}

}
