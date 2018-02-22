package _Assignments;

import java.util.List;
import java.util.Scanner;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Program036 {

	public static void main(String[] args) throws InterruptedException {
		WebDriver driver = new ChromeDriver();
		driver.get("https://google.com");
		 
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the Search Keyword:"); 
		String str=sc.nextLine();
		 
		driver.findElement(By.id("lst-ib")).sendKeys(str);
		Thread.sleep(2000);
		
		String xp = "//div[contains(text(),'"+str+"')]";
		List<WebElement> allAST = driver.findElements(By.xpath(xp));
		System.out.println(allAST.size());
			
		//Display all the AutoSuggestion options
		for (WebElement webElement : allAST) {
			System.out.println(webElement.getText());
		}
		
//		//Click on First Index of value in AutoSuggestion
//		allAST.get(0).click();

	}

}
