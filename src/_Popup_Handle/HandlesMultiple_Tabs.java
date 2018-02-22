package _Popup_Handle;

import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class HandlesMultiple_Tabs {

	public static void main(String[] args) {
		//getWindowhandles can Manipulate Tabs & Windows as well. 
		WebDriver driver = new ChromeDriver();
		driver.get("http://localhost/login.do");
		driver.findElement(By.linkText("actiTIME Inc.")).click();
		Set<String> allWHS = driver.getWindowHandles();
		System.out.println(allWHS.size());
		
		for (String string : allWHS) {
			driver.switchTo().window(string);
			System.out.println(driver.getTitle());
		}

	}

}
