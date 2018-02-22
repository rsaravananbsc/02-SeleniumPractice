package _TestPackage;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Myntra {

	public static void main(String[] args) 
	{
		WebDriver driver = new ChromeDriver();
		
		driver.get("https://www.myntra.com/men-tshirts?src=tNav");
		
		System.out.println(driver.findElement(By.xpath("//span[@class='product-strike']")));

	}

}
