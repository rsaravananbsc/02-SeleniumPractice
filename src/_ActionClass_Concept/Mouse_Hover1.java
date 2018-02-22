package _ActionClass_Concept;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class Mouse_Hover1 {

	public static void main(String[] args) 
	{
		WebDriver driver = new ChromeDriver();
		driver.get("https://actitime.com");
		
		Actions action = new Actions(driver);
		
		WebElement element1 = driver.findElement(By.xpath("//a[text()='Purchase']"));
		int x = element1.getLocation().getX();
		int y = element1.getLocation().getY();
		
		action.moveToElement(element1, x, y).perform();

	}

}
