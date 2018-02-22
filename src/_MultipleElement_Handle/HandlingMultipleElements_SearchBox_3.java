package _MultipleElement_Handle;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class HandlingMultipleElements_SearchBox_3 {

	public static void main(String[] args) throws InterruptedException {
		WebDriver driver = new ChromeDriver();
		driver.get("http://yahoo.com");
		driver.findElement(By.id("uh-search-box")).sendKeys("love");
		
		Thread.sleep(1000);
		
		List<WebElement> searchlist = driver.findElements(By.xpath("//div[contains(text(),'love')]"));
		System.out.println(searchlist.size());
		
		for (int i = 0; i < searchlist.size(); i++) {
			WebElement allOptions = searchlist.get(i);
			System.out.println(allOptions.getText());
		}
		
	}

}
