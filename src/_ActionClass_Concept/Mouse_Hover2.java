package _ActionClass_Concept;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class Mouse_Hover2 {

	public static void main(String[] args) throws InterruptedException 
	{
		WebDriver driver = new ChromeDriver();
		driver.get("http://www.istqb.in/");
		
		WebElement element = driver.findElement(By.xpath("//span[text()='ABOUT US']"));
		
		Actions action = new Actions(driver);
		
		action.moveToElement(element).perform();
		
		driver.findElement(By.xpath("//span[text()='ABOUT ITB']")).click();
		
	}

}
