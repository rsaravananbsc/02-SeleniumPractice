package _MultipleElement_Handle;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class HandlingMultipleElements_ListBox_1 {

	public static void main(String[] args) {
		WebDriver driver = new ChromeDriver();
		driver.get("http://facebook.com");
		WebElement month = driver.findElement(By.id("month"));
		Select select = new Select(month);
		select.selectByVisibleText("Apr");
	}

}
