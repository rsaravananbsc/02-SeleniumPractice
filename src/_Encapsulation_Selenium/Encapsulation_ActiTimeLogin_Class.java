package _Encapsulation_Selenium;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class Encapsulation_ActiTimeLogin_Class {
	//Declaration 
	private WebElement unTB,pwdTB,loBTN;

	//Initialization 
	public Encapsulation_ActiTimeLogin_Class(WebDriver driver) {
		super();
		// TODO Auto-generated constructor stub
		unTB = driver.findElement(By.id("username"));
		pwdTB = driver.findElement(By.name("pwd"));
		loBTN = driver.findElement(By.id("loginButton"));
	}
	//Utilization
	public void setUsername()
	{
		unTB.sendKeys("admin");
	}
	
	public void setPassword()
	{
		pwdTB.sendKeys("manager");
	}
	
	public void Login()
	{
		loBTN.click();
	}
}
