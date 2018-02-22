package _Assignments;

import java.io.File;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Program028 {

	public static void main(String[] args) throws InterruptedException {
		
		File f = new File("C:\\Users\\S0070155\\Pictures\\Saved Pictures\\123.jpg");
		String path = f.getAbsolutePath();
		System.out.println(path);
		
		
		WebDriver driver = new ChromeDriver();
		driver.get("http://localhost/login.do");
		driver.findElement(By.xpath("//input[@id='username']")).sendKeys("admin");
		driver.findElement(By.xpath("//input[@name='pwd']")).sendKeys("manager");
		driver.findElement(By.xpath("//a[@id='loginButton']")).click();
		
		Thread.sleep(2000);
		driver.findElement(By.xpath("//div[@class='popup_menu_icon warning_icon']")).click();
		Thread.sleep(1000);
		driver.findElement(By.xpath("//a[text()='Logo & Color Scheme']")).click();
		
		driver.findElement(By.xpath("//label[@for='uploadNewLogoOption']")).click();
		
		WebElement uploadbtn = driver.findElement(By.className("inputChooseFile"));
		
		uploadbtn.sendKeys(path);
		
		Thread.sleep(3000);
		driver.findElement(By.id("FormModifiedDivButton")).click();
		
//		driver.close();

	}

}
