package _ActionClass_Concept;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class Mouse_Hover {

	public static void main(String[] args) 
	{
		WebDriver driver = new ChromeDriver();
		driver.get("https://actitime.com");
		
		WebElement element = driver.findElement(By.xpath("//a[text()='Support']"));
			
		Actions actions = new Actions(driver);
		
		//Moving Cursor to Element
		actions.moveToElement(element).perform(); //Mouse Hover on Particular Element.
		
		//Click on SubMenu Options 
		driver.findElement(By.linkText("FAQ")).click();
		
		//Actions class has parameterized constructor, takes an arg of type WebDriver
		//Whenever we call any method of actions class we must use perform.
		
	}

}
