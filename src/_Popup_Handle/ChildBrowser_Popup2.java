package _Popup_Handle;

import java.util.Scanner;
import java.util.Set;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class ChildBrowser_Popup2 {

	public static void main(String[] args) throws InterruptedException {
		
		Scanner sc = new Scanner(System.in);
		String eTitle = sc.nextLine();
		System.out.println("Starting...");
		boolean found = false;
		
		WebDriver driver = new ChromeDriver();
		driver.get("http://localhost/login.do");
		driver.findElement(By.id("icenseLink"));
		
		Set<String> allWHS = driver.getWindowHandles();
		System.out.println("No.of.Browsers:"+allWHS.size());
		
		Thread.sleep(3000);
		
		for (String string : allWHS) {
			driver.switchTo().window(string);
			System.out.println(driver.getTitle());
			
			if (driver.getTitle().equals(eTitle)){
				String msg = "Found; So Close it";
				System.out.println(msg);
				found = true;
				driver.close();
			}
			
		if (!found) {
			System.out.println("Found; So, Close it");
		}
		}

	}

}
