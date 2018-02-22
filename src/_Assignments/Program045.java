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

public class Program045 {

	public static void main(String[] args) {
		WebDriver driver = new ChromeDriver();
		driver.get(".\\HTML\\ListBox2.html");
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
			
		//Print ListBox Options with Occurrence and along with Key
		Set<String> allKeys = map.keySet();
		System.out.println("ListBox with Occurrence Count with Key");
		for (String key : allKeys) {
		Integer v = map.get(key);
		System.out.println(key+"-"+v);
		}
		
		//Print ListBox Options with occurrence 
		System.out.println("ListBox with Occurrence Count Only");
		for (String key : allKeys) {
		System.out.println("Lis");
		Integer v = map.get(key);
		System.out.println(key+"-"+v);
		}
		
		//Print ListBox Options as it is with out repeating 
		System.out.println("Unique ListBox Values");
		for (String key : allKeys) {
		Integer v = map.get(key);
		System.out.println(key);
		}
		
		//Print ListBox Options Unique Values 
		System.out.println("Unique ListBox Values");
		for (String key : allKeys) {
		Integer v = map.get(key);
		if (v==1) {
			System.out.println(key);	
		}
		}
		
		//Print ListBox Options Only Duplicates Value
		System.out.println("Duplicate ListBox Values");
		for (String key : allKeys) {
			Integer v = map.get(key);
			if (v>1) {
			System.out.println(key);	
		}
		}

	}

}
