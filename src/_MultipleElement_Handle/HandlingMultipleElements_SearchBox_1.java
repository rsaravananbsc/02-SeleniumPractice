package _MultipleElement_Handle;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class HandlingMultipleElements_SearchBox_1 {

	public static void main(String[] args) throws InterruptedException {
		//Handle AutoSuggestion menu
		WebDriver driver = new ChromeDriver();
		driver.get("http://google.com");
		driver.findElement(By.id("lst-ib")).sendKeys("Java");
		Thread.sleep(2000);
		
		//Find address of all AutoSuggestions
		String xp = "//div[contains(text(),'java')]";
		List<WebElement> allAST = driver.findElements(By.xpath(xp));
		System.out.println(allAST.size());
		
		//Display all the AutoSuggestion options
		for (WebElement webElement : allAST) {
			System.out.println(webElement.getText());
		}
		
		//Click on First Index of value in AutoSuggestion
		allAST.get(0).click();
		

	}

}
