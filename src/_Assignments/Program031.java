package _Assignments;

import java.util.Set;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Program031 {

	public static void main(String[] args) throws InterruptedException
	{
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
