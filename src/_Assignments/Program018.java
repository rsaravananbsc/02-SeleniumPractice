package _Assignments;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Program018 
{
	public static void main(String[] args) throws InterruptedException 
	{
		WebDriver driver = new ChromeDriver();
		@SuppressWarnings("unused")
		JavascriptExecutor j = (JavascriptExecutor)driver;
		driver.get("http://localhost/license.jsp");		
		WebElement element = driver.findElement(By.xpath("//h2[.='9. Indemnification']"));
		
		int x = element.getLocation().getX();
		System.out.println("X :"+x);
		int y = element.getLocation().getY();
		System.out.println("Y :"+y);				
		Thread.sleep(3000);
		scrollUpDown(driver, x, y);
		
		driver.close();
	}

	private static void scrollUpDown(WebDriver driver, int x, int y) 
	{
		JavascriptExecutor j = (JavascriptExecutor)driver;
		j.executeScript("window.scrollBy("+x +","+y+");"); //Scrolling to Specific Object Location 	
	}

}
