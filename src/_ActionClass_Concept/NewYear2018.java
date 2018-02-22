package _ActionClass_Concept;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class NewYear2018 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println("You are gonna became a Test Engineer This Year");
		
		WebDriver driver = new ChromeDriver();
		WebDriver driver1 = new FirefoxDriver();
		
		driver.close();
		driver1.close();
		
	}
}
