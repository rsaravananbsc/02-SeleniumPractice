package _ActionClass_Concept;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class Mouse_Hover3
{
	
	public static void main(String[] args) throws InterruptedException
	{
		WebDriver driver = new ChromeDriver();
		driver.get("http://istqb.in/");
		WebElement foundation = driver.findElement(By.xpath("//span[.='FOUNDATION']"));
		WebElement enrollment = driver.findElement(By.xpath("//a[@id='menu775']"));
		WebElement corporateenrollment = driver.findElement(By.xpath("//a[@id='menu777']"));
		Actions actions = new Actions(driver);
		Thread.sleep(2000);
		actions.moveToElement(foundation).build().perform();
		Thread.sleep(2000);
		actions.moveToElement(enrollment).build().perform();
		Thread.sleep(2000);
		actions.moveToElement(corporateenrollment).build().perform();
		Thread.sleep(1000);
		driver.findElement(By.xpath("//a[.='ONLINE ENROLLMENT']")).click();
		
		
	}
}
