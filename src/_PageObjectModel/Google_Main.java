package _PageObjectModel;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Google_Main {

	public static void main(String[] args) {
		WebDriver driver = new ChromeDriver();
		driver.get("http://google.com");
		Google_Class GC = new Google_Class(driver);
		GC.getLinkCount();
		driver.close();
	}

}
