package _Popup_Handle;

import java.util.Set;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class ChildBrowser_Popup {

	public static void main(String[] args) throws InterruptedException 
	{
		
		//SetCollections Concept
//		Set<String> s = new HashSet<String>();
//		System.out.println(s.size());
//		s.add("Bhanu");
//		s.add("Praksh");
//		s.add("Bhanu");
//		System.out.println(s.size());
//		
//		for (String string : s) {
//			System.out.println(string);
//		}
		
		WebDriver driver = new ChromeDriver();
		driver.get("http://naukri.com");
		Set<String> allWHS = driver.getWindowHandles();
		System.out.println("No.of.Browsers:"+allWHS.size());
		
		Thread.sleep(3000);
		
		//Closing all the windows from Parent to Child
		for (String string : allWHS) {
			driver.switchTo().window(string);
			driver.close();
		}

	}
}
