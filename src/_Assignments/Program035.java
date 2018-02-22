package _Assignments;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Program035 {

	public static void main(String[] args) {
		WebDriver driver = new ChromeDriver();
		driver.get("http://localhost/login.do");
		List<WebElement> element = driver.findElements(By.xpath("//a"));
		int count = element.size();
		System.out.println("Count of Links in ActiTime Page:"+count);
		
		for (WebElement webElement : element) { //Display all the URL details of Present Links
			System.out.println(webElement.getAttribute("href"));
		}
		
		driver.close();

	}

}
