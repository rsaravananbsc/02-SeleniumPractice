package _Navigation_Keyevents;

import java.awt.AWTException;
import java.awt.Robot;
import java.awt.event.KeyEvent;
import java.util.ArrayList;

import org.openqa.selenium.chrome.ChromeDriver;

public class Program3 
{
	public static void main(String[] args) throws AWTException 
	{
		ChromeDriver driver = new ChromeDriver();
		
		driver.get("C:\\Users\\S0070155\\Desktop\\Java & Selenium\\HTML Pages\\DOC-20171027-WA000.html");
		driver.navigate().to("C:\\\\Users\\\\S0070155\\\\Desktop\\\\Java & Selenium\\\\HTML Pages\\\\DOC-20171027-WA001.html");
		driver.navigate().to("C:\\\\Users\\\\S0070155\\\\Desktop\\\\Java & Selenium\\\\HTML Pages\\\\DOC-20171027-WA002.html");
		
		Robot r = new Robot();
		r.keyPress(KeyEvent.VK_CONTROL);
		r.keyPress(KeyEvent.VK_T);
		r.keyRelease(KeyEvent.VK_T);
		r.keyRelease(KeyEvent.VK_CONTROL);
	}
}