package _ActionClass_Concept;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class Drag_Drop {

	public static void main(String[] args) 
	{
		WebDriver driver = new ChromeDriver();
		driver.get("");
		
		WebElement blk1 = driver.findElement(By.xpath("//ht[.='Block 1']"));
		WebElement blk3 = driver.findElement(By.xpath("//ht[.='Block 3']"));
		
		Actions action = new Actions(driver);
		action.dragAndDrop(blk1, blk3);

	}

}
