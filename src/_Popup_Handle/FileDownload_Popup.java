package _Popup_Handle;

import java.awt.AWTException;
import java.awt.Robot;
import java.awt.event.KeyEvent;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class FileDownload_Popup {

	public static void main(String[] args) throws AWTException, InterruptedException 
	{
//		No Need to Handle FileDownload in ChromeBroswer	
//		WebDriver driver = new ChromeDriver();
//		driver.get("http://www.seleniumhq.org/download/");
//		String xp = "//td[.='Java']/../td[4]/a";
//		driver.findElement(By.xpath(xp)).click();
		
//		OR
		
		WebDriver driver = new FirefoxDriver();
		driver.get("http://www.seleniumhq.org/download/");
		String xp = "//td[.='Java']/../td[4]/a";
		driver.findElement(By.xpath(xp)).click();
		Thread.sleep(2000);
		Robot r = new Robot();
		r.keyPress(KeyEvent.VK_DOWN);
		Thread.sleep(1000);
		r.keyPress(KeyEvent.VK_ENTER);

	}

}
