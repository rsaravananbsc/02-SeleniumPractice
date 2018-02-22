package _MultipleElement_Handle;

import java.util.List;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class HandlingMultipleElements_Links_1 {

	public static void main(String[] args) {
		WebDriver driver = new ChromeDriver();
		driver.get("http://localhost/login.do");
		List<WebElement> element = driver.findElements(By.xpath("//a"));
		int count = element.size();
		System.out.println("Count of Links in ActiTime Page:"+count);
		
		int visible=0;
		
		for (int i = 0; i < element.size(); i++) {
			WebElement link = element.get(i);
			if (link.isDisplayed()) { //Display only Visible Element present
				System.out.println(link.getText());
				visible++; //Used to Display only Visible Element 
				//If Element is Hidden, gettext() will not work Even its have text
		}
			System.out.println();
		}
		System.out.println(visible);
		driver.close();

	}

}
