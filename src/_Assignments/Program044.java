package _Assignments;

import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class Program044 {

	public static void main(String[] args) {
		// Handling 2 ListBoxes Comparison to find Duplicates
		WebDriver driver = new ChromeDriver();
		driver.get("D:\\Eclipse-Oxygen\\WorkSpace-CoreJava-Selenium-Projects\\SeleniumPractice\\HTML\\ListBox2.html");
		WebElement list = driver.findElement(By.id("SLV"));
		Select select = new Select(list);
		List<WebElement> allOptions = select.getOptions();
		
		Map<String, Integer> map = new LinkedHashMap<String, Integer>();
		for (int i = 0; i < allOptions.size(); i++) {
			String key = allOptions.get(i).getText();
			if (map.containsKey(key)) {
				Integer v = map.get(key);
				v++;
				map.put(key, v);
			}
			else
			{
				map.put(key, 1);
			}
		}
		
		Set<String> allKeys = map.keySet();
		for (String key : allKeys) {
			Integer v = map.get(key);
			System.out.println(key+"-"+v);
		}
		driver.close();
		
	}

}
