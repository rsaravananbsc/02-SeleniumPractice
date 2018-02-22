package _ActiTime_Login;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Login 
{
	public static void main(String[] args) 
	{
		WebDriver driver = new ChromeDriver();
		driver.get("http://localhost/login.do");
		try {
			Thread.sleep(8000);
		} catch (InterruptedException e) {
			e.printStackTrace();
		}
		verifyTitle(driver, "actiTIME - Enter Time-Track");
		
		WebElement chkbox = driver.findElement(By.name("remember"));
		chkbox.click();
		if(chkbox.isSelected())
			System.out.println("PASS: CheckBox is Selected");
		else
		System.out.println("FAIL: CheckBox is not Selected");
		
	}

	private static void verifyTitle(WebDriver driver, String eTitle) 
	{
		System.out.println("Expected Page:"+eTitle);
		String aTitle=driver.getTitle();
		System.out.println("Actual Page:"+aTitle);
		if(aTitle.equals(eTitle))
		{
			System.out.println("PASS: Expected Page is Displayed");
		}
		else
		{
			System.out.println("FAIL: Expected Page Not is Displayed");
		}
		
	}

}
