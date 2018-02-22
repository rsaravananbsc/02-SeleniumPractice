package _WebElements_Methods;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class _getText_1 {

	public static void main(String[] args) 
	{
		WebDriver driver = new ChromeDriver();
		driver.get("http://www.seleniumhq.org/download/");
		WebElement element = driver.findElement(By.xpath("//td[text()='Ruby']/../td[2]"));
		
		System.out.println(element.getText());
		
		if (element.getText().contains("")) {
			System.out.println("FAIL: Ruby Version is not Present");
		} else {
			System.out.println("PASS: Ruby Version is Present");
		}

	}

}
