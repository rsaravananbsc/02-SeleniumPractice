package _ActionClass_Concept;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class Composite_Action {

	public static void main(String[] args) 
	{
		//Performing multiple actions in same time is CompositeAction.
		//We use Build().Perform() on Actions Class
		WebDriver driver = new ChromeDriver();
		driver.get("http://localhost/login.do");
		
		WebElement link = driver.findElement(By.linkText("actiTIME Inc."));
		
//		link.clear(); // This Direct click is having Focus Recently Opened Tab.
		
		Actions action = new Actions(driver);
		action.sendKeys(Keys.CONTROL).click(link).build().perform(); //Older Concept Separate 2 methods
		action.sendKeys(Keys.CONTROL).click(link).perform(); //Perform method internally calls Build().

	}

}
