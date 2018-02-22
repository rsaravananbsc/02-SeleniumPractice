package _Assignments;

import java.util.Collections;
import java.util.HashSet;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class Program043 {

	public static void main(String[] args) {
		// Handling 2 ListBoxes Comparison to find Duplicates
		WebDriver driver = new ChromeDriver();
		driver.get("D:\\Eclipse-Oxygen\\WorkSpace-CoreJava-Selenium-Projects\\SeleniumPractice\\HTML\\ListBox2.html");
		WebElement list = driver.findElement(By.id("SLV"));
		Select select = new Select(list);
		List<WebElement> allOptions = select.getOptions();
		
		HashSet<String> allText = new HashSet<String>();
		for (int i = 0; i < allOptions.size(); i++) {
			String text = allOptions.get(i).getText();
			allText.add(text);
		}
		
		if (allOptions.size()==allText.size()) { // Handling 2 ListBoxes Comparison to find Duplicates
			System.out.println("NO Duplicates Found");
		} else {
			System.out.println("Duplicates Found");
		}
		
		System.out.println(allOptions.size());
		System.out.println(allText.size());
		
		driver.close();
		
	}

}
