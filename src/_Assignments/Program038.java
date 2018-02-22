package _Assignments;

import java.util.List;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Program038 {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		WebDriver driver = new ChromeDriver();
		driver.get("file:///C:/Users/S0070155/Desktop/Java%20&%20Selenium/HTML%20Pages/CheckBox.html");
		
		String xp = "//input[@type='checkbox']";
		List<WebElement> allCHB = driver.findElements(By.xpath(xp));
		int count = allCHB.size();
		System.out.println(count);
		
		allCHB.get(1).click();
		allCHB.get(3).click();
		
		
		Thread.sleep(2000);
		for (int i = 0; i < count; i++) {
			WebElement ch = allCHB.get(i);
			if (ch.isSelected()) {
				System.out.println("Already Checked");
			} else {
				ch.click();
				driver.close();
			}
		Thread.sleep(1000);
		}

	}

}
