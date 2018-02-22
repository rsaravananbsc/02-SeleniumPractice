package _MultipleElement_Handle;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class HandlingMultipleElements_ListBox_5 {

	public static void main(String[] args) {
		WebDriver driver = new ChromeDriver();
		driver.get("https://www.cleartrip.com/hotels");
		
		WebElement Tlist = driver.findElement(By.id("travellersOnhome"));
		Select select = new Select(Tlist);
		select.selectByIndex(2);	

	}

}
