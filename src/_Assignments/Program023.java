package _Assignments;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Program023 {

	public static void main(String[] args) throws InterruptedException {
		WebDriver driver = new ChromeDriver();
		driver.get("http://localhost/login.do");
		driver.findElement(By.xpath("//input[@id='username']")).sendKeys("admin");
		driver.findElement(By.xpath("//input[@name='pwd']")).sendKeys("manager");
		driver.findElement(By.xpath("//a[@id='loginButton']")).click();
		
		Thread.sleep(2000);
		driver.findElement(By.xpath("//a[@class='content tasks']")).click();
		driver.findElement(By.xpath("//div[.='Add New']")).click();
		driver.findElement(By.xpath("//div[.='+ New Customer']")).click();	
		
		Thread.sleep(2000);
		driver.findElement(By.xpath("//input[@id='customerLightBox_nameField']")).sendKeys("Rocky");
		driver.findElement(By.xpath("//textarea[@id='customerLightBox_descriptionField']")).sendKeys("gtfghgvgcfbhvbggv");
		driver.findElement(By.id("customerLightBox_cancelBtn")).click();
		
		Alert alert = driver.switchTo().alert();
		String msg = alert.getText();
		System.out.println(msg);
		alert.accept();
		
		driver.close();
	}

}
