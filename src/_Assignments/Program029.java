package _Assignments;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Program029 {

	public static void main(String[] args) throws InterruptedException {
		WebDriver driver = new ChromeDriver();
		driver.get("http://localhost/login.do");
		driver.findElement(By.xpath("//input[@id='username']")).sendKeys("admin");
		driver.findElement(By.xpath("//input[@name='pwd']")).sendKeys("manager");
		driver.findElement(By.xpath("//a[@id='loginButton']")).click();
		
		Thread.sleep(3000);
		driver.findElement(By.xpath("//div[text()='REPORTS']")).click();
		Thread.sleep(2000);
		driver.findElement(By.xpath("//div[text()='Monthly Team Performance']")).click();
		driver.findElement(By.xpath("//td[@class='headerFooterCell clickableCell exportToCSV cellWithBorder']")).click();

		driver.close();
	}

}
