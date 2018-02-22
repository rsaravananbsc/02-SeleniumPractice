package _Navigation_Keyevents;

import java.awt.AWTException;
import java.awt.Robot;
import java.awt.event.KeyEvent;

import org.openqa.selenium.Dimension;
import org.openqa.selenium.Point;
import org.openqa.selenium.chrome.ChromeDriver;

public class Program1 {

	static
	{
		System.setProperty("WebDriver.chrome.driver", ".//Drivers//chromedriver.exe");
	}
	public static void main(String[] args) throws InterruptedException, AWTException
	{
		ChromeDriver driver = new ChromeDriver(); //Open Browser
//		
//		Dimension arg0 = new Dimension(200, 300); //Assigning size to Browser
//		driver.manage().window().setSize(arg0);   //Resize Browser 
		
//		Thread.sleep(4000);
//			
//		Point arg1 = new Point(400, 500); //Setting Position to where needs to move Browser
//		driver.manage().window().setPosition(arg1); //Moving Browser
//		
//		Thread.sleep(4000);
//		driver.manage().window().maximize(); //Maximize the Browser 
//		
		Thread.sleep(4000);
		Robot r = new Robot();      //Mouse Pointer Mover Concept.
		 
//		for (int i = 0; i <=100; i=i+10) 
//		{
//		 r.mouseMove(50+i, 100);
//		 Thread.sleep(500);
//		}
		
//		Thread.sleep(4000);
		r.keyPress(KeyEvent.VK_ALT);
		r.keyPress(KeyEvent.VK_SPACE);
		r.keyRelease(KeyEvent.VK_SPACE);
		r.keyRelease(KeyEvent.VK_ALT);
//		Thread.sleep(1000);
		r.keyPress(KeyEvent.VK_N);
		r.keyRelease(KeyEvent.VK_N);
		
//		driver.close(); // Closing Browser
	
	}

}
