package _Assignments;

import java.awt.AWTException;
import java.awt.Robot;
import java.awt.event.KeyEvent;
import java.util.Set;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Program033 {

	public static void main(String[] args) throws AWTException, InterruptedException {
		
		//Opening NewTab and Enter the URL in that NewTAB
		WebDriver driver = new ChromeDriver();
		Robot r = new Robot();
		r.keyPress(KeyEvent.VK_CONTROL);
		r.keyPress(KeyEvent.VK_T);
		r.keyRelease(KeyEvent.VK_CONTROL);
		
		Thread.sleep(3000);
		
		Set<String> allWHS = driver.getWindowHandles();
		for (String string : allWHS) {
			driver.switchTo().window(string);
		}
		
		driver.get("http://gmail.com");

	}

}
