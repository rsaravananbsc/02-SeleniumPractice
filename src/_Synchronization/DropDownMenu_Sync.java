package _Synchronization;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.ExpectedCondition;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class DropDownMenu_Sync {

	public static void main(String[] args) {
		WebDriver driver = new ChromeDriver();
		driver.get("http://www.istqb.in/");
		
		Actions action = new Actions(driver);
		WebDriverWait wait = new WebDriverWait(driver, 10);
		
		WebElement element = driver.findElement(By.xpath("//span[text()='ABOUT US']"));
		WebElement element1 = driver.findElement(By.xpath("//span[text()='TRAINING PROVIDERS']"));
		WebElement element2 = driver.findElement(By.xpath("//span[text()='GET ACCREDITED']"));
		
		action.moveToElement(element).perform();
		wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//span[text()='ABOUT US']")));
		action.moveToElement(element1).perform();	
		wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//span[text()='TRAINING PROVIDERS']")));
		action.moveToElement(element2).perform();
		element2.click();
		

	}

}
