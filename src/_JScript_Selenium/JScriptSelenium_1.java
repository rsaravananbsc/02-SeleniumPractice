package _JScript_Selenium;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class JScriptSelenium_1 {

	public static void main(String[] args) throws InterruptedException 
	{
		WebDriver driver = new ChromeDriver();
		driver.get("http://localhost/login.do");
		JavascriptExecutor j = (JavascriptExecutor)driver;
		
		
		WebElement username = driver.findElement(By.id("username"));
		j.executeScript("arguments[0].value=arguments[1]",username,"admin");
		Thread.sleep(2000);
		
		WebElement password = driver.findElement(By.xpath("//input[@name='pwd']"));
		j.executeScript("arguments[0].value=arguments[1]",password,"manager");
		Thread.sleep(2000);
		
		WebElement login = driver.findElement(By.xpath("//div[.='Login ']"));
		j.executeScript("arguments[0].click()",login);
		
	}

}
