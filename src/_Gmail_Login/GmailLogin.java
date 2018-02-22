package _Gmail_Login;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class GmailLogin
{
	static
	{
		System.setProperty("webdriver.chrome.driver", "./Drivers/chromedriver.exe");
	}
	public static void main(String[] args) throws InterruptedException 
	{
		WebDriver driver = new ChromeDriver();
		driver.get("https://www.gmail.com");
		Thread.sleep(1000);
		driver.findElement(By.xpath("//input[@id= 'identifierId']")).sendKeys("Enter Your UserName");
		Thread.sleep(1000);
		driver.findElement(By.xpath("//span[text()='Next']")).click();
		Thread.sleep(2000);
		driver.findElement(By.xpath("//input[@class = 'whsOnd zHQkBf']")).sendKeys("Enter Your Password");
		Thread.sleep(1000);
		driver.findElement(By.xpath("//span[text()='Next']")).click();
		Thread.sleep(5000);
		
		driver.findElement(By.xpath("//span[@class='gb_bb gbii']")).click();
		Thread.sleep(3000);
	    driver.findElement(By.id("gb_71")).click(); 
		System.out.println("GMAIL LOGGED OUT SUCCESSFULLY");
		driver.close();
	}	
}
