package _MultipleElement_Handle;

import java.util.List;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class HandlingMultipleElements_Links_2 {

	public static void main(String[] args) {
		 WebDriver driver = new ChromeDriver();
		 driver.get("http://localhost/login.do");
		 List<WebElement> element = driver.findElements(By.xpath("//a"));
		 int count = element.size();
		 System.out.println("Count of Links in ActiTime Page:"+count);
		 
		
		 for (int i = 0; i < element.size(); i++) { //Display all the Links Present
			@SuppressWarnings("unused")
			WebElement link = element.get(i);
			System.out.println();
		 }
		 driver.close();
		 
		 
	}

}
