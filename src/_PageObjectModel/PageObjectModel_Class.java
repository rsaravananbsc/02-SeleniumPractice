package _PageObjectModel;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class PageObjectModel_Class {
	//Declaration-Normal 
//	private WebElement unTB,pwdTB,loBTN;
	
	//Declaration-POM
	@FindBy(id="username") private WebElement unTB1;
	@FindBy(name="pwd") private WebElement pwdTB1;
	@FindBy(id="loginButton") private WebElement loBTN1;
	

	//Initialization- Normal
//	public PageObjectModel_Class(WebDriver driver) {
//		unTB = driver.findElement(By.id("username"));
//		pwdTB = driver.findElement(By.name("pwd"));
//		loBTN = driver.findElement(By.id("loginButton"));
//	}
	
	//Initialization- POM
		public PageObjectModel_Class(WebDriver driver) {
			PageFactory.initElements(driver, this);
		}
		
	//Utilization-Normal
//	public void setUsername(String un)
//	{
//		unTB.sendKeys(un);
//	}
//	public void setPassword(String pwd)
//	{
//		pwdTB.sendKeys(pwd);
//	}
//	public void Login()
//	{
//		loBTN.click();
//	}
	
	
	//Utilization-POM
	public void setUsername(String un)
	{
		unTB1.sendKeys(un);
	}
	public void setPassword(String pwd)
	{
		pwdTB1.sendKeys(pwd);
	}
	public void Login()
	{
		loBTN1.click();
	}
}
