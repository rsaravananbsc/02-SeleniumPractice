package _Popup_Handle;

import java.awt.AWTException;
import java.awt.Robot;
import java.awt.event.KeyEvent;
import java.io.IOException;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class WindowPopup {

	public static void main(String[] args) throws AWTException, IOException, InterruptedException {
		WebDriver driver = new FirefoxDriver();
		Robot r = new Robot();
		r.keyPress(KeyEvent.VK_CONTROL);
		r.keyPress(KeyEvent.VK_P);
		r.keyRelease(KeyEvent.VK_CONTROL);
		r.keyPress(KeyEvent.VK_ENTER);
		//--------------------------------------
		Runtime.getRuntime().exec(".\\AutoITScripts\\Print");
		driver.close();
	}

}
