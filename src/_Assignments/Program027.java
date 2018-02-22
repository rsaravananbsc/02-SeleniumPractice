package _Assignments;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Program027 {

	public static void main(String[] args) throws InterruptedException {
		WebDriver driver = new ChromeDriver();
		driver.get("http://localhost/login.do");
		driver.findElement(By.xpath("//input[@id='username']")).sendKeys("admin");
		driver.findElement(By.xpath("//input[@name='pwd']")).sendKeys("manager");
		driver.findElement(By.xpath("//a[@id='loginButton']")).click();
		
		Thread.sleep(2000);
		driver.findElement(By.xpath("//a[@class='content tasks']")).click();
		driver.findElement(By.xpath("//td[@class='selection']")).click();
		Thread.sleep(2000);
		driver.findElement(By.xpath("//span[text()='Delete']")).click();
		Thread.sleep(2000);
		String msg = driver.findElement(By.xpath("//div[@class='operationConfirmDialogInnerContainer']")).getText();
		System.out.println(msg);
		driver.findElement(By.id("deleteTaskPopup_deleteConfirm_cancelBtn")).click();
		driver.close();
	}

}
