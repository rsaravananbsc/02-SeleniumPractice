package _Assignments;

import java.awt.AWTException;
import java.awt.Robot;
import java.awt.event.KeyEvent;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class Program030 {

	public static void main(String[] args) throws InterruptedException, AWTException {
		WebDriver driver = new FirefoxDriver();
		driver.get("http://localhost/login.do");
		driver.findElement(By.xpath("//input[@id='username']")).sendKeys("admin");
		driver.findElement(By.xpath("//input[@name='pwd']")).sendKeys("manager");
		driver.findElement(By.xpath("//a[@id='loginButton']")).click();
		
		Thread.sleep(3000);
		driver.findElement(By.xpath("//div[text()='REPORTS']")).click();
		Thread.sleep(2000);
		driver.findElement(By.xpath("//div[text()='Monthly Team Performance']")).click();
		driver.findElement(By.xpath("//td[@class='headerFooterCell clickableCell exportToCSV cellWithBorder']")).click();

		Robot r = new Robot();
		r.keyPress(KeyEvent.VK_DOWN);
		r.keyPress(KeyEvent.VK_ENTER);
		
		driver.close();

	}

}
