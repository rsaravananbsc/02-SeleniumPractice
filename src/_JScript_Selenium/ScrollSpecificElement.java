package _JScript_Selenium;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class ScrollSpecificElement 
{
	public static void main(String[] args) throws InterruptedException 
	{
		WebDriver driver = new ChromeDriver();
		JavascriptExecutor j = (JavascriptExecutor)driver;
		driver.get("http://localhost/license.jsp");		
		WebElement element = driver.findElement(By.xpath("//h2[.='7. Termination']"));
		
		int x = element.getLocation().getX();
		System.out.println("X :"+x);
		int y = element.getLocation().getY();
		System.out.println("Y :"+y);				
		Thread.sleep(3000);
		scrollUpDown(driver, x, y);
	}

	private static void scrollUpDown(WebDriver driver, int x, int y) 
	{
		JavascriptExecutor j = (JavascriptExecutor)driver;
		j.executeScript("window.scrollBy("+x +","+y+");"); //Scrolling to Specific Object Location 	
		
		j.executeScript("window.scrollBy(0,document.body.scrollHeight)"); //Scrolling to End of webpage
	}
	
}
