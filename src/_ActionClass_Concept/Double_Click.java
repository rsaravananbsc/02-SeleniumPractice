package _ActionClass_Concept;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class Double_Click 
{
	public static void main(String[] args)
	{
		WebDriver driver = new ChromeDriver();
		driver.get("http://localhost/login.do");
				
		WebElement link = driver.findElement(By.linkText("actiTIME Inc."));
				
		Actions action = new Actions(driver);
		action.doubleClick(link).perform();
		
		
	}

}
