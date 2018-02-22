package _Assignments;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Program034 {

	public static void main(String[] args) {
		WebDriver driver = new ChromeDriver();
		 driver.get("http://google.com");
		 List<WebElement> element = driver.findElements(By.xpath("//a"));
		 int count = element.size();
		 System.out.println("Count of Links in ActiTime Page:"+count);
		 
		
		 for (int i = 0; i <= element.size(); i++) {
			WebElement link = element.get(i);
			System.out.println();
		}

	}

}
