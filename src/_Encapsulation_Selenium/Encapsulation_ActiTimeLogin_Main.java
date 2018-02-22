package _Encapsulation_Selenium;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Encapsulation_ActiTimeLogin_Main {
public static void main(String[] args) {
	
	WebDriver driver = new ChromeDriver();
	driver.get("http://localhost:8080/login.do");
	Encapsulation_ActiTimeLogin_Class ATL = new Encapsulation_ActiTimeLogin_Class(driver);
	ATL.setUsername(); 
	ATL.setPassword();
	ATL.Login();
}
}
