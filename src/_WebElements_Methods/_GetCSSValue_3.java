package _WebElements_Methods;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class _GetCSSValue_3 
{
	public static void main(String[] args) throws InterruptedException 
	{
		WebDriver driver = new ChromeDriver();
		driver.get("http://localhost/login.do");
		verifyTitle(driver, "actiTIME - Login");
		driver.findElement(By.xpath("//input[@id='username']")).sendKeys("admin");
		driver.findElement(By.xpath("//input[@name='pwd']")).sendKeys("manager");
		driver.findElement(By.xpath("//a[@id='loginButton']")).click();
		
		verifyTitle(driver, "actiTIME - Enter Time-Track");
		driver.findElement(By.className("content tasks")).click();
		verifyTitle(driver, "actiTIME - Task List");
		driver.findElement(By.xpath("//div[.='Add New']")).click();
		driver.findElement(By.xpath("//div[.='+ New Customer']")).click();	
		driver.findElement(By.xpath("//input[@id='customerLightBox_nameField']")).sendKeys("Rocky");
		Thread.sleep(1000);
		driver.findElement(By.xpath("//textarea[@class='inputFieldWithPlaceholder']")).sendKeys("gtfghgvgcfbhvbggv");
		driver.findElement(By.xpath("//span[.='Create Customer']")).click();
	
		/*WebElement msg = driver.findElement(By.xpath("//div[.='All Customers']"));
		String rgb = msg.getCssValue("color");
		String haxa = Color.fromString(rgb).asHex();
		System.out.println(haxa);*/

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
