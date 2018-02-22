package _Popup_Handle;

import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class ChildBrowser_Popup1 {

	public static void main(String[] args) throws InterruptedException 
	{
		WebDriver driver = new ChromeDriver();
		driver.get("http://localhost/login.do");
		driver.findElement(By.id("icenseLink"));
		
		Set<String> allWHS = driver.getWindowHandles();
		System.out.println("No.of.Browsers:"+allWHS.size());
		
		Thread.sleep(3000);
		
		for (String string : allWHS) {
			driver.switchTo().window(string);
			System.out.println(driver.getTitle());
			if (driver.getTitle().equals("actiTIME License Agreement")){
				driver.close();
			}
			
		}

	}

}
