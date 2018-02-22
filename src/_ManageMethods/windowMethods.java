package _ManageMethods;

import org.openqa.selenium.Dimension;
import org.openqa.selenium.Point;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class windowMethods 
{
	static
	{
		System.setProperty("webdriver.chrome.driver", "./Drivers/chromedriver.exe");
	}
	public static void main(String[] args) throws InterruptedException 
	{
		WebDriver driver = new ChromeDriver();
		driver.get("http://localhost/login.do");
		
		Point pos = driver.manage().window().getPosition();
		System.out.println("Browser Current Position:"+pos);
		
		Dimension size = driver.manage().window().getSize();
		System.out.println("Browser Current Dimention"+size);
		
		driver.manage().window().setSize(new Dimension(200,300));
		
		size = driver.manage().window().getSize();
		
		driver.manage().window().setPosition(new Point(50,60));
		
		pos = driver.manage().window().getPosition();
		
		System.out.println("Post Chnage Browser Position"+pos);
		System.out.println("Post Chnage Browser Size"+size);
		
		driver.manage().window().maximize();
		
		driver.manage().window().fullscreen();

	
	}

}
