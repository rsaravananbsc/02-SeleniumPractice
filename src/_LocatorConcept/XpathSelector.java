package _LocatorConcept;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class XpathSelector 
{
	public static void main(String[] args) throws InterruptedException 
	{
		WebDriver driver = new ChromeDriver();
		
		driver.get("C:\\Users\\S0070155\\Desktop\\Java & Selenium\\HTML Pages\\LoginPage.html");
		
		driver.findElement(By.xpath("./html/body/input[1]")).sendKeys("Saravanannnnnnnnnnnnnnnnnnnnnnnnnnnnnnnnnnnnnnn ");
		driver.findElement(By.xpath("/html/body/input[2]")).sendKeys("Rajamanickam");
		driver.findElement(By.xpath("/html/body/input")).sendKeys("R");
		
		//Absolute Xpath - Providing Full xpath Address to find a Element.
		
		driver.findElement(By.xpath("./html/body/div/input")).sendKeys("Rajesh"); //Selecting All input Boxes but Filling data in First matched InputBox
		Thread.sleep(2000);
		
		driver.findElement(By.xpath("./html/body/div[1]/input[1]")).sendKeys("Test");
		driver.findElement(By.xpath("./html/body/div[1]/input[2]")).sendKeys("Test");
		driver.findElement(By.xpath("./html/body/div[2]/input[1]")).sendKeys("Test");
		driver.findElement(By.xpath("./html/body/div[2]/input[2]")).sendKeys("Test");
		driver.findElement(By.xpath("./html/body/div[1]/input[1]|./html/body/div[2]/input[2]")).sendKeys("NO TEST");
		
		//Relative Xpath - Providing partial path address to find a element.
		
		driver.findElement(By.xpath("//div[1]/input[1]")).sendKeys("admin");
		driver.findElement(By.xpath("//div[1]/input[2]")).sendKeys("admin");
		driver.findElement(By.xpath("//div[2]/input[1]")).sendKeys("admin");
		driver.findElement(By.xpath("//div[2]/input[2]")).sendKeys("admin");
		
		
		//Xpath By Attributes
		
		driver.findElement(By.xpath("//input[@value='B']")).sendKeys("MANAGER");
		
		Thread.sleep(6000);
		driver.close();
		
		
		
	}
}
