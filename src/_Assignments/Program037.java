package _Assignments;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Program037 {

	public static void main(String[] args) throws InterruptedException {
		WebDriver driver = new ChromeDriver();
		driver.get("https://mail.google.com/mail/u/0/#inbox");
		
		driver.findElement(By.id("identifierId")).sendKeys("rsaravananbsc@gmail.com");
		driver.findElement(By.xpath("//span[contains(text(),'Next')]")).click();
		Thread.sleep(1000);
		driver.findElement(By.xpath("//input[@type='password']")).sendKeys("AquaDeVida@99");
		driver.findElement(By.xpath("//span[contains(text(),'Next')]")).click();
		Thread.sleep(4000);
		driver.findElement(By.xpath("//div[@class='T-Jo-auh']")).click();
	}

}
