package _Popup_Handle;

import java.util.Date;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class HiddenDriven_Popup_1
{
	public static void main(String[] args) throws InterruptedException 
	{
		Date d = new Date();
		String str = d.toString();
		System.out.println(str);
		String[]a = str.split(" ");
		String today= a[2];
		System.out.println(today);
		
		WebDriver driver = new ChromeDriver();
		driver.get("https://www.cleartrip.com/");
		Thread.sleep(2000);
		driver.findElement(By.linkText(today)).click();
	}
}
