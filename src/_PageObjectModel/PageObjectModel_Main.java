package _PageObjectModel;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class PageObjectModel_Main {
public static void main(String[] args) throws InterruptedException {
	
	WebDriver driver = new ChromeDriver();
	driver.get("http://localhost/login.do");
	PageObjectModel_Class POM = new PageObjectModel_Class(driver);
	POM.setUsername("abc"); 
	POM.setPassword("abc");
	POM.Login();
	
	Thread.sleep(2000);
	
	POM.setUsername("admin"); 
	POM.setPassword("manager");
	POM.Login();
	
	driver.close();
}
}
