package _TestPackage;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class DoubleClick
{
	
	public static void main(String[] args) throws Exception
	{
		WebDriver driver = new ChromeDriver();
		driver.get("https://drive.google.com/drive/my-drive");
		driver.findElement(By.xpath("//input[@id='identifierId']")).sendKeys("vsaurav4068");
		driver.findElement(By.xpath("//span[.='Next']")).click();
		Thread.sleep(2000);
		driver.findElement(By.xpath("//input[@class='whsOnd zHQkBf']")).sendKeys("8903140058");
		Thread.sleep(1000);
		driver.findElement(By.xpath("//span[.='Next']")).click();
		Thread.sleep(2000);
        driver.findElement(By.xpath("//a[@class = 'gb_b gb_dc']")).click();
        Thread.sleep(1000);
		driver.findElement(By.xpath("//span[.='Drive']")).click();
		WebElement folder = driver.findElement(By.xpath("//div[contains(.,'rocky created')]"));
		Actions action = new Actions(driver);
		action.doubleClick(folder).perform();
	}
}
