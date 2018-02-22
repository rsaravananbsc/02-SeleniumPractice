package _MultipleElement_Handle;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class HandlingMultipleElements_ListBox_6 {

	public static void main(String[] args) {
		WebDriver driver = new ChromeDriver();
		driver.get("https://www.cleartrip.com/hotels");
		
		
		Select select = new Select(driver.findElement(By.id("travellersOnhome")));
		List<WebElement> allOptions = select.getOptions();
		System.out.println(allOptions.size());
		
		for (int i = 0; i < allOptions.size(); i++) {
			System.out.println(allOptions.get(i).getText());
		}

	}

}
