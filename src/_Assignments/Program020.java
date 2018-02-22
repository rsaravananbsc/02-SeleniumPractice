package _Assignments;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Program020 {

	public static void main(String[] args) throws InterruptedException {
		WebDriver driver = new ChromeDriver();
		driver.get("https://www.zoho.com/in/invoice/login/");
		
		driver.switchTo().frame("zohoiam");
		driver.findElement(By.id("lid")).sendKeys("rsaravananbsc@gmail.com");
		driver.findElement(By.id("pwd")).sendKeys("test@123");
		driver.findElement(By.className("securetxt")).click();
		Thread.sleep(1000);		
		driver.findElement(By.id("submit_but")).click();

	}

}
