package _WebElements_Methods;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class _IsSelected_1 {

	public static void main(String[] args) 
	{
		WebDriver driver = new ChromeDriver();
		driver.get("https://facebook.com");
		
		WebElement rdobtn = driver.findElement(By.xpath("//input[@type='radio']"));
		rdobtn.click();
		
		if (rdobtn.isSelected())
			System.out.println("PASS: Selected");
		else
		System.out.println("FAIL: Not Selected");
	
	}

}
