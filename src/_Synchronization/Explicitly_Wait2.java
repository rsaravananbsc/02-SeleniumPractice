package _Synchronization;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class Explicitly_Wait2  {

	public static void main(String[] args) {
		
		//How do you handle Sync of FindElement, FindElements without ImplicitWait Method?
		WebDriver driver = new ChromeDriver();
		driver.get("https://demo.actitime.com");
		driver.findElement(By.xpath("//input[@id='username']")).sendKeys("admin");
		driver.findElement(By.xpath("//input[@name='pwd']")).sendKeys("manager");
		driver.findElement(By.xpath("//div[.='Login ']")).click();
		
		WebDriverWait wait = new WebDriverWait(driver, 10);
		wait.until(ExpectedConditions.visibilityOfElementLocated(By.id("logoutLink")));
		
		WebElement link = driver.findElement(By.id("logoutLink"));
		System.out.println(link);		

	}

}
