package _MultipleElement_Handle;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class HandlingMultipleElements_SearchBox_2 {

	public static void main(String[] args) throws InterruptedException {
		WebDriver driver = new ChromeDriver();
		driver.get("http://google.com");
		driver.findElement(By.id("lst-ib")).sendKeys("love");
		
		Thread.sleep(1000);
		
		String xp = "//div[contains(text(),'love')]";
		List<WebElement> searchlist = driver.findElements(By.xpath(xp));
		int searchlistsize = searchlist.size();
		System.out.println(searchlistsize);
		
		for (int i = 0; i < searchlistsize; i++) {
			WebElement text = searchlist.get(i);
			System.out.println(text.getText());
		}
		
	}

}
