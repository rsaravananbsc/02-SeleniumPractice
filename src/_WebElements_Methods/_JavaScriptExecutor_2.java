package _WebElements_Methods;

import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class _JavaScriptExecutor_2 {

	public static void main(String[] args) 
	{
		WebDriver driver = new ChromeDriver();
		driver.get("http://localhost/license.jsp;jsessionid=papbue0wc8un");
		JavascriptExecutor j1 = (JavascriptExecutor)driver;
		
		//Scrolling Down Web-Page
			for (int i = 1; i <=5; i++) {
					j1.executeScript("window.scrollBy(0,500)");
				}
				
		//Scrolling UP Web-Page
			for (int i = 1; i <=5; i++) {
					j1.executeScript("window.scrollBy(0,-500)");
				}

	}

}
