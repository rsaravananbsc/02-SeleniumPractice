package _MultipleElement_Handle;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class HandlingMultipleElements_ListBox_7 {

	public static void main(String[] args) {
		// Handling 2 ListBoxes is Sorted or Not.
		WebDriver driver = new ChromeDriver();
		driver.get("D:\\Eclipse-Oxygen\\WorkSpace-CoreJava-Selenium-Projects\\SeleniumPractice\\HTML\\ListBox2.html");
		WebElement list = driver.findElement(By.id("SLV"));
		Select select = new Select(list);
		
		List<WebElement> allOptions = select.getOptions();
		
		ArrayList<String> allText = new ArrayList<String>();
		ArrayList<String> clone = new ArrayList<String>(allText);
		
		for (int i = 0; i < allOptions.size(); i++) {
			String text = allOptions.get(i).getText();
			allText.add(text);
		}
		
		for (String string1 : allText) {
			System.out.println(string1);
		}
		
		Collections.sort(allText);
		
		System.out.println("-------------------");
		
		for (String string2 : clone) {
			System.out.println(string2);
		}
		
		System.out.println("-------------------");
		
		if (allText.equals(clone)) {
			System.out.println("List Box is Sorted");
		} else {
			System.out.println("List Box is Not Sorted");
		}
		
		driver.close();
		
	}

}
