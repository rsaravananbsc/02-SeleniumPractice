package _Assignments;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Program006 {

	public static void main(String[] args) 
	{
		WebDriver driver = new ChromeDriver();
		driver.get("https://google.com");
		WebElement element = driver.findElement(By.xpath("//img[@alt='Google']"));	
		if(element.getTagName().contains("img"))
			System.out.println("Fetched Tag is IMG TAG");
		else
			System.out.println("Fetched Tag is NOT a IMG TAG");

	}

}
