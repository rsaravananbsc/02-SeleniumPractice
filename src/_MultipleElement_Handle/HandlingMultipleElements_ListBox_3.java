package _MultipleElement_Handle;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class HandlingMultipleElements_ListBox_3 {

	public static void main(String[] args) {
		WebDriver driver = new ChromeDriver();
		driver.get("file:///C:/Users/S0070155/Desktop/Java%20&%20Selenium/HTML%20Pages/ListBox.html");
		
		WebElement month = driver.findElement(By.id("month"));
		Select select = new Select(month);
		List<WebElement> allOptions = select.getOptions();
		int count = allOptions.size();
		System.out.println(count);
		
		for (int i = 0; i < count; i++) {
			WebElement option = allOptions.get(i);
			String text = option.getText();
			System.out.println(text);
		}
		driver.close();
	}

}
